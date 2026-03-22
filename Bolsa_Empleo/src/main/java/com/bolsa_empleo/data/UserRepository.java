package com.bolsa_empleo.data;

import com.bolsa_empleo.logic.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}