package net.andree.MyInterns.common.dto;

public class StudentDTO {

	private String name;
	private String surname;
	private String description;
	private String email;

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
