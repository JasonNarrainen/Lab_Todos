package com.todos.todos;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    private ArrayList<Task> mDataset;


    //Contenant pour toutes les composants du layout
    //Utile pour les layout complexes
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView nameTV;
        TextView dateTv;
        CheckBox completedCheckbox;


        public ViewHolder(View v) {
            super(v);
            nameTV = v.findViewById(R.id.name_text_view);
            dateTv = v.findViewById(R.id.date_text_view);
            completedCheckbox = v.findViewById(R.id.completed_checkbox);
        }
    }

    // Constructeur
    public TaskAdapter(ArrayList<Task> myDataset) {
        mDataset = myDataset;
    }

    // Création de la vue
    @Override
    public TaskAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_task, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Assignation des valeurs de la tâches au composants
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Task task = mDataset.get(position);
        String date = new SimpleDateFormat("yyyy-MM-dd").format(task.getDueDate());
        System.out.println(date);

        holder.nameTV.setText(task.getName());
        holder.dateTv.setText(date);
        holder.completedCheckbox.setChecked(task.getCompleted());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
