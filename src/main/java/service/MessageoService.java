/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dominio.Message;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jimyj
 */
@Local
public interface MessageoService {
      public List<Message> listarMensajes();
    
    public Message encontrarMensajePorID(Message message);
    
    public Message econtrarMensajePorUsername(Message message);
    
    public void eliminar(Message message);
}
