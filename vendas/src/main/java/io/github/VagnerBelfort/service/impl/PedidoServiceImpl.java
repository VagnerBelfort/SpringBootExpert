package io.github.VagnerBelfort.service.impl;

import io.github.VagnerBelfort.domain.repository.Pedidos;
import io.github.VagnerBelfort.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}