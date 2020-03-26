package ru.job4j.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.job4j.R;
import ru.job4j.adapters.EmployeeListAdapter;
import ru.job4j.store.Employee;
import ru.job4j.store.EmployeeStore;

public class EmployeeListFragment extends Fragment {
    private int code;


    public EmployeeListFragment(int code) {
        this.code = code;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.position_recycler_view, container, false);
        updateUI(view);
        return view;
    }

    public void updateUI(View view) {
        List<Employee> employees = new ArrayList<>();
        for (Employee em : EmployeeStore.EMPLOYEES) {
            if (em.getPosition().getCode() == this.code) {
                employees.add(em);
            }
        }
        RecyclerView recycler = view.findViewById(R.id.positions);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler.setAdapter(new EmployeeListAdapter(employees, getActivity()));
    }

}
