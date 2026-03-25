package com.bolsa_empleo.service;

import com.bolsa_empleo.logic.User;
import com.bolsa_empleo.data.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


}
