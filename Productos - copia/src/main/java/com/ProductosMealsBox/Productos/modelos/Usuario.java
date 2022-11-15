package com.ProductosMealsBox.Productos.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @Column(name = "Documento_id")
    private Long Documento_id;

    @Column(name = "Nombre",nullable=false)
    private String Nombre;
    @Column(name = "Apellido",nullable=false)
    private String Apellido;
    @Column(name = "Correo_electronico",nullable=false)
    private String Correo_electronico;
    @Column(name = "Clave",nullable=false)
    private String Clave;
    @Column(name = "Direccion",nullable=false)
    private String Direccion;
    @Column(name = "Telefono",nullable=false)
    private String Telefono;
    @Column(name = "Foto",nullable=false)
    private String Foto;



}
