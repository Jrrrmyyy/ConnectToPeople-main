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
@Table(name = "matchactividades")
@NamedQueries({
    @NamedQuery(name = "Matchactividades.findAll", query = "SELECT m FROM Matchactividades m"),
    @NamedQuery(name = "Matchactividades.findByIdmatchActividades", query = "SELECT m FROM Matchactividades m WHERE m.idmatchActividades = :idmatchActividades")})
public class Matchactividades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmatchActividades")
    private Integer idmatchActividades;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matchActividadesidmatchActividades")
    private List<Message> messageList;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario;
    @JoinColumn(name = "usuario_idusuario1", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario1;

    public Matchactividades() {
    }

    public Matchactividades(Integer idmatchActividades) {
        this.idmatchActividades = idmatchActividades;
    }

    public Integer getIdmatchActividades() {
        return idmatchActividades;
    }

    public void setIdmatchActividades(Integer idmatchActividades) {
        this.idmatchActividades = idmatchActividades;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmatchActividades != null ? idmatchActividades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matchactividades)) {
            return false;
        }
        Matchactividades other = (Matchactividades) object;
        if ((this.idmatchActividades == null && other.idmatchActividades != null) || (this.idmatchActividades != null && !this.idmatchActividades.equals(other.idmatchActividades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Matchactividades[ idmatchActividades=" + idmatchActividades + " ]";
    }
    
}
