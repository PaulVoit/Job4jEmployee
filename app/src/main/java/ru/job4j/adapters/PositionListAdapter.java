package ru.job4j.adapters;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ru.job4j.EmployeeActivity;
import ru.job4j.fragments.EmployeeListFragment;
import ru.job4j.R;
import ru.job4j.fragments.PositionListFragment;
import ru.job4j.store.Position;

public class PositionListAdapter extends RecyclerView.Adapter<PositionListAdapter.PositionHolder> {

    private final List<Position> items;
    private PositionListFragment.PositionSelect positionSelect;

    public PositionListAdapter(List<Position> items, PositionListFragment.PositionSelect positionSelect) {
        this.items = items;
        this.positionSelect = positionSelect;
    }

    public class PositionHolder extends RecyclerView.ViewHolder {
        private View view;

        public PositionHolder(@NonNull View view) {
            super(view);
            this.view = itemView;
        }
    }

    @NonNull
    @Override
    public PositionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.position_item, parent, false);
        return new PositionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PositionHolder holder, int position) {
        final String item = items.get(position).getPositionName();
        ImageView imageView = holder.view.findViewById(R.id.image_of_employee);
        Picasso.get().load(items.get(position).getPositionImage()).fit().into(imageView);
        TextView textView = holder.view.findViewById(R.id.item_position_text);
        textView.setText(item);
        textView.setOnClickListener(v -> loadFrg(items.get(position).getCode()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    private void loadFrg(int code) throws RuntimeException {
        positionSelect.positionSelected(code);
    }
}
