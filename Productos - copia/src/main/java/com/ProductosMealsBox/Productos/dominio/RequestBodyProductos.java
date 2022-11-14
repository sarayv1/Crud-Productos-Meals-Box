package com.ProductosMealsBox.Productos.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestBodyProductos {
    private Long Codigo;
    private String Nombre;
    private String Categoria;
    private int valor_venta;
    private int valor_compra;
    private String tienda;
}
