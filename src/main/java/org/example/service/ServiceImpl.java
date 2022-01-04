package org.example.service;

import org.example.dao.TodoDaoImpl;
import org.example.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    @Autowired
    TodoDaoImpl todoDao;
    @Override
    @Transactional
    public List<Todo> getAllTodo() {
        return todoDao.getAllTodo();
    }

    @Override
    @Transactional
    public void save(Todo todos) {
        todoDao.save(todos);
    }

    @Override
    @Transactional
    public Todo getTodo(int id) {
        return todoDao.getTodo(id);
    }

    @Override
    @Transactional
    public void remove(int id) {
        todoDao.remove(id);
    }
}
