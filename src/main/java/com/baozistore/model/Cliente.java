package com.baozistore.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "cliente_desde")
    private LocalDate clienteDesde;

    public Cliente() {
    }

    public Cliente(String nome, LocalDate clienteDesde) {
        this.nome = nome;
        this.clienteDesde = clienteDesde;
    }

    // Se a data não for enviada, usa a data de hoje
    @PrePersist
    void definirDataPadrao() {
        if (clienteDesde == null) {
            clienteDesde = LocalDate.now();
        }
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getClienteDesde() { return clienteDesde; }
    public void setClienteDesde(LocalDate clienteDesde) { this.clienteDesde = clienteDesde; }
}
