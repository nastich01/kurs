package com.example.kpo.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.example.kpo.entity.Faculty;

public class FacultyResource {
    private Integer id;
    private String faculty_name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private StudentResource[] students;

    public FacultyResource() {}

    public FacultyResource(Faculty faculty) {
        this.id = faculty.getId();
        this.faculty_name = faculty.getFaculty_name();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public StudentResource[] getStudents() {
        return students;
    }

    public void setStudents(StudentResource[] students) {
        this.students = students;
    }

    public Faculty toEntity() {
        return new Faculty(
                this.id,
                this.faculty_name
        );
    }
}
