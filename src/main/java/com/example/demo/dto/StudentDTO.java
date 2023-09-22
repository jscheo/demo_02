package com.example.demo.dto;

import com.example.demo.entity.StudentEntity;
import lombok.Data;

import java.util.Optional;

@Data
public class StudentDTO {
    private Long id;
    private String studentNumber;
    private String studentName;
    private String studentMobile;
    private String studentMajor;

    public static StudentDTO toSaveDTO(StudentEntity studentEntity) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(studentEntity.getId());
        studentDTO.setStudentNumber(studentEntity.getStudentNumber());
        studentDTO.setStudentName(studentEntity.getStudentName());
        studentDTO.setStudentMobile(studentEntity.getStudentMobile());
        studentDTO.setStudentMajor(studentEntity.getStudentMajor());
        return studentDTO;
    }


}


