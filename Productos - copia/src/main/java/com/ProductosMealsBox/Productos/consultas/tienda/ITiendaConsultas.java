package com.ProductosMealsBox.Productos.consultas.tienda;

import com.ProductosMealsBox.Productos.modelos.Tienda;
import com.ProductosMealsBox.Productos.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ITiendaConsultas extends JpaRepository<Tienda,String> {
    Optional<Tienda> findByUsuarioAndNIT(String Nit,Long Usuario);
}
