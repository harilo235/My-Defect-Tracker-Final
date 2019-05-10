package com.sgic.defect.controller;

import com.sgic.defect.entity.Module;
import com.sgic.defect.entity.Project;
import com.sgic.defect.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ModuleController {

    @Autowired
    ModuleService moduleService;

    @GetMapping("/findAll")
    public List<Module> findAll(){
        return moduleService.getAllModule();
    }

    //get project by id
    @GetMapping("/getProjectById/{id}")
    public ResponseEntity <Module> getProjectById(@PathVariable("id") Long id){
        return new ResponseEntity<Module>(moduleService.getModuleById(id),HttpStatus.OK);
    }

    //delete project by id
    @DeleteMapping("/deleteProject/{id}")
    public ResponseEntity<Module> deleteProjectById (@PathVariable ("id") Long id){
        moduleService.deleteModuleById(id);
        return new ResponseEntity<Module>(HttpStatus.NO_CONTENT);
    }

    //update project
    @PutMapping("/updateProject")
    public ResponseEntity<Project> updateProject (@Valid @RequestBody Module module){
        moduleService.updateModule(module);
        return new ResponseEntity<Project>(HttpStatus.OK);
    }

    //saveProject
    @PostMapping("/saveProject")
    public HttpStatus saveProject (@Valid @RequestBody Module module){
        moduleService.saveModule(module);
        return HttpStatus.CREATED;
    }
}
