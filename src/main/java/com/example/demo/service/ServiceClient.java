package com.example.demo.service;

import com.example.demo.model.ClientRequest;
import com.example.demo.model.ClientResponse;

import java.util.List;

public interface ServiceClient {

    List<ClientResponse> list();

    ClientResponse get(Integer id);

    ClientResponse add(ClientRequest rq);

    void remove(Integer id);

    void removeAll();

}
