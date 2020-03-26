package ru.job4j.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ru.job4j.R;
import ru.job4j.store.Employee;
import ru.job4j.store.EmployeeStore;

public class EmployeeDetailsFragment extends Fragment {
    private String name;
    private String sureName;

    public EmployeeDetailsFragment(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.employee_details_item, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        Employee employee = null;
        for (Employee em : EmployeeStore.EMPLOYEES) {
            if (em.getName().equals(this.name) && em.getSurname().equals(this.sureName)) {
                employee = em;
                break;
            }
        }
        ((TextView) (view.findViewById(R.id.name))).setText(employee.getName());
        ((TextView) (view.findViewById(R.id.surname))).setText(employee.getSurname());
        ((TextView) (view.findViewById(R.id.position))).setText(employee.getPosition().getPositionName());
        ((TextView) (view.findViewById(R.id.birthday))).setText(employee.getBirthday().toString());
        ((TextView) (view.findViewById(R.id.photoURL))).setText(employee.getPhotoURL());
    }
}