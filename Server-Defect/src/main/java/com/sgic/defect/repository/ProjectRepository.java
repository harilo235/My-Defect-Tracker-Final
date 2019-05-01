package com.sgic.defect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.defect.entity.Project;

//Repository extends by JPA
public interface ProjectRepository extends JpaRepository<Project, Long> {

	Project findProjectByProjectId(Long id);
//	Project findProjectByProjectName(String projectName);
	
	
}
