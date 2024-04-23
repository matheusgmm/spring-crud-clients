package com.muccio.crudclient.services;

import com.muccio.crudclient.dtos.ClientDTO;
import com.muccio.crudclient.entities.Client;
import com.muccio.crudclient.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).orElseThrow();
        return new ClientDTO(client);
    }


}
