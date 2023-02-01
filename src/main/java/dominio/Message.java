/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "message")
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m"),
    @NamedQuery(name = "Message.findByIdmessage", query = "SELECT m FROM Message m WHERE m.idmessage = :idmessage"),
    @NamedQuery(name = "Message.findByMessage", query = "SELECT m FROM Message m WHERE m.message = :message"),
    @NamedQuery(name = "Message.findByFecha", query = "SELECT m FROM Message m WHERE m.fecha = :fecha")})
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmessage")
    private Integer idmessage;
    @Size(max = 400)
    @Column(name = "message")
    private String message;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "matchA_idmatchA", referencedColumnName = "idmatchA")
    @ManyToOne(optional = false)
    private Matcha matchAidmatchA;
    @JoinColumn(name = "matchActividades_idmatchActividades", referencedColumnName = "idmatchActividades")
    @ManyToOne(optional = false)
    private Matchactividades matchActividadesidmatchActividades;
    @JoinColumn(name = "matchR_idmatchR", referencedColumnName = "idmatchR")
    @ManyToOne(optional = false)
    private Matchr matchRidmatchR;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario;

    public Message() {
    }

    public Message(Integer idmessage) {
        this.idmessage = idmessage;
    }

    public Integer getIdmessage() {
        return idmessage;
    }

    public void setIdmessage(Integer idmessage) {
        this.idmessage = idmessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Matcha getMatchAidmatchA() {
        return matchAidmatchA;
    }

    public void setMatchAidmatchA(Matcha matchAidmatchA) {
        this.matchAidmatchA = matchAidmatchA;
    }

    public Matchactividades getMatchActividadesidmatchActividades() {
        return matchActividadesidmatchActividades;
    }

    public void setMatchActividadesidmatchActividades(Matchactividades matchActividadesidmatchActividades) {
        this.matchActividadesidmatchActividades = matchActividadesidmatchActividades;
    }

    public Matchr getMatchRidmatchR() {
        return matchRidmatchR;
    }

    public void setMatchRidmatchR(Matchr matchRidmatchR) {
        this.matchRidmatchR = matchRidmatchR;
    }

    public Usuario getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(Usuario usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmessage != null ? idmessage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.idmessage == null && other.idmessage != null) || (this.idmessage != null && !this.idmessage.equals(other.idmessage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Message[ idmessage=" + idmessage + " ]";
    }
    
}
