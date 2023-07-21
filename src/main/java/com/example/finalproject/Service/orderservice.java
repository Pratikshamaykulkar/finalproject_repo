package com.example.finalproject.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.finalproject.Model.Order;
import com.example.finalproject.Repository.OrderRepository;


@Service
public class orderservice {
    
    @Autowired
    private  OrderRepository repository;
 
     public void saveOrder(Order order){
        repository.save(order);

     }

   
}
