package aufgabe.repository;

import aufgabe.model.Student;

import java.util.Arrays;
import java.util.List;

public class StudentDB {

    //  private List<Student> studentList;

    private Student[] arr;

  /*  public StudentDB(List<Student> studentList) {
        this.studentList = studentList;
    }*/

    public StudentDB(Student[] arr) {
        this.arr = arr;
    }

   /* public List<Student> getAllStudents() {
        return studentList;
    }*/

    public Student[] getAllStudentsFromArray() {
        return arr;
    }

    /*public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }*/

    /* public Student randomStudent() {

         return studentList.get((int) (Math.random() * studentList.size()));
     }


 */

    public Student findById(Long id) {
        try {
            for (Student s : arr) {
                if (s != null && s.getId().equals(id)) {
                    return s;
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("student is not found");
        }
        return null;
    }


    public Student randomStudentFromArray() {
        return arr[(int) (Math.random() * arr.length)];
    }

   /* public void add(Student student) {
        if (!studentList.contains(student)) {
            studentList.add(student);
        } else {
            System.out.println("This student already exists");
        }
    }

    public void remove(Student student) {
        if (studentList.contains(student)) {
            studentList.remove(student);
        } else {
            throw new RuntimeException("This student does not exist");
        }

    }*/

    public void addToArray(Student student) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = student;
                break;
            }
        }
    }

    public void removeFromArray(Student student) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(student)) {
                arr[i] = null;
                break;
            }
        }
    }


   /* @Override
    public String toString() {
        return "StudentDB{" +
                "studentList=" + studentList +
                '}';
    }*/

    @Override
    public String toString() {
        return "StudentDB{" +
                Arrays.toString(arr) +
                '}';
    }
}
