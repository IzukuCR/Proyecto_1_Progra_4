package com.bolsa_empleo.security;


import com.bolsa_empleo.data.UserRepository;

import com.bolsa_empleo.logic.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService {
    @Autowired
    UserRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User usr = usuarioRepository.findById(username)
                .orElseThrow(() -> new UsernameNotFoundException("Email " + username + " no encontrado"));

        return new UserDetailsImp(usr);
    }
}
