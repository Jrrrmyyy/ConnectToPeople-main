/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import datos.UsuarioDao;
import dominio.Usuario;
import java.util.List;
import javax.ejb.Local;
import javax.inject.Inject;

/**
 *
 * @author jimyj
 */
@Local
public class UsuarioServiceImpl  implements UsuarioService{

   // Gracias a que estamos en un entorno EE podemos usar CDI para inyectar usuarioDao
    @Inject    
    private UsuarioDao usuarioDao;
    
    // Ahora nos apoyamos de la interfaz para completar los servicios
    
    @Override
    public List<Usuario> listarUsuarios() {       
        return usuarioDao.findAllPersonas();
    }

    @Override
    public Usuario encontrarUsuarioPorID(Usuario usuario) {
        return usuarioDao.findPersonaByID(usuario);
    }

    @Override
    public Usuario econtrarUsuarioPorCorreo(Usuario usuario) {
        return usuarioDao.findPersonaByEmail(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDao.insertar(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDao.update(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.delete(usuario);
    }
    
}
