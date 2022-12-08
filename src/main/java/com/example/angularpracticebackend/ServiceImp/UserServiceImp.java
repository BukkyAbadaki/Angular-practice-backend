package com.example.angularpracticebackend.ServiceImp;

import com.example.angularpracticebackend.Dto.UserDto;
import com.example.angularpracticebackend.Entity.User;
import com.example.angularpracticebackend.Exception.UserAlreadyExistException;
import com.example.angularpracticebackend.Repository.UserRepository;
import com.example.angularpracticebackend.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
   public User register(User user) {
       boolean userExists = userRepository.findByEmail(user.getEmail()).isPresent();
       if(userExists){
           throw new UserAlreadyExistException(String.format("Email %s has been taken", user.getEmail()));

       }
       User user1 = new User();
       user1.setFirstName(user.getFirstName());
       user1.setLastName(user.getLastName());
       user1.setEmail(user.getEmail());
       user1.setPassword(user.getPassword());
       user1.setPhoneNumber(user.getPhoneNumber());
      return userRepository.save(user);
    }




    public User login(UserDto userDto) throws Exception {

        return userRepository.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword()).orElseThrow(()->new Exception("Invalid username and password"));
    }

}
