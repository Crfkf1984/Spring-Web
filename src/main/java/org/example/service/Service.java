package org.example.service;

import org.example.entity.Todo;

import java.util.List;

public interface Service {
     List<Todo> getAllTodo();
     void save(Todo todo);

     Todo getTodo(int id);

     void remove(int id);
}
