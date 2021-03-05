package com.tts.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserName(String username);


}
