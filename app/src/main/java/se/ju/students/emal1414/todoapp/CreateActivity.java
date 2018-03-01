package se.ju.students.emal1414.todoapp;

import android.widget.EditText;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static se.ju.students.emal1414.todoapp.Data.todos;

/**
 * Created by Alex on 2017-10-24.
 */

public class CreateActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    public void createButtonClicked(View view) {
        EditText editText = (EditText) findViewById(R.id.enteredTitle);
        String enteredTitle = editText.getText().toString();
        todos.add(new Data.ToDo(enteredTitle));
        finish();
    }
}
