package com.klef.fsd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_table")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private int id;
    @Column(name = "contact_name", nullable = false, length = 100)
    private String name;
    @Column(name = "contact_email", nullable = false, length = 100)
    private String email;
    @Column(name = "contact_phone", nullable = false, length = 20)
    private String phone;
    @Column(name = "contact_address", length = 200)
    private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

    
}
