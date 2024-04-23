package com.muccio.crudclient.repositories;

import com.muccio.crudclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
