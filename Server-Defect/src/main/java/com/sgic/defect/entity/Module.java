package com.sgic.defect.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(schema = "defect_final", name = "table")
public class Module implements Serializable {

    @ManyToOne
    @JoinColumn(name = "projectId", nullable = false)
    private Project project;

    @OneToMany(mappedBy="Module",cascade=CascadeType.ALL)
    List <User> user;

    @Id
    Long moduleId;
    String moduleName;
    String moduleMembers;
    //Long projectId;
    Long userId;

//    public List<User> getUser() {
//        return user;
//    }
//
//    public void setUser(List<User> user) {
//        this.user = user;
//    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public Long getUserId() {
        return userId;
    }
}
