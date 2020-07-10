package com.example.demo.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "value")
public class Person {
  
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    //private String age;

    public Person(){
        super();
    }

    public Person(Long id,String name){
        super();
        this.id = id;
        this.name = name;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long name){
        this.id = id;  
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;  
    }
}