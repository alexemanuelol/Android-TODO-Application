package se.ju.students.emal1414.todoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

/**
 * Created by Alex on 2017-10-24.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createButtonClicked(View view) {
        Intent intent = new Intent(this, CreateActivity.class);
        startActivity(intent);
    }

    public void selectButtonClicked(View view) {
        Intent intent = new Intent(MainActivity.this, PickTodoActivity.class);
        intent.putExtra("index", "select");
        startActivity(intent);
    }

    public void deleteButtonClicked(View view) {
        Intent intent = new Intent(MainActivity.this, PickTodoActivity.class);
        intent.putExtra("index", "delete");
        startActivity(intent);
    }
}
