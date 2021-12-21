package org.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/home")
    public String getInfo() {
        return "first-page";
    }

    @RequestMapping("/todoInfo")
    public String getTodo(@RequestParam("nametodo") String nameTodo,
                          @RequestParam("description") String description,
                          Model model) {
        String name = nameTodo + " VIP!";
        String res = description + " VIP!";
        model.addAttribute("nameVip", name);
        model.addAttribute("descriptionVip", res);
        return "two-page";
    }
}
