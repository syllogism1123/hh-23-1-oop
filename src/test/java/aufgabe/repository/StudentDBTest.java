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
        Student xin = new Student(1L, "Xin", "ComputerScience");
        Student nix = new Student(99L, "Nix", "Nix");
        allStudents.add(xin);
        allStudents.add(new Student(2L, "Hasan", "ComputerScience"));
        allStudents.add(new Student(3L, "Robin", "Biology"));
        allStudents.add(new Student(4L, "Lukas", "Biology"));
        assertTrue(Arrays.asList(allStudents.getAllStudentsFromArray())
                .contains(allStudents.randomStudentFromArray()));
    }
}