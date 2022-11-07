package com.nttdata.bootcamp.clientservice.repository;

import com.nttdata.bootcamp.clientservice.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository<Client, String> {
}
