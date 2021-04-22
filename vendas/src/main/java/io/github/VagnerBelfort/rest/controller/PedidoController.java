package io.github.VagnerBelfort.rest.controller;

import io.github.VagnerBelfort.domain.entity.Pedido;
import io.github.VagnerBelfort.rest.dto.PedidoDTO;
import io.github.VagnerBelfort.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer save( @RequestBody PedidoDTO dto){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }

}
