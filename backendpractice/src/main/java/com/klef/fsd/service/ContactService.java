package com.klef.fsd.service;

import java.util.List;
import com.klef.fsd.model.Contact;

public interface ContactService {
    String addContact(Contact contact);
    List<Contact> viewAllContacts();
    Contact viewContactById(int id);
    String updateContact(Contact contact);
    String deleteContact(int id);
}
