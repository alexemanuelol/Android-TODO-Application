package se.ju.students.emal1414.todoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Alex on 2017-10-24.
 */

public class ViewTodoActivity extends AppCompatActivity {

    private TextView theTodo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_todo);

        theTodo = (TextView) findViewById(R.id.TextView);
        theTodo.setText(getIntent().getStringExtra("todoIndex").replace("Todo: ", getResources().getString(R.string.title)+": "));
    }
}
