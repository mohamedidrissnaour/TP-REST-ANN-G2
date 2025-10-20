package net.naour.tprestanng2;

import net.naour.tprestanng2.entities.Centre;
import net.naour.tprestanng2.entities.Etudiant;
import net.naour.tprestanng2.entities.Genre;
import net.naour.tprestanng2.repositories.CentreRepository;
import net.naour.tprestanng2.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpRestAnnG2Application implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(TpRestAnnG2Application.class, args);
    }



    @Override
    public void run(String... args) throws Exception {



        Centre centre1 = centreRepository.save(Centre.builder()
                .nom("EMSI ROUDANI")
                .adresse("Casablanca Maarif")
                .build()
        );

        etudiantRepository.save(Etudiant.builder()
                .nom("Houssam")
                .prenom("Chekkal")
                .genre(Genre.Homme)
                        .centre(centre1)
                .build());

        etudiantRepository.save(Etudiant.builder()
                .nom("Dris")
                .prenom("Naour")
                .genre(Genre.Homme)
                .centre(centre1)
                .build());

        etudiantRepository.save(Etudiant.builder()
                .nom("doha")
                .prenom("Zwina")
                .genre(Genre.Femme)
                .centre(centre1)
                .build());
    }
}
