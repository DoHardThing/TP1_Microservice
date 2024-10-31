package ma.projet.voiture.services;

import ma.projet.voiture.entities.Client;
import ma.projet.voiture.entities.Voiture;
import ma.projet.voiture.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {
    @Autowired
    private ClientService clientService;

    @Autowired
    private VoitureRepository voitureRepository;

    public Client clientById(Long id) {
        return clientService.clientById(id);
    }

    public Voiture enregistrerVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

}
