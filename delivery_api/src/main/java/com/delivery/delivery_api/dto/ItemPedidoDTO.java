package com.delivery.delivery_api.dto;

import jakarta.validation.constraints.*;

public class ItemPedidoDTO {
    @NotNull (message = "Produto é obrigatório.");
    
}
