package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.UserServiceImpl;

@Controller
@RequestMapping("/users")
public class WebController {

/*    @GetMapping(value = "/hello")
    public String seyHello(Model model) {
        return "index";
    }
}*/

    private final UserServiceImpl userService;

    @Autowired
    public WebController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String allUsers(ModelMap model) {
        model.addAttribute("allUsers", userService.getAllUsers());
        return "users/index";
    }
}
