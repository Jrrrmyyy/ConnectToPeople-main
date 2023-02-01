/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Usuario;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface UsuarioDao {
       public List<Usuario> findAllPersonas();
    
    public Usuario findPersonaByID(Usuario usuario);
    
    public Usuario findPersonaByEmail(Usuario usuario);
    
    public void insertar(Usuario usuario);

    public void update(Usuario usuario);
    
    public void delete(Usuario usuario); 
        
    
}
