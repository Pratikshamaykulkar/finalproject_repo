package com.example.finalproject.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.finalproject.Model.Order;


public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}
