package mine.mazzanet.shinypancake.controllers;

import mine.mazzanet.shinypancake.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chrismazza on 4/7/22
 **/

@Controller
public class userController {

    private final UserRepository userRepository;

    public userController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/users")
    public String getUsers(Model model){

        model.addAttribute("users", userRepository.findAll());

        return "users/list";
    }
}
