package com.lpa.springrestclientexamples.services;

import com.lpa.springrestclientexamples.api.domain.User;
import com.lpa.springrestclientexamples.api.domain.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {
    private final String apiUrl;
    private RestTemplate restTemplate;

    public ApiServiceImpl(@Value("${api.url}") String apiUrl, RestTemplate restTemplate) {
        this.apiUrl = apiUrl;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
                .fromUriString(apiUrl)
                .queryParam("limit", limit);

        UserData userData = restTemplate.getForObject(uriComponentsBuilder.toUriString(), UserData.class);
        return userData.getData();
    }
}
