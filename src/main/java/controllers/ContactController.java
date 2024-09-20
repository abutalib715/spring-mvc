package controllers;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    @ModelAttribute
    public void commonDataForModel(Model model){
        model.addAttribute("pageTitle","Registration Form");
        model.addAttribute("pageDesc","Test Description");
    }

    @RequestMapping("/show-form")
    public String showForm() {
        return "contact";
    }

//    @RequestMapping(value = "/submit-form", method = RequestMethod.POST)
//    public String submitForm(
//            @RequestParam("email") String email,
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            Model model) {
//
//        model.addAttribute("email", email);
//        model.addAttribute("username", username);
//        model.addAttribute("password", password);
//
//        return "success";
//    }

    @RequestMapping(value = "/submit-form", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute User user) {
        System.out.println("FROM MODEL ATTR");
        return "success";
    }
}
