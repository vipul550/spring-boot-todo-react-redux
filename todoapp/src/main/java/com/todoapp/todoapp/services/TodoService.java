package com.todoapp.todoapp.services;

import javax.transaction.Transactional;

import com.todoapp.todoapp.modal.Todo;
import com.todoapp.todoapp.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TodoService {

    @Autowired
    private TodoRepository todorepo;

    public List<Todo> listAll() {
        return todorepo.findAll();
    }
     
    public void save(Todo todo) {
        todorepo.save(todo);
    }
     
    public Todo get(Integer id) {
        return todorepo.findById(id).get();
    }
     
    public void delete(Integer id) {
        todorepo.deleteById(id);
    }
}