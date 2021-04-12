package io.github.VagnerBelfort.domain.repository;

import io.github.VagnerBelfort.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
