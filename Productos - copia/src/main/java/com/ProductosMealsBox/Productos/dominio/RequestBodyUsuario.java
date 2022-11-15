package com.ProductosMealsBox.Productos.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestBodyUsuario {
    private Long Documento_id;
    private String Nombre;
    private String Apellido;
    private String Correo_electronico;
    private String Clave;
    private String Direccion;
    private String Telefono;
    private String Foto;

}
