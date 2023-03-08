package aufgabe.repository;

import aufgabe.model.BiologyStudent;
import aufgabe.model.ComputerScienceStudent;
import aufgabe.model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void testRandomStudent() {
        StudentDB allStudents = new StudentDB(new Student[5]);
        Student xin = new ComputerScienceStudent(1L, "Xin", "ComputerScience");
        Student nix = new ComputerScienceStudent(99L, "Nix", "Nix");
        allStudents.add(xin);
        allStudents.add(new ComputerScienceStudent(2L, "Hasan", "ComputerScience"));
        allStudents.add(new BiologyStudent(3L, "Robin", "Biology"));
        allStudents.add(new BiologyStudent(4L, "Lukas", "Biology"));
        assertTrue(Arrays.asList(allStudents.getAllStudentsFromArray())
                .contains(allStudents.randomStudentFromArray()));
    }
}