package com.runtog.web.service;

import com.runtog.web.dto.RegistrationDto;
import com.runtog.web.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);

    UserEntity findByUsername(String username);
}
