/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
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
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "media")
@NamedQueries({
    @NamedQuery(name = "Media.findAll", query = "SELECT m FROM Media m"),
    @NamedQuery(name = "Media.findByIdmedia", query = "SELECT m FROM Media m WHERE m.idmedia = :idmedia"),
    @NamedQuery(name = "Media.findByFoto", query = "SELECT m FROM Media m WHERE m.foto = :foto")})
public class Media implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmedia")
    private Integer idmedia;
    @Size(max = 195)
    @Column(name = "foto")
    private String foto;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario;

    public Media() {
    }

    public Media(Integer idmedia) {
        this.idmedia = idmedia;
    }

    public Integer getIdmedia() {
        return idmedia;
    }

    public void setIdmedia(Integer idmedia) {
        this.idmedia = idmedia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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
        hash += (idmedia != null ? idmedia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Media)) {
            return false;
        }
        Media other = (Media) object;
        if ((this.idmedia == null && other.idmedia != null) || (this.idmedia != null && !this.idmedia.equals(other.idmedia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Media[ idmedia=" + idmedia + " ]";
    }
    
}
