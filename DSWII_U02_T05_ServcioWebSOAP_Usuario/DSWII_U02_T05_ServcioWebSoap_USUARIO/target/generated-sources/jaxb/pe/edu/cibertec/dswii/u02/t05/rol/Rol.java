//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.u02.t05.rol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Rol complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="Rol">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="idRol" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="usuarios" type="{http://t05.u02.dswii.cibertec.edu.pe/rol-service}UsuarioRol" maxOccurs="unbounded"/>
 *         <element name="permisos" type="{http://t05.u02.dswii.cibertec.edu.pe/rol-service}RolPermiso" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rol", propOrder = {
    "idRol",
    "nombre",
    "descripcion",
    "fechaCreacion",
    "fechaActualizacion",
    "usuarios",
    "permisos"
})
public class Rol {

    protected long idRol;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacion;
    @XmlElement(required = true)
    protected List<UsuarioRol> usuarios;
    @XmlElement(required = true)
    protected List<RolPermiso> permisos;

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     */
    public long getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     */
    public void setIdRol(long value) {
        this.idRol = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacion(XMLGregorianCalendar value) {
        this.fechaActualizacion = value;
    }

    /**
     * Gets the value of the usuarios property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuarios property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUsuarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioRol }
     * </p>
     * 
     * 
     * @return
     *     The value of the usuarios property.
     */
    public List<UsuarioRol> getUsuarios() {
        if (usuarios == null) {
            usuarios = new ArrayList<>();
        }
        return this.usuarios;
    }

    /**
     * Gets the value of the permisos property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permisos property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPermisos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolPermiso }
     * </p>
     * 
     * 
     * @return
     *     The value of the permisos property.
     */
    public List<RolPermiso> getPermisos() {
        if (permisos == null) {
            permisos = new ArrayList<>();
        }
        return this.permisos;
    }

}
