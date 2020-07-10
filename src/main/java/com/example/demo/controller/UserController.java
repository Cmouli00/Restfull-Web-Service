package com.example.demo.controller;

import com.example.demo.object.Person;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value ="/rest")
public class UserController {

    // @GetMapping("/getUserDetails")
    // public String getUserDetails(@RequestHeader String name){
    //     return "Req name "+name;
    // }
   
    // @PostMapping("/createUser")
    // public String createNewUser(@RequestBody Person person){
    //     return "Created new user"+person.getName();
    // }
    // @PutMapping("/updateUser")
    // public String updateUser(){
    //     return "Updated";
    // }
    // @DeleteMapping("/deleteUser")
    // public String deleteUser(){
    //     return "Deleted";
    // }

    @Autowired
    UsersRepository userRepository;

    @GetMapping(value = "/all")
    public List<Person> getAll(){
        return userRepository.findAll();
    }

    @PostMapping(value ="/load")
    public List<Person> persist(@RequestBody Person person ){
        userRepository.save(person);
        return userRepository.findAll();
    }

    
}