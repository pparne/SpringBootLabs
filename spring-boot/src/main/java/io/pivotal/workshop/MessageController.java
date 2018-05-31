package io.pivotal.workshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

    @GetMapping("/message")
    public String message() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "some message here");
        return "message";
    }
}
