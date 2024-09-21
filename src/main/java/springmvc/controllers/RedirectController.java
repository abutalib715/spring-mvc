package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class RedirectController {

    @RequestMapping("/one")
    public String one() {
        return "redirect:/enjoy";
    }

    @RequestMapping("/two")
    public RedirectView two() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("enjoy");
        return redirectView;
    }

    @RequestMapping("/three")
    public String three(HttpServletResponse response) {
        try {
            response.sendRedirect("/enjoy");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping("/enjoy")
    public String enjoy() {
        return "contact";
    }

}
