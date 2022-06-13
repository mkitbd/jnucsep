package jnu.jnucsep.controller;

import jnu.jnucsep.model.Student;
import jnu.jnucsep.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping("/Student")
    public String showStudent (Model model){
        Student student = new Student();
        model.addAttribute("student",student);

        List<String> listBatch = Arrays.asList("10th", "11th", "12th");
        model.addAttribute("listBatch", listBatch);

        return "student";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "student";
    }

}
