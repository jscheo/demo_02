package com.example.demo.entity;

import com.example.demo.dto.StudentDTO;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter(AccessLevel.PRIVATE)
@Getter
@Table(name="student_table")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false, unique = true)
    private String studentNumber;

    @Column(length = 20,nullable = false)
    private String studentName;
    @Column(length = 30, nullable = false)
    private String studentMobile;
    @Column(length = 50 , nullable = false)
    private String studentMajor;

    //기본 생성자를 private으로
//    private StudentEntity () {
//
//    }

    // DTO -> Entity 변환 매서드
    public static StudentEntity toSaveEntity(StudentDTO studentDTO){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentNumber(studentDTO.getStudentNumber());
        studentEntity.setStudentName(studentDTO.getStudentName());
        studentEntity.setStudentMobile(studentDTO.getStudentMobile());
        studentEntity.setStudentMajor(studentDTO.getStudentMajor());
        return studentEntity;
    }

    //update 용으로 만든거 id 추가 (update 할때 사용할 매서드에는 모든 필드값이 다 들어가야함 바뀌지 않는 값이더라도)
    // 뺀 다음에 해버리면 기존 데이터가 null 처리가 되버려서 날라가게 됨
    public static StudentEntity toUpdateEntity(StudentDTO studentDTO){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDTO.getId());
        studentEntity.setStudentNumber(studentDTO.getStudentNumber());
        studentEntity.setStudentName(studentDTO.getStudentName());
        studentEntity.setStudentMobile(studentDTO.getStudentMobile());
        studentEntity.setStudentMajor(studentDTO.getStudentMajor());
        return studentEntity;
    }
}
