package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ContactController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "contact";
    }

    @RequestMapping(value = "/submit-form", method = RequestMethod.POST)
    public ModelAndView submitForm() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("name", "Jakir");
        modelAndView.addObject("roll", 776);
        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time", now);

        List<String> friends = new ArrayList<>();
        friends.add("AKash");
        friends.add("Batash");
        friends.add("Sagor");
        modelAndView.addObject("friends", friends);

        modelAndView.setViewName("help");

        return modelAndView;
    }
}
