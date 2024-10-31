package ma.projet.voiture.repositories;

import ma.projet.voiture.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

