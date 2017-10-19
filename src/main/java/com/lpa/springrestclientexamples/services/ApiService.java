package com.lpa.springrestclientexamples.services;

import com.lpa.springrestclientexamples.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
