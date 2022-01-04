package org.example.controller;

import org.example.entity.Todo;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Service service;
    @RequestMapping("/")
  public String getListTodo(Model model) {
        List<Todo> list1 = service.getAllTodo();
        model.addAttribute("TodoList", list1);
        return "listTodo";
    }

    @RequestMapping("/todo")
    public String addTodo(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "addTodo";
    }

    @RequestMapping("/saveTodoInBase")
    public String createTodo(@Validated @ModelAttribute("newTodo") Todo todos, BindingResult result) {
        if (result.hasErrors()) {
            return "addTodo";
        }
        service.save(todos);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String getUpdate(@RequestParam("todoId") int id, Model model) {
        Todo todos = service.getTodo(id);
        model.addAttribute("newTodo", todos);
        return "addTodo";
    }

    @RequestMapping("/delete")
    public String removTodo(@RequestParam("todoId") int id) {
        service.remove(id);
        return "redirect:/";
    }
}
