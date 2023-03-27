package com.vivek.user.service.repositories;

import com.vivek.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer> {
}
