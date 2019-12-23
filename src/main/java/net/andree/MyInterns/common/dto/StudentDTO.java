package net.andree.MyInterns.common.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable{

	private static final long serialVersionUID = -2279729627589934230L;
	private Long id;
	private String name;
	private String surname;
	private String description;
	private String email;

	UserDTO userDTO;

	public StudentDTO() {
	}

	public StudentDTO(String name) {
		this.name = name;
	}

	public StudentDTO(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public StudentDTO(String name, String surname, String description, String email) {
		this.name = name;
		this.surname = surname;
		this.description = description;
		this.email = email;
	}

	public StudentDTO(String name, String surname, String description, String email, UserDTO userDTO) {
		this.name = name;
		this.surname = surname;
		this.description = description;
		this.email = email;
		this.userDTO = userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", surname=" + surname + ", description=" + description + ", email=" + email
				+ "]";
	}
}
