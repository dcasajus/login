package com.personal.controller;

import com.personal.domain.User;
import com.personal.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import com.personal.service.LoginPublicService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController implements LoginPublicService {

    private final LoginService loginService;

    @Override
    public User checkUser(Object request) {
        return loginService.find(request);
    }


}


