package net.naour.tprestanng2.repositories;

import net.naour.tprestanng2.entities.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "centres")
public interface CentreRepository extends JpaRepository<Centre, Long> {
}
