package se.ju.students.emal1414.todoapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static se.ju.students.emal1414.todoapp.Data.todos;

/**
 * Created by Alex on 2017-10-24.
 */

public class DeleteTodoActivity extends AppCompatActivity {

    private TextView theTodo;
    private int index;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_todo);

        index = getIntent().getExtras().getInt("todoIndexNumber");

        theTodo = (TextView) findViewById(R.id.TextView2);
        theTodo.setText(getIntent().getStringExtra("todoIndex").replace("Todo: ", getResources().getString(R.string.title)+": "));
    }

    public void deleteButtonClicked(View view) {

        new AlertDialog.Builder(this)
                .setTitle(R.string.deletetodo)
                .setMessage(R.string.yousure)
                .setPositiveButton(
                android.R.string.yes,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Delete it.
                        todos.remove(index);
                        finish();
                    }
                }
                ).setNegativeButton(
                android.R.string.no,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Do not delete it.
                        finish();
                    }
                }
                ).show();
    }
}
