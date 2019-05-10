package com.sgic.defect.service;

import com.sgic.defect.entity.Module;
import com.sgic.defect.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    ModuleRepository moduleRepository;

    @Override
    public void saveModule(Module module) {
        moduleRepository.save(module);
    }

    @Override
    public List<Module> getAllModule() {
        return moduleRepository.findAll();
    }

    @Override
    public Module getModuleById(Long id) {
        return moduleRepository.getModuleById(id);
    }

    @Override
    public Module deleteModuleById(Long id) {
        return moduleRepository.deleteModuleById(id);
    }

    @Override
    public void updateModule(Module module) {
        moduleRepository.save(module);

    }
}
