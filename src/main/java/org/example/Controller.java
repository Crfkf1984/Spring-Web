package org.example;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/home")
    public String getInfo() {
        return "first-page";
    }

    @RequestMapping("/todoInfo")
    public String getTodo() {
        return "two-page";
    }
}
