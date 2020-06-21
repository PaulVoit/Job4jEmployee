package ru.job4j.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import ru.job4j.EmployeeActivity;
import ru.job4j.R;
import ru.job4j.adapters.PositionListAdapter;
import ru.job4j.store.PositionStore;

public class PositionListFragment extends Fragment {

    private RecyclerView recycler;
    public static final String POS = "position";
    private PositionSelect positionSelect;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.position_recycler_view, container, false);
        recycler = view.findViewById(R.id.positions);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        updateUI(view);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.position_list, menu);
    }

    public static PositionListFragment of(int index) {
        PositionListFragment fragment = new PositionListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(PositionListFragment.POS, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    public interface PositionSelect {
        void positionSelected(int code);
    }

    private void updateUI(View view) {
        recycler.setAdapter(new PositionListAdapter(PositionStore.POSITIONS, positionSelect));
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.positionSelect = (PositionSelect) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.positionSelect = null;
    }
}
