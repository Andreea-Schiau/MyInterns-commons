package net.andree.MyInterns.common.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private Boolean isMentor;

	public UserDTO() {
	}

	public UserDTO(String username, String password, Boolean isMentor) {
		this.username = username;
		this.password = password;
		this.isMentor = isMentor;
	}

	public UserDTO(String username, String password) {
		this.username = username;
		this.password = password;
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
