package com.example.temp.user;

     // importation des dependances necessaires

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

// Identification avec les tables de la base de donnee et appel des constructeurs
@Entity
@NoArgsConstructor
@Getter
@Setter

     // Definition de la classe role qui sera rempli automatiquement en fonction du role de l'utilisateur
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @OneToMany
    private Collection<User> users;

    public Role(String nom){
        this.nom = nom;
    }
}
