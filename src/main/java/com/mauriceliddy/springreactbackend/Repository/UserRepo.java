package com.mauriceliddy.springreactbackend.Repository;

import com.mauriceliddy.springreactbackend.Model.User;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    
}
