package com.sgic.defect.service;

import java.util.List;

import com.sgic.defect.entity.Project;

public interface ProjectService {
	
	void saveProject(Project project);
	
	List<Project> getAllProject();
	Project getProjectById(Long id);
	Project deleteProjectById(Long id);
	void updateProject(Project project);

	

}
