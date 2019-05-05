package com.sgic.defect.repository;

import com.sgic.defect.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUserId(Long id);

    User DeleteUserByUserId(Long id);
}
