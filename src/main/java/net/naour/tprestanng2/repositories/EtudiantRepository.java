package net.naour.tprestanng2.repositories;

import net.naour.tprestanng2.entities.Etudiant;
import net.naour.tprestanng2.projections.EtudiantWithCentre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "students", excerptProjection = EtudiantWithCentre.class)
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findEtudiantByNom(@Param("nom") String nom);
}
