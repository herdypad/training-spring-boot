package com.pajak.training.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "training_user")
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column
	private Integer age;
	
	@Column(nullable = false, unique = true)
	private String email;

//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//	private Set<Address> adressList;

	public User() {
		super();
	}
	
	public User(Long id, String name, Integer age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		
	}
	
	public User(String name, Integer age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	


	
	

	
}
