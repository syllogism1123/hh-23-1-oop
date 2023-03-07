package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testEquals() {
        Student student1 = new Student(2L, "Xin", "Max Planck Strasse 5");
        Student student2 = new Student(2L, "Xin", "Max Planck Strasse 5");
        assertTrue(student1.equals(student2));
    }

    @Test
    void testHashCode() {
        Student student1 = new Student(2L, "Xin", "Max Planck Strasse 5");
        Student student2 = new Student(2L, "Xin", "Max Planck Strasse 5");
        assertTrue(student1.hashCode() == student2.hashCode());
    }
}