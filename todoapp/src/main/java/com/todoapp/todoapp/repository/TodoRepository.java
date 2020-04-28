package com.todoapp.todoapp.repository;

import com.todoapp.todoapp.modal.Todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {


}