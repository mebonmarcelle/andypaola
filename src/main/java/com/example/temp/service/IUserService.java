package com.example.temp.service;

import com.example.temp.enregistrement.RegistrationRequest;
import com.example.temp.repertoire.UserRepertoire;
import com.example.temp.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

//.....


@Service
public interface IUserService {
   // private final UserRepertoire userRepository;

//    public IUserService(UserRepertoire userRepository);

    public User createUser(RegistrationRequest registration);

    public User getUserById(Long userId);

    public List<User> getAllUsers();

    public User updateUser(User user);

    public void deleteUser(Long userId);
}