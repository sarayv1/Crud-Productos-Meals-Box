package com.ProductosMealsBox.Productos.servicio.usuario;

import com.ProductosMealsBox.Productos.consultas.usuario.IUsuarioConsultas;
import com.ProductosMealsBox.Productos.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.print.Doc;
@Service


public class UsuarioServicio {
    @Autowired
    private IUsuarioConsultas usuarioConsultas;

   @Override
   public List<Usuario> getAll() { return usuarioConsultas.findAll();   }
}
