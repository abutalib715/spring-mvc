package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Khalid Hasan");
        model.addAttribute("nid", 453453453);
        List<String> friends = new ArrayList<>();
        friends.add("AKash");
        friends.add("Batash");
        friends.add("Sagor");
        model.addAttribute("friends", friends);
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help() {
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
