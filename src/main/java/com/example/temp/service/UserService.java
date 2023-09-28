package com.example.temp.service;

import com.example.temp.enregistrement.RegistrationRequest;
import com.example.temp.repertoire.RoleRepertoire;
import com.example.temp.user.Role;
import com.example.temp.repertoire.UserRepertoire;
import com.example.temp.user.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

//.....
@Service
@RequiredArgsConstructor
@Data
public class UserService implements IUserService {
    private final UserRepertoire userRepertoire;

    private final RoleRepertoire roleRepertoire;

    //Permet de retourner la liste des utilisateurs
      @Override
      public List<User> getAllUsers() {

          return userRepertoire.findAll();
      }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    //Enregistrement d'un nouveau utilisateur
      @Override
      public User createUser(RegistrationRequest registration) {
          Role role = new Role("USER");

          User tempUser = userRepertoire.findByEmail(registration.getEmail());
          if(tempUser!=null){
              return null;
          }
          User user = new User(registration.getNom(), registration.getPrenom(), registration.getEmail(), registration.getMot_de_passe(),
                  registration.getType_donateur(), registration.getTelephone(), registration.getAdresse(),
                  registration.getProfession(), registration.getQuantite(), registration.getInteret(),
                  registration.getRoles());
          Role roleExist = roleRepertoire.findByNom(role.getNom());
          if(roleExist == null){
              roleRepertoire.save(role);
          }
          user.setRole(role);
          userRepertoire.save(user);
          return user;
      }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    //option qui permet de retourner un message disant que l'email ne correspond a aucun utilisateur

      public User findByEmail(String email) {
          return userRepertoire.findByEmail(email);

      }
  }
