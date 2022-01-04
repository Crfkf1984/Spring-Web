package org.example.dao;

import org.example.entity.Todo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoDaoImpl implements TodoDao{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Todo> getAllTodo() {
        Session session = sessionFactory.getCurrentSession();
        List<Todo> list = session.createQuery("from Todo", Todo.class).getResultList();
        return list;
    }

    @Override
    public void save(Todo todos) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(todos);
    }

    @Override
    public Todo getTodo(int id) {
        Session session = sessionFactory.getCurrentSession();
        Todo todos = session.get(Todo.class,id);
        return todos;
    }

    @Override
    public void remove(int id) {
        Session session = sessionFactory.getCurrentSession();
        Todo todos = session.get(Todo.class, id);
        session.delete(todos);
    }
}
