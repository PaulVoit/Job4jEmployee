package ru.job4j.adapters;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.job4j.R;
import ru.job4j.fragments.EmployeeDetailsFragment;
import ru.job4j.fragments.EmployeeListFragment;
import ru.job4j.store.Employee;
import ru.job4j.store.Position;


public class EmployeeListAdapter extends RecyclerView.Adapter<EmployeeListAdapter.EmployeeListHolder> {
    private final List<Employee> items;
    private FragmentActivity activity;

    public EmployeeListAdapter(List<Employee> items, FragmentActivity activity) {
        this.items = items;
        this.activity = activity;
    }

    public class EmployeeListHolder extends RecyclerView.ViewHolder {
        private View view;
        private String name;

        public EmployeeListHolder(@NonNull View view) {
            super(view);
            this.view = itemView;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    @NonNull
    @Override
    public EmployeeListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.position_item, parent, false);
        return new EmployeeListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeListHolder holder, int position) {
        TextView textView = holder.view.findViewById(R.id.item_position_text);
        textView.setText(items.get(position).getName() + ", " + items.get(position).getSurname());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrg(items.get(position).getName(), items.get(position).getSurname());
                Log.d("clicked", "staaaak: ");
            }
        });
    }

    private void loadFrg(String name, String sureName) throws RuntimeException {

        EmployeeDetailsFragment fragment = new EmployeeDetailsFragment(name, sureName);

        FragmentManager fm = activity.getSupportFragmentManager();
        fm.beginTransaction()
                .addToBackStack("stack?")
                .replace(R.id.content, fragment)
                .commit();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
