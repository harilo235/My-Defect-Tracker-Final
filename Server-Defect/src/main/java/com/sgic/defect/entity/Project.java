package com.sgic.defect.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(schema = "defect_final", name="project")
public class Project implements Serializable {

	@OneToMany(mappedBy="Module",cascade=CascadeType.ALL)
	@JoinColumn(name = "moduleId", nullable=false)
	private Module moduleId;

	@OneToMany(mappedBy="User",cascade=CascadeType.ALL)
	@JoinColumn(name = "userId", nullable = false)
	private User userId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long projectId;
	String projectName;
	String projectMembers;
//	Long moduleId;
//	Long userId;


	public Module getModuleId() {
		return moduleId;
	}

	public void setModuleId(Module moduleId) {
		this.moduleId = moduleId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectMembers() {
		return projectMembers;
	}

	public void setProjectMembers(String projectMembers) {
		this.projectMembers = projectMembers;
	}
}
