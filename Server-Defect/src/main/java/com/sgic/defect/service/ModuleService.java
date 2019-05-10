package com.sgic.defect.service;

import com.sgic.defect.entity.Module;

import java.util.List;

public interface ModuleService  {

    void saveModule(Module module);

    List<Module> getAllModule();
    Module getModuleById(Long id);
    Module deleteModuleById(Long id);
    void updateModule(Module module);

}
