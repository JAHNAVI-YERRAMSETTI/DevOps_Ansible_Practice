package com.klef.fsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.klef.fsd.model.Contact;
import com.klef.fsd.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public String addContact(Contact contact) {
        contactRepository.save(contact);
        return "Contact added successfully";
    }

    @Override
    public List<Contact> viewAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact viewContactById(int id) {
        return contactRepository.findById(id).orElse(null);
    }

    @Override
    public String updateContact(Contact contact) {
        if (contactRepository.existsById(contact.getId())) {
            contactRepository.save(contact);
            return "Contact updated successfully";
        }
        return "Contact not found";
    }

    @Override
    public String deleteContact(int id) {
        if (contactRepository.existsById(id)) {
            contactRepository.deleteById(id);
            return "Contact deleted successfully";
        }
        return "Contact not found";
    }
}
