package com.dev.backend.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Estado;
import com.dev.backend.repository.EstadoRepository;

@SuppressWarnings("unused")
@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos() {
        return estadoRepository.findAll();
    }

    public Estado inseri(Estado estado) {
        estado.setDataCriacao(new java.util.Date());
        Estado estadoNovo = estadoRepository.saveAndFlush(estado);
        return estadoNovo;
    }

    public Estado alterar(Estado estado) {
        estado.setDataAtualizacao(new java.util.Date());
        return estadoRepository.saveAndFlush(estado);
    }

    // public void excluir(Long id) {
    //     Optional<Estado> estado = estadoRepository.findById(id);
    //     estadoRepository.delete(estado);
    // }
    public void excluir(Long id) {
        Optional<Estado> estado = estadoRepository.findById(id);
        if (estado.isPresent()) {
            estadoRepository.delete(estado.get());  // Extrai o estado de dentro do Optional e o deleta
        }
    }
    
    
}
