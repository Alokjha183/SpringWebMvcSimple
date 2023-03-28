package com.alok.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alok.Entity.UserEntity;
import com.alok.bindings.User;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
