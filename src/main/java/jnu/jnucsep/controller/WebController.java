package jnu.jnucsep.controller;

import jnu.jnucsep.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/about")
    public String about() {
        return "about";
    }

    @GetMapping("/Student")
    public String showStudent (Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "student";
    }

}
