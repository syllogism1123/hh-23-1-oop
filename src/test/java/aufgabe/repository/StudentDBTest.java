package aufgabe.repository;

import aufgabe.model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void testRandomStudent() {
        StudentDB allStudents = new StudentDB(new Student[5]);
        Student xin = new Student(1L, "Xin");
        Student nix = new Student(99L, "Nix");
        allStudents.addToArray(xin);

        allStudents.addToArray(new Student(2L, "Hasan"));
        allStudents.addToArray(new Student(3L, "Robin"));
        allStudents.addToArray(new Student(4L, "June"));
        assertTrue(Arrays.asList(allStudents.getAllStudentsFromArray())
                .contains(allStudents.randomStudentFromArray()));
    }
}