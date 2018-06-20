package com.example.springrestclientexamples.services;

import com.example.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUser(Integer limit);
}
