package com.sgic.defect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defect.entity.Project;
import com.sgic.defect.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	//importing and naming repository
	@Autowired
	ProjectRepository projectRepository;
	
	@Override
	public void saveProject(Project project) {
		projectRepository.save(project);
	}
	
	public List<Project> getAllProject() {
		return projectRepository.findAll();
	}

	@Override
	public Project deleteProjectById(Long id) {
		projectRepository.deleteById(id);
		return null;
	}

	@Override
	public void updateProject(Project project) {
		projectRepository.save(project);
		
	}

	@Override
	public Project getProjectById(Long id) {
		return projectRepository.findProjectByProjectId(id);
	}

	@Override
	public Project findProjectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
