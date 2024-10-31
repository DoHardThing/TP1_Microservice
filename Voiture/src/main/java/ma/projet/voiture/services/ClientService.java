package ma.projet.voiture.services;

import ma.projet.voiture.entities.Client;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="SERVICE-CLIENT")
public  interface  ClientService{
    @GetMapping(path="/client/{id}")
    public Client clientById(@PathVariable Long  id);
}

