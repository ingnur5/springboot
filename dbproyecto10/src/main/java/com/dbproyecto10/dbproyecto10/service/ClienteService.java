package com.dbproyecto10.dbproyecto10.service;

import com.dbproyecto10.dbproyecto10.model.Cliente;
import com.dbproyecto10.dbproyecto10.repository.ClienteRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente insertarCliente(Cliente cliente){
        try {
            return clienteRepository.save(cliente);

        }catch (DataAccessException e){

            throw new RuntimeException("Error al insertar el cliente" +e);
        }

    }

    public List<Cliente> consultarCliente(){
        return clienteRepository.findAll();
    }



}
