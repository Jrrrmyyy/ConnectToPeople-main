/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Matchactividades;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface MatchActividadesDao {
    
       public List<Matchactividades> findAllActividades();
    
    public Matchactividades findActividadesByID(Matchactividades matchactividades);
    
    public Matchactividades findACtividadesByFecha(Matchactividades matchactividades);
    
    public void insertar(Matchactividades matchactividades);

    public void update(Matchactividades matchactividades);
    
    public void delete(Matchactividades matchactividades); 
}
