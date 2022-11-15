package com.ProductosMealsBox.Productos.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="productos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Productos {
    @Id
    @Column(name = "Codigo", nullable = false)
    private Long Codigo;
    @Column(name = "Nombre",nullable=false)
    private String Nombre;
    @Column(name = "Categoria",nullable=false)
    private String Categoria;
    @Column(name = "valor_venta",nullable=false)
    private String valor_venta;
    @Column(name = "valor_compra",nullable=false)
    private String valor_compra;

    @ManyToOne
    @JoinColumn(name = "Tienda_nit",referencedColumnName="Tienda_ni",nullable=false)
    private Tienda tienda;
}
