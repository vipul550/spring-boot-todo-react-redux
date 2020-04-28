package com.todoapp.todoapp.modal;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "todo") 
public class Todo {
private Integer id;
@Column(name="name")
private String name;
@Column(name="description")
private String description;

public Todo(){

}

public Todo(Integer id, String name , String desc ){
    this.id = id;
    this.name = name;
    this.description = desc;
}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Todo)) {
            return false;
        }
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) && Objects.equals(name, todo.name) && Objects.equals(description, todo.description);
    }

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }
    public int hashCode() {
        return Objects.hash(id, name, description);
    }


}