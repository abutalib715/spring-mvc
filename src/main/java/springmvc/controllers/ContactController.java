package springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

    @Autowired
    UserService userService;

    @ModelAttribute
    public void commonDataForModel(Model model) {
        model.addAttribute("pageTitle", "Registration Form");
        model.addAttribute("pageDesc", "Test Description");
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
//            Model springmvc.model) {
//
//        springmvc.model.addAttribute("email", email);
//        springmvc.model.addAttribute("username", username);
//        springmvc.model.addAttribute("password", password);
//
//        return "success";
//    }

    @RequestMapping(value = "/submit-form", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute User user, BindingResult result) {

        if (result.hasErrors()) {
            return "contact";
        }

        userService.createUser(user);
        return "success";
    }
}
