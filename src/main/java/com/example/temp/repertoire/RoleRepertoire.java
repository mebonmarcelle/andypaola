package com.example.temp.repertoire;

import com.example.temp.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepertoire extends JpaRepository<Role, Long> {
    Role findByNom(String nom);
}
