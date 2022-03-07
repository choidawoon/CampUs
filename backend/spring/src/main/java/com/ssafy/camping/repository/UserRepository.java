package com.ssafy.camping.repository;

import com.ssafy.camping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
