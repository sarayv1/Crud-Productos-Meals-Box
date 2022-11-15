package com.ProductosMealsBox.Productos.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class RequestBodyTienda {
    private String Nit;
    private String Nombre;
    private String Telefono;
    private String Direccion;
    private String Correo;
    private Long usuario;
   }