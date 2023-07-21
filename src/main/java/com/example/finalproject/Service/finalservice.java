
package com.example.finalproject.Service;

import java.util.List;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalproject.Model.Contact;
import com.example.finalproject.Repository.ContactRepository;

@Service

public class finalservice {

    @Autowired
    private ContactRepository repo;

    public void add(Contact contact) {

        repo.save(contact);
    }

    // for mokito //
    public List<Contact> getting(){
       return repo.findAll();
    }

}
