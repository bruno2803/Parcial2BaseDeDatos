package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.Pedido;
import com.example.buensaborback.domain.enums.FormaPago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FacturaDto extends BaseDto{
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;
    private Pedido pedido;
}
