package com.klef.fsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.klef.fsd.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
}
