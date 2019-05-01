package com.sgic.defect.controller;

import java.util.List;

import javax.validation.Valid;

import com.sgic.defect.entity.Project;
import com.sgic.defect.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectCotroller {
	
	@Autowired
	ProjectService projectService;
	
	@GetMapping("/findAll")
	public List<Project> findAll(){
		return projectService.getAllProject();
	}

	//get project by id
	@GetMapping("/getProjectById/{id}")
	public ResponseEntity <Project> getProjectById(@PathVariable("id") Long id){
		return new ResponseEntity<Project>(projectService.getProjectById(id),HttpStatus.OK);	
	}
	
	//delete project by id
	@DeleteMapping("/deleteProject/{id}")
	public ResponseEntity<Project> deleteProjectById (@PathVariable ("id") Long id){
		projectService.deleteProjectById(id);
		return new ResponseEntity<Project>(HttpStatus.NO_CONTENT);	
	}

	//update project
	@PutMapping("/updateProject")
	public ResponseEntity<Project> updateProject (@Valid @RequestBody Project project){
		projectService.updateProject(project);
		return new ResponseEntity<Project> (HttpStatus.OK);
	}
	
	//saveProject
	@PostMapping("/saveProject")
	public HttpStatus saveProject (@Valid @RequestBody Project project){
		projectService.saveProject(project);
		return HttpStatus.CREATED;
	}
}
