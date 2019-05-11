package com.sgic.defect.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(schema = "defect_final", name="project")
public class Project implements Serializable {

	@OneToMany(mappedBy="Project",cascade=CascadeType.ALL)
	List<Module> module ;

	@OneToMany(mappedBy="Project",cascade=CascadeType.ALL)
	List <User> user;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long projectId;
	String projectName;
	String projectMembers;
	Long moduleId;
	Long userId;

	public List<Module> getModule() {
		return module;
	}

	public void setModule(List<Module> module) {
		this.module = module;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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
