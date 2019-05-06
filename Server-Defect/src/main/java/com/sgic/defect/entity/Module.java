package com.sgic.defect.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(schema = "defect_final", name = "table")
public class Module implements Serializable {

    @Id

    Long moduleId;
    String moduleName;
    String moduleMembers;
    Long projectId;
    Long userId;

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleMembers() {
        return moduleMembers;
    }

    public void setModuleMembers(String moduleMembers) {
        this.moduleMembers = moduleMembers;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
