package io.github.VagnerBelfort.service;

import io.github.VagnerBelfort.domain.entity.Pedido;
import io.github.VagnerBelfort.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto );

    Optional<Pedido> obterPedidoCompleto(Integer id);
}
