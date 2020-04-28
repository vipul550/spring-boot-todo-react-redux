package com.todoapp.todoapp.controller;

import com.todoapp.todoapp.modal.Todo;
import com.todoapp.todoapp.services.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoservice;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/todos")
    public List<Todo> list() {
        return todoservice.listAll();
    }

    @RequestMapping("/todos/{id}")
    public ResponseEntity<Todo> get(@PathVariable Integer id){
            try {
                Todo todo = todoservice.get(id);
                return new ResponseEntity<Todo>(todo,HttpStatus.OK);    
            } catch (NoSuchElementException e) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
 
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/todos")
    public List<Todo> add (@RequestBody Todo todo){
        todoservice.save(todo);
        return todoservice.listAll();
    }

    @PutMapping("/todos/{id}")
    public ResponseEntity<?> update(@RequestBody Todo todo, @PathVariable Integer id){
        try {
           
            todoservice.save(todo);
            return new ResponseEntity<>(HttpStatus.OK);


        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/todos/{id}")
    public void delete(@PathVariable Integer id){
        todoservice.delete(id);
    }

}