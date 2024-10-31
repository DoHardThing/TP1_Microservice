package ma.projet.voiture.repositories;

import ma.projet.voiture.entities.Client;
import ma.projet.voiture.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long> {
    List<Voiture> findByClient(Client client);

}
