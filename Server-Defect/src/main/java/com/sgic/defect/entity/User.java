package com.sgic.defect.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "defect_final" , name = "user")
public class User implements Serializable {

    @OneToOne
    @JoinColumn(name = "projectId", nullable = false)
    private Project projectId;

    @OneToOne
    @JoinColumn(name = "moduleId", nullable = false)
    private Module moduleId;
    @Id
    Long userId;
//    Long projectId;
//    Long moduleId;
    String userName;
    String userPassword;
    String name;
    String email;
    String userRole;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }

    public Module getModuleId() {
        return moduleId;
    }

    public void setModuleId(Module moduleId) {
        this.moduleId = moduleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

}
