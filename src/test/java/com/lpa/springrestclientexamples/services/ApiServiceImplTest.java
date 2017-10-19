package com.lpa.springrestclientexamples.services;

import com.lpa.springrestclientexamples.api.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ApiServiceImplTest {
    @Autowired
    private ApiService apiService;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getUsers() throws Exception {
        List<User> users = apiService.getUsers(3);

        assertEquals(4, users.size());
    }

}