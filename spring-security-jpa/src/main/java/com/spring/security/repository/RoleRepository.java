package com.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
