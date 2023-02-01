/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Matchactividades;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alumno Mañana
 */
public class MatchActividadesDaoImpl implements MatchActividadesDao {

         //El EJB se encarga de forma automatica de hacer transacciones.
    
    //Ahora inyectamos la unidad de persistencia a través del API de JPA
    //Simplemente tenemos que usar la anotación e indicar el nombre de nuestra
    //unidad de persistencia
    @PersistenceContext(unitName="CTPJim")
    EntityManager em;
    
    //Con este objeto de em ya podemos interactuar con nuestra BBDD

    
    
    @Override
    public List<Matchactividades> findAllActividades() {
       // Creamos un NamedQuery, y el listado lo leemos con getResultList
        // Por lo que estamos escribiendo menos código
        return em.createNamedQuery("Matchactividades.findAll").getResultList();
  
    }

    @Override
    public Matchactividades findActividadesByID(Matchactividades matchactividades) {
          // Especificamos la clase que queremos buscar y luego el campo por el 
        // que queremos buscar
        return em.find(Matchactividades.class, matchactividades.getIdmatchActividades());
    }

    @Override
    public Matchactividades findACtividadesByFecha(Matchactividades matchactividades) {
               // En este caso no vamos a usar un NamedQuery, que podríamos haber 
        // agregado en la Entidad de Usuario sino que vamos a incluirlo directamente.
        Query query = em.createQuery("Matchactividades.findByUsername");
        query.setParameter("fecha", matchactividades.getMessageList());
        return (Matchactividades) query.getSingleResult();                
    
    }

    @Override
    public void insertar(Matchactividades matchactividades) {
       em.persist(matchactividades);
    }

    @Override
    public void update(Matchactividades matchactividades) {
        em.merge(matchactividades);
    }

    @Override
    public void delete(Matchactividades matchactividades) {
    em.remove(em.merge(matchactividades));    
    }
    
}
