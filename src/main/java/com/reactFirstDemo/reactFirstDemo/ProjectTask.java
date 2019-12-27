package com.reactFirstDemo.reactFirstDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

@Entity
public class ProjectTask {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotBlank(message = "Summary cannot be blank")
	private String summary;
	private String acceptanceCriteria;
	private String status;
	
	public ProjectTask() {
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAcceptanceCriteria() {
		return acceptanceCriteria;
	}

	public void setAcceptanceCriteria(String acceptanceCriteria) {
		this.acceptanceCriteria = acceptanceCriteria;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
