package com.example.temp.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import java.util.Collection;
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "utilisateurs")
  //Definition des attributs
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private  String prenom;

    @NaturalId(mutable = true)
    private String email;
    private String mot_de_passe;
    private  String type_donateur;
    private  int telephone;
    private String adresse;
    private String profession;
    private String quatite;
    private String interet;
    private boolean activer;
    private boolean desactiver;
    private boolean isEnabled = false;

     //......
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name= "user_roles", joinColumns = @JoinColumn(name = "user_id",
//    referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id",
//    referencedColumnName = "id"))
    @ManyToOne
    private Role role;

    //Constructeur genere

    public User(String nom, String prenom, String email, String mot_de_passe, String type_donateur, int telephone, String adresse, String profession, String quantite, String interet, Role role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
        this.type_donateur = type_donateur;
        this.telephone = telephone;
        this.adresse = adresse;
        this.profession = profession;
        this.quatite = quantite;
        this.interet = interet;
        this.role = role;

    }
}
