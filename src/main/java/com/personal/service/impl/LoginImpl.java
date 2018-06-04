package com.personal.service.impl;

import com.personal.domain.User;
import com.personal.repository.UserRepository;
import com.personal.service.LoginPublicService;
import com.personal.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LoginImpl implements LoginService {

    //private final UserRepository userRepository;

    @Override
    public User find(@RequestBody Object request) {
        return User.builder()
                .id(1)
                .fullName("fullName")
                .name("Name")
                .nickName("nickName")
                .password("password").build();
    }
}
