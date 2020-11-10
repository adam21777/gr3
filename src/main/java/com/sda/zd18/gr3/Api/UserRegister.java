package com.sda.zd18.gr3.Api;

import com.sda.zd18.gr3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserRegister {

//    @Autowired
//    UserRepository userRepository;
//
//    @PostMapping(value={"/register"}) //nazwa endpointa - taki samo powinien nazywac się plik .jsp w folderze webapp
//    public RedirectView postUserRegister(@ModelAttribute User newUser){
//        User user = new User();
//        user.setFirstName(newUser.getFirstName());
//        user.setLastName(newUser.getLastName());
//        user.setEmail(newUser.getEmail());
//        user.setLogin(newUser.getLogin());
//        user.setPassword(newUser.getPassword());
//        user.setYears(newUser.getYears());
//
//        userRepository.save(user);
//
//        return new RedirectView("/register");
//    }
}
