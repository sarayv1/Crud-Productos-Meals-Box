package com.ProductosMealsBox.Productos.consultas.usuario;

import com.ProductosMealsBox.Productos.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsuarioConsultas extends JpaRepository<Usuario,Long> {
    Optional<Usuario> findById(Long Documento_id);
}
