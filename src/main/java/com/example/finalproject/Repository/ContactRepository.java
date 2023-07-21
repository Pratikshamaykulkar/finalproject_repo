package com.example.finalproject.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.finalproject.Model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{
    
    
}
