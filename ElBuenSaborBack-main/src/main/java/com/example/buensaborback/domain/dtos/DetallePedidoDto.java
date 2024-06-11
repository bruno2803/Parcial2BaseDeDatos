package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.Articulo;
import com.example.buensaborback.domain.entities.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetallePedidoDto extends BaseDto{

    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;
    private Pedido pedido;
}
