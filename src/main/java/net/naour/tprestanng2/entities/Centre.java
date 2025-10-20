package net.naour.tprestanng2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "centres")
public class Centre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="nom_centre", nullable=false)
    String nom;
    @Column(name="adresse_centre")
    String adresse;
    @OneToMany
    List<Etudiant> etudiants;

}
