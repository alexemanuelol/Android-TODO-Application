package se.ju.students.emal1414.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Alex on 2017-10-24.
 */

public class PickTodoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_todo);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<Data.ToDo>(
                this,
                android.R.layout.simple_list_item_1,
                Data.todos
        ));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Data.ToDo clickedTodo = Data.todos.get(position);

                if (getIntent().getStringExtra("index").equals("select")) {
                    Intent intent1 = new Intent(PickTodoActivity.this, ViewTodoActivity.class);
                    intent1.putExtra("todoIndex", clickedTodo.toString());
                    startActivity(intent1);
                }
                else if (getIntent().getStringExtra("index").equals("delete")) {
                    Intent intent2 = new Intent(PickTodoActivity.this, DeleteTodoActivity.class);
                    intent2.putExtra("todoIndex", clickedTodo.toString());
                    intent2.putExtra("todoIndexNumber", position );
                    startActivity(intent2);
                    finish();
                }
            }
        });
    }
}
