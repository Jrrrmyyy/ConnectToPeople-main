/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "matchr")
@NamedQueries({
    @NamedQuery(name = "Matchr.findAll", query = "SELECT m FROM Matchr m"),
    @NamedQuery(name = "Matchr.findByIdmatchR", query = "SELECT m FROM Matchr m WHERE m.idmatchR = :idmatchR")})
public class Matchr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmatchR")
    private Integer idmatchR;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario;
    @JoinColumn(name = "usuario_idusuario1", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matchRidmatchR")
    private List<Message> messageList;

    public Matchr() {
    }

    public Matchr(Integer idmatchR) {
        this.idmatchR = idmatchR;
    }

    public Integer getIdmatchR() {
        return idmatchR;
    }

    public void setIdmatchR(Integer idmatchR) {
        this.idmatchR = idmatchR;
    }

    public Usuario getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(Usuario usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public Usuario getUsuarioIdusuario1() {
        return usuarioIdusuario1;
    }

    public void setUsuarioIdusuario1(Usuario usuarioIdusuario1) {
        this.usuarioIdusuario1 = usuarioIdusuario1;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmatchR != null ? idmatchR.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matchr)) {
            return false;
        }
        Matchr other = (Matchr) object;
        if ((this.idmatchR == null && other.idmatchR != null) || (this.idmatchR != null && !this.idmatchR.equals(other.idmatchR))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Matchr[ idmatchR=" + idmatchR + " ]";
    }
    
}
