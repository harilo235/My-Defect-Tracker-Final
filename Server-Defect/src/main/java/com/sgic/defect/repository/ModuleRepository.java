package com.sgic.defect.repository;

import com.sgic.defect.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository {

    Module getModuleById(Long id);

    Module deleteModuleById(Long id);
}
