package com.klef.fsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.klef.fsd.model.Contact;
import com.klef.fsd.service.ContactService;
import java.util.List;

@RestController
@RequestMapping("/contact")
@CrossOrigin("*")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/demo")
	public String demo()
	{
		return "Jenkins Demo";
}
    
    @PostMapping("/add")
    public ResponseEntity<String> addContact(@RequestBody Contact contact) {
        String result = contactService.addContact(contact);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Contact>> viewAllContacts() {
        return ResponseEntity.ok(contactService.viewAllContacts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> viewContactById(@PathVariable int id) {
        Contact contact = contactService.viewContactById(id);
        if (contact != null) {
            return ResponseEntity.ok(contact);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateContact(@RequestBody Contact contact) {
        String result = contactService.updateContact(contact);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable int id) {
        String result = contactService.deleteContact(id);
        return ResponseEntity.ok(result);
    }
}
