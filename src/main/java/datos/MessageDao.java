/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Message;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface MessageDao {
   public List<Message> findAllMessages();
    
    public Message findMessageByID(Message message);
    
    public Message findMessageByUsuario(Message message);
    
    public void insertar(Message message);
    
    public void delete(Message message);
    
}
