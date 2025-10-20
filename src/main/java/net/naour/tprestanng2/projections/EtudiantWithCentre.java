package net.naour.tprestanng2.projections;

import net.naour.tprestanng2.entities.Etudiant;
import net.naour.tprestanng2.entities.Genre;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "etudiantWithCentre", types = Etudiant.class)

public interface EtudiantWithCentre {
    Long getId();
    String getNom();
    String getPrenom();
    Genre getGenre();
    CentreExcerpt getCentre();

    interface CentreExcerpt {
        Long getId();
        String getNom();
        String getAdresse();
    }
}
