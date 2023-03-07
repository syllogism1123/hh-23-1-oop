package aufgabe;

import aufgabe.model.Student;
import aufgabe.repository.StudentDB;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        StudentDB allStudents = new StudentDB(new ArrayList<>());
//        Student xin = new Student(1L, "Xin");
//        Student nix = new Student(99L, "Nix");
//        allStudents.add(xin);
//        allStudents.add(new Student(2L, "Hasan"));
//        allStudents.add(new Student(3L, "Robin"));
//        allStudents.add(new Student(4L, "June"));
//        System.out.println(allStudents.randomStudent());
//        System.out.println(allStudents.getAllStudents());
//        allStudents.remove(xin);
//        //  allStudents.remove(nix);
//        System.out.println(allStudents.getAllStudents());
//        System.out.println(allStudents.randomStudent());

        StudentDB allStudents = new StudentDB(new Student[5]);
        Student xin = new Student(1L, "Xin");
        Student nix = new Student(99L, "Nix");
        allStudents.addToArray(xin);

        allStudents.addToArray(new Student(2L, "Hasan"));
        allStudents.addToArray(new Student(3L, "Robin"));
        allStudents.addToArray(new Student(4L, "Lukas"));


        System.out.println(allStudents.randomStudentFromArray());
        System.out.println(allStudents);

        allStudents.removeFromArray(xin);
       // allStudents.removeFromArray(nix);
        System.out.println(allStudents);
        System.out.println(allStudents.randomStudentFromArray());
        System.out.println(allStudents.findById(6L));


    }


}
