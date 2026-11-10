package com.baozistore.dto;

/**
 * Corpo JSON recebido para criar/atualizar um pedido:
 * { "clienteId": 1, "produtoId": 1, "quantidade": 6 }
 */
public class PedidoRequest {

    private Long clienteId;
    private Long produtoId;
    private Integer quantidade;

    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }

    public Long getProdutoId() { return produtoId; }
    public void setProdutoId(Long produtoId) { this.produtoId = produtoId; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
}
