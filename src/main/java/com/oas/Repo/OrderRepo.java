package com.oas.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oas.Entity.OrderPojo;

@Repository
public interface OrderRepo extends JpaRepository<OrderPojo, Integer> {

}
