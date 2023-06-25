package com.ecommerce.galleon.repository;

import com.ecommerce.galleon.model.Cart;
import com.ecommerce.galleon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}
