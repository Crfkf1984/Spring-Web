package org.example;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@org.springframework.stereotype.Controller
@RequestMapping("/todo")
public class Controller {
    @RequestMapping("/")
    public String getInfo(Model model) {
        model.addAttribute("Todo", new Todo());
        return "first-page";
    }

    @RequestMapping("/Info")
    public String getTodo(@Valid @ModelAttribute("Todo") Todo todoModel, BindingResult result) {
        if (result.hasErrors()) {
            return "first-page";
        }

        return "two-page";
    }
}
