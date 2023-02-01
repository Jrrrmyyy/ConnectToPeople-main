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
@Table(name = "matcha")
@NamedQueries({
    @NamedQuery(name = "Matcha.findAll", query = "SELECT m FROM Matcha m"),
    @NamedQuery(name = "Matcha.findByIdmatchA", query = "SELECT m FROM Matcha m WHERE m.idmatchA = :idmatchA")})
public class Matcha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmatchA")
    private Integer idmatchA;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario;
    @JoinColumn(name = "usuario_idusuario1", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matchAidmatchA")
    private List<Message> messageList;

    public Matcha() {
    }

    public Matcha(Integer idmatchA) {
        this.idmatchA = idmatchA;
    }

    public Integer getIdmatchA() {
        return idmatchA;
    }

    public void setIdmatchA(Integer idmatchA) {
        this.idmatchA = idmatchA;
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
        hash += (idmatchA != null ? idmatchA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matcha)) {
            return false;
        }
        Matcha other = (Matcha) object;
        if ((this.idmatchA == null && other.idmatchA != null) || (this.idmatchA != null && !this.idmatchA.equals(other.idmatchA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Matcha[ idmatchA=" + idmatchA + " ]";
    }
    
}
