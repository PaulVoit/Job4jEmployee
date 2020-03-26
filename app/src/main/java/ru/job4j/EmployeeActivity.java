package ru.job4j;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import ru.job4j.fragments.EmployeeListFragment;
import ru.job4j.fragments.PositionListFragment;


public class EmployeeActivity extends AppCompatActivity implements PositionListFragment.PositionSelect {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.host_frg);
        FragmentManager fm = getSupportFragmentManager();
        Fragment positionListFragment = loadFrg();
        if (fm.findFragmentById(R.id.content) == null) {
            fm.beginTransaction()
                    .replace(R.id.content, positionListFragment)
                    .commit();
        }
    }

    public Fragment loadFrg() {
       return PositionListFragment.of(getIntent().getIntExtra(PositionListFragment.POS, 0));
    }

    @Override
    public void positionSelected(int code) {
        EmployeeListFragment fragment = new EmployeeListFragment(code);
        FragmentManager fm = this.getSupportFragmentManager();
        fm.beginTransaction()
                .addToBackStack("stack")
                .replace(R.id.content, fragment)
                .commit();
    }
}