package com.example.demo.entity;

import javax.persistence.*;

@Entity
//테이블이다라고 정의하는 의미
@Table(name="demo_table")
public class DemoEntity {
    //primary key
    @Id
    // auto increment 랑 같음
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //컬럼 이름을 바꾸고 싶을 때 근데 그냥 따라가는게 좋긴함
    @Column(name =" student_name")
    //칼럼 추가 String은 default가 255다.
    private String name;

    // 길이 / null 여부 / 유니크 설정도 가능
    @Column(length = 30, nullable = false, unique = true)
    private String mobile;
    //entity의 필드명이랑 맞춰서 쓰면 된다.
    @Column
    private String studentAddress;
}

