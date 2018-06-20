package com.example.springrestclientexamples.services;

import com.example.api.domain.User;
import com.example.api.domain.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    private final String api_url;

    public ApiServiceImpl(RestTemplate restTemplate,@Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public List<User> getUser(Integer limit) {

        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(api_url)
                .queryParam("limit",limit);

        UserData userData =restTemplate.getForObject(builder.toUriString(),UserData.class);

        return userData.getData();
    }
}
