package main.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingPageController {

    @RequestMapping("/landingPage")
    public String landingPage(){
        return "landing-page";
    }
}
