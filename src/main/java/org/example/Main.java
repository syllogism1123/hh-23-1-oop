package org.example;

import org.example.model.Student;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        Student xin = new Student();
        xin.setName("Xin");
        xin.setAddress("Max Planck Strasse 5");
        xin.setId(1234567L);
        System.out.println(xin.getName());
        System.out.println(xin.getAddress());
        System.out.println(xin.getId());

    }
}