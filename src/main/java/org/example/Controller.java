package org.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/home")
    public String getInfo(Model model) {
        model.addAttribute("Todo", new Todo());
        return "first-page";
    }

    @RequestMapping("/todoInfo")
    public String getTodo(@ModelAttribute("Todo") Todo todoModel) {
         todoModel.setName(todoModel.getName() + " VIP!");
         todoModel.setDescriptoin(todoModel.getDescriptoin() + " VIP!");
        return "two-page";
    }
}
