package com.delivery.delivery_api.service.impl;

import com.delivery.delivery_api.dto.PedidoDTO;
import com.delivery.delivery_api.dto.PedidoResponseDTO;
import com.delivery.delivery_api.dto.ItemPedidoDTO;
import com.delivery.delivery_api.enums.StatusPedido;

import java.util.List;
import java.math.BigDecimal;

public class PedidoServiceImpl {
    PedidoResponseDTO criarPedido(PedidoDTO pedidoDTO);
    PedidoResponseDTO buscarPedidoPorId(Long id);
    
    
}
