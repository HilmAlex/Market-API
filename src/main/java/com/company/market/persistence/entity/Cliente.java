package com.company.market.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public @Data class Cliente {

    @Id
    @Column(name = "id")
    private String idCliente;

    private String nombre;

    private String apellidos;

    private Long celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    // Un cliente tiene muchas compras, mapeamos la relación a la clase creada en compra
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}
