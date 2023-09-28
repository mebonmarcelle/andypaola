package com.example.temp.enregistrement;

import com.example.temp.user.Role;
import lombok.Data;


  //.....
@Data
public class RegistrationRequest {

      private String Nom;
    private  String Prenom;
    private String Email;
    private String Mot_de_passe;
    private  String Type_donateur;
    private  int Telephone;
    private String Adresse;
    private String Profession;
    private String Quantite;
    private String Interet;
    private Role roles;


  }
