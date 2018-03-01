package se.ju.students.emal1414.todoapp;

import java.util.ArrayList;

/**
 * Created by Alex on 2017-10-24.
 */

public class Data {

    public static ArrayList<ToDo> todos = new ArrayList<>();
    static {
        todos.add(new ToDo("Do A"));
        todos.add(new ToDo("Do B"));
        todos.add(new ToDo("Do C"));
    }

    public static class ToDo {
        public String title;
        public ToDo(String title) { this.title = title; }
        @Override
        public String toString() { return "Todo: "+title; }
    }
}
