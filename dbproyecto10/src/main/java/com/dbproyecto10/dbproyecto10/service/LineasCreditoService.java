package com.dbproyecto10.dbproyecto10.service;

import com.dbproyecto10.dbproyecto10.model.LineaCredito;
import com.dbproyecto10.dbproyecto10.repository.LineasCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LineasCreditoService {
   @Autowired
    private LineasCreditoRepository lineasCreditoRepository;


   public LineaCredito insertarLineasCredito(LineaCredito lineaCredito) {

       return lineasCreditoRepository.save(lineaCredito);

   }

   public List<LineaCredito>consultarLineasCredit(){

       return lineasCreditoRepository.findAll();
   }




}
