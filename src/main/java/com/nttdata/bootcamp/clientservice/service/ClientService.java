package com.nttdata.bootcamp.clientservice.service;

import com.nttdata.bootcamp.clientservice.dto.ClientRequest;
import com.nttdata.bootcamp.clientservice.dto.ClientResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    Flux<ClientResponse> getAll();

    Mono<ClientResponse> save(ClientRequest clientRequest);
}
