package com.example.angularpracticebackend.Service;

import com.example.angularpracticebackend.Dto.UserDto;
import com.example.angularpracticebackend.Entity.User;
import com.example.angularpracticebackend.utility.APIResponse;
import com.example.angularpracticebackend.utility.Responder;

public interface UserService {
    User register(User user);

     User login(UserDto userDto) throws Exception;
}
