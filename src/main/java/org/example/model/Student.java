package org.example.model;

import java.util.Objects;

public class Student {
    private Long id;
    private String name;
    private String address;

    public Student() {
        super();
    }

    public Student(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id.equals(student.id) && name.equals(student.name) && address.equals(student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
