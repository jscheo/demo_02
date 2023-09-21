package com.example.demo.entity;

import javax.persistence.*;

@Entity
//테이블이다라고 정의하는 의미
public class DemoEntity {

    @Id
    // auto increment 랑 같음
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    //칼럼 추가 String은 default가 255다.
    private String name;
}
