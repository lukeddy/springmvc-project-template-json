package net.dervism.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created with IntelliJ IDEA.
 * User: dermansu
 * Date: 31.08.13
 * Time: 20:29
 */

@Controller
public class FrontpageController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String home(HttpServletRequest request) {

        return "index";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {

        return "login";
    }

}
