package springmvc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @RequestMapping("/user/{username}/find")
    public String userInfo(String username) throws Exception {
        System.out.println(username);
        throw new Exception("TEST");
//        return "about";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
//    @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
    public String exceptionHandler(Model model) {
        model.addAttribute("msg", "Exception occurred, custom msg");
        return "exception_page";
    }
}
