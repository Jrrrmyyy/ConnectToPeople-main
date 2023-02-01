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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario"),
    @NamedQuery(name = "Usuario.findByNick", query = "SELECT u FROM Usuario u WHERE u.nick = :nick"),
    @NamedQuery(name = "Usuario.findByContrase\u00f1a", query = "SELECT u FROM Usuario u WHERE u.contrase\u00f1a = :contrase\u00f1a"),
    @NamedQuery(name = "Usuario.findByCorreo", query = "SELECT u FROM Usuario u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuario.findByGenero", query = "SELECT u FROM Usuario u WHERE u.genero = :genero"),
    @NamedQuery(name = "Usuario.findByEdad", query = "SELECT u FROM Usuario u WHERE u.edad = :edad"),
    @NamedQuery(name = "Usuario.findByLongitud", query = "SELECT u FROM Usuario u WHERE u.longitud = :longitud"),
    @NamedQuery(name = "Usuario.findByLatitud", query = "SELECT u FROM Usuario u WHERE u.latitud = :latitud"),
    @NamedQuery(name = "Usuario.findByBiografia", query = "SELECT u FROM Usuario u WHERE u.biografia = :biografia"),
    @NamedQuery(name = "Usuario.findByCiudad", query = "SELECT u FROM Usuario u WHERE u.ciudad = :ciudad")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario")
    private Integer idusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nick")
    private String nick;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 65)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitud")
    private double longitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "latitud")
    private double latitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 155)
    @Column(name = "biografia")
    private String biografia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ciudad")
    private String ciudad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario")
    private List<Matchr> matchrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario1")
    private List<Matchr> matchrList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario")
    private List<Matcha> matchaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario1")
    private List<Matcha> matchaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario")
    private List<Media> mediaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario")
    private List<Message> messageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario")
    private List<Matchactividades> matchactividadesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario1")
    private List<Matchactividades> matchactividadesList1;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(Integer idusuario, String nick, String contraseña, String correo, String genero, int edad, double longitud, double latitud, String biografia, String ciudad) {
        this.idusuario = idusuario;
        this.nick = nick;
        this.contraseña = contraseña;
        this.correo = correo;
        this.genero = genero;
        this.edad = edad;
        this.longitud = longitud;
        this.latitud = latitud;
        this.biografia = biografia;
        this.ciudad = ciudad;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Matchr> getMatchrList() {
        return matchrList;
    }

    public void setMatchrList(List<Matchr> matchrList) {
        this.matchrList = matchrList;
    }

    public List<Matchr> getMatchrList1() {
        return matchrList1;
    }

    public void setMatchrList1(List<Matchr> matchrList1) {
        this.matchrList1 = matchrList1;
    }

    public List<Matcha> getMatchaList() {
        return matchaList;
    }

    public void setMatchaList(List<Matcha> matchaList) {
        this.matchaList = matchaList;
    }

    public List<Matcha> getMatchaList1() {
        return matchaList1;
    }

    public void setMatchaList1(List<Matcha> matchaList1) {
        this.matchaList1 = matchaList1;
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public List<Matchactividades> getMatchactividadesList() {
        return matchactividadesList;
    }

    public void setMatchactividadesList(List<Matchactividades> matchactividadesList) {
        this.matchactividadesList = matchactividadesList;
    }

    public List<Matchactividades> getMatchactividadesList1() {
        return matchactividadesList1;
    }

    public void setMatchactividadesList1(List<Matchactividades> matchactividadesList1) {
        this.matchactividadesList1 = matchactividadesList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}
