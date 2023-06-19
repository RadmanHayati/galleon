package com.ecommerce.galleon.repository;

import com.ecommerce.galleon.model.AuthenticationToken;
import com.ecommerce.galleon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {

    AuthenticationToken findByUser(User user);
}
