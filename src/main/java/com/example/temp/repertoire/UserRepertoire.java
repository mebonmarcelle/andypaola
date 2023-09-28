package com.example.temp.repertoire;

import com.example.temp.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepertoire extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
