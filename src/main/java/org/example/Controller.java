package org.example;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/info")
    public String getInfo() {
        return "info-test";
    }
}
