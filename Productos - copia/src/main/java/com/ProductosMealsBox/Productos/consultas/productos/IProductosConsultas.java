package com.ProductosMealsBox.Productos.consultas.productos;

import com.ProductosMealsBox.Productos.modelos.Productos;
import com.ProductosMealsBox.Productos.modelos.Tienda;
import com.ProductosMealsBox.Productos.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IProductosConsultas extends JpaRepository<Productos,Long> {
    Optional<Tienda> findByProductosAndNIT(Long Coidgo,String Nit);
}
