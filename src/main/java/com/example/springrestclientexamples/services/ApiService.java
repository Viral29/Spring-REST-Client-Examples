package com.example.springrestclientexamples.services;

import com.example.api.domain.User;
import com.example.api.domain.UserData;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ApiService {

    List<User> getUser(Integer limit);

    Flux<User> getUser(Mono<Integer> limit);
}
