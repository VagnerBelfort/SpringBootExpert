package io.github.VagnerBelfort.domain.repository;

import io.github.VagnerBelfort.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
}
