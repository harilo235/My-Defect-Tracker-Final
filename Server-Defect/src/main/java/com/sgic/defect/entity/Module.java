package com.sgic.defect.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(schema = "defect_final", name = "table")
public class Module implements Serializable {

    @OneToOne
    @JoinColumn(name = "projectId", nullable = false)
    private Project projectId;

    @OneToMany(mappedBy="User",cascade=CascadeType.ALL)
    @JoinColumn(name = "userId", nullable = false)
    private User userId;

    @Id
    Long moduleId;
    String moduleName;
    String moduleMembers;
//    Long projectId;
//    Long userId;

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

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
