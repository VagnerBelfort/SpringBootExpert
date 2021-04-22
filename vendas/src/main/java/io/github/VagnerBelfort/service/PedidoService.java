package io.github.VagnerBelfort.service;

import io.github.VagnerBelfort.domain.entity.Pedido;
import io.github.VagnerBelfort.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto );
}
