package com.sgic.defect.repository;

import com.sgic.defect.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository {

    Module findModuleByModuleId(Long id);

    Module deleteModuleByModuleId(Long id);
}
