package com.dbproyecto10.dbproyecto10.controller;

import com.dbproyecto10.dbproyecto10.model.Cliente;
import com.dbproyecto10.dbproyecto10.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
   @PostMapping("/insertar")
   public Cliente insertar(@RequestBody Cliente cliente){
        try{
            return clienteService.insertarCliente(cliente);
        }catch (RuntimeException e){
            throw new RuntimeException("Error al insertar el cliente",e);
        }

   }

   @GetMapping("/consultar")
    public List<Cliente> consultar(){
        try{
            return clienteService.consultarCliente();
        }catch (RuntimeException e){
            throw new RuntimeException("Error al consultar los clientes",e);
        }
    }


}
