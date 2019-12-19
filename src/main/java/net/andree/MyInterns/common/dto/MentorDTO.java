package net.andree.MyInterns.common.dto;

public class MentorDTO {

	private Long id;
	private String name;
	private String username;
	private String email;
	private String qualification;
	private Boolean isExternal;

	public MentorDTO() {
	}

	public MentorDTO(Long id, String name, String username, String email, String qualification, Boolean isExternal) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.qualification = qualification;
		this.isExternal = isExternal;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Boolean getIsExternal() {
		return isExternal;
	}

	public void setIsExternal(Boolean isExternal) {
		this.isExternal = isExternal;
	}
}
