package com.example.demo.repository;

import com.example.demo.object.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Person, Long> {
    
}