/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Message;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alumno Mañana
 */
public class MessageDaoImpl implements MessageDao{

         //El EJB se encarga de forma automatica de hacer transacciones.
    
    //Ahora inyectamos la unidad de persistencia a través del API de JPA
    //Simplemente tenemos que usar la anotación e indicar el nombre de nuestra
    //unidad de persistencia
    @PersistenceContext(unitName="CTPJim")
    EntityManager em;
    
    //Con este objeto de em ya podemos interactuar con nuestra BBDD
    
    @Override
    public List<Message> findAllMessages() {
        
        return em.createNamedQuery("Message.findAll").getResultList();
    }

    @Override
    public Message findMessageByID(Message message) {
        return em.find(Message.class, message.getIdmessage());
    }

    @Override
    public Message findMessageByUsuario(Message message) {
        Query query = em.createQuery("Message.findByUsuario");
        query.setParameter("usuario", message.getUsuarioIdusuario());
        return (Message) query.getSingleResult();
    }

    @Override
    public void insertar(Message message) {
        em.persist(message);
    }

    @Override
    public void delete(Message message) {
        em.remove(em.merge(message));
    }
    
}
