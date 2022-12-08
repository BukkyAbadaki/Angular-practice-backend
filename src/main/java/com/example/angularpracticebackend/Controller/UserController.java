package com.example.angularpracticebackend.Controller;

import com.example.angularpracticebackend.Dto.UserDto;
import com.example.angularpracticebackend.Entity.User;
import com.example.angularpracticebackend.Service.UserService;
import com.example.angularpracticebackend.utility.APIResponse;
import com.example.angularpracticebackend.utility.Responder;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/")
public class UserController {

    private final UserService userService;

    @GetMapping(path = "/user/register")
    public ResponseEntity<APIResponse> register(@RequestBody User user) {

        return Responder.Successful(userService.register(user));
    }


    @GetMapping(path = "/user/login")
    public ResponseEntity<APIResponse> login(@RequestBody UserDto userDto) throws Exception {

        return Responder.Successful(userService.login(userDto));
    }
}
