package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "contact";
    }

    @RequestMapping(value = "/submit-form", method = RequestMethod.POST)
    public String submitForm(
            @RequestParam("email") String email,
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {

        model.addAttribute("email", email);
        model.addAttribute("username", username);
        model.addAttribute("password", password);

        return "success";
    }
}
