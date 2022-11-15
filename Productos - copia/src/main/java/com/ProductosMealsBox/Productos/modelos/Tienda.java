package com.ProductosMealsBox.Productos.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tienda")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tienda {
    @Id
    @Column(name = "Nit", nullable = false)
    private String Nit;
    @Column(name = "Nombre",nullable=false)
    private String Nombre;
    @Column(name = "Telefono",nullable=false)
    private String Telefono;
    @Column(name = "Direccion",nullable=false)
    private String Direccion;
    @Column(name = "Correo",nullable=false)
    private String Correo;

    @ManyToOne
    @JoinColumn(name = "Usuario",referencedColumnName="Usuario_Documento_id",nullable=false)
    private Usuario usuario;

}
