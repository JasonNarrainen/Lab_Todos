package com.todos.todos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

public class ToDosActivity extends AppCompatActivity {

    // Déclaration d'attributs
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter taskAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Relie l'activité avec un layout
        setContentView(R.layout.activity_todos);

        // Assigne le composant de la vue a l'object mRecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Utiliser ceci lorsque les changements du contenue
        // n'affectera pas la taille des items
        mRecyclerView.setHasFixedSize(true);

        // Utiliser un  linear layout manager pour
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Déclaration de la liste
        ArrayList<Task> taskArrayList = new ArrayList<>();
        taskArrayList.add(new Task("Read first chapter of GoT", false, new Date("11/1/2017")));
        taskArrayList.add(new Task("Do laundry", true, new Date("11/1/2017")));
        taskArrayList.add(new Task("Wash dishes", false, new Date("11/1/2017")));
        taskArrayList.add(new Task("Take the dog out", true, new Date("11/1/2017")));
        taskArrayList.add(new Task("Take out the trash", false, new Date("11/1/2017")));
        taskArrayList.add(new Task("Help siblings with homework", true, new Date("11/1/2017")));

        // Créer l'adaptateur le lié au RecyclerView
        taskAdapter = new TaskAdapter(taskArrayList);
        mRecyclerView.setAdapter(taskAdapter);
    }
}
