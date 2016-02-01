package com.lynas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by sazzad on 2/1/16.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "sazzad");
        Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(student));
    }
}
