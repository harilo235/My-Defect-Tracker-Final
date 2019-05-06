package com.sgic.defect.controller;

import com.sgic.defect.entity.Module;
import com.sgic.defect.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModuleController {

    @Autowired
    ModuleService moduleService;

    @GetMapping("/findAll")
    public List<Module> findAll(){
        return moduleService.getAllModule();
    }

}
