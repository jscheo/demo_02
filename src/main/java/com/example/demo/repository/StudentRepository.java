package com.example.demo.repository;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// 상속 받는 의미 이고 <> 안에는 상속받으려는 것의 이름 , 그 테이블의 pk의 타입
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
