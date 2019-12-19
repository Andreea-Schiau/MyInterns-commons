package net.andree.MyInterns.common.dto;

public class UserDTO {

	private Long id;
	private String username;
	private String password;
	private Boolean isMentor;

	public UserDTO() {
	}

	public UserDTO(Long id, String username, String password, Boolean isMentor) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.isMentor = isMentor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsMentor() {
		return isMentor;
	}

	public void setIsMentor(Boolean isMentor) {
		this.isMentor = isMentor;
	}
}
