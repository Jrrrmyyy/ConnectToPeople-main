/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import datos.MessageDao;
import dominio.Message;
import java.util.List;
import javax.ejb.Local;
import javax.inject.Inject;

/**
 *
 * @author jimyj
 */
@Local
public class MessageoServiceImpl implements MessageoService {

    @Inject
    private MessageDao messageDao;
    
    @Override
    public List<Message> listarMensajes() {
       return messageDao.findAllMessages();
    }

    @Override
    public Message encontrarMensajePorID(Message message) {
        return messageDao.findMessageByID(message);
    }

    @Override
    public Message econtrarMensajePorUsername(Message message) {
        return messageDao.findMessageByUsuario(message);
    }

    @Override
    public void eliminar(Message message) {
        messageDao.delete(message);
    }
    
}
