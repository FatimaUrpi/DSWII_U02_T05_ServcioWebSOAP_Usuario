//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.u02.t05.rol;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RolPermiso complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="RolPermiso">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="idRol" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="idPermiso" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="fechaAsignacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolPermiso", propOrder = {
    "id",
    "idRol",
    "idPermiso",
    "fechaAsignacion"
})
public class RolPermiso {

    protected long id;
    protected long idRol;
    protected long idPermiso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAsignacion;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

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
     * Obtiene el valor de la propiedad idPermiso.
     * 
     */
    public long getIdPermiso() {
        return idPermiso;
    }

    /**
     * Define el valor de la propiedad idPermiso.
     * 
     */
    public void setIdPermiso(long value) {
        this.idPermiso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAsignacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAsignacion() {
        return fechaAsignacion;
    }

    /**
     * Define el valor de la propiedad fechaAsignacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAsignacion(XMLGregorianCalendar value) {
        this.fechaAsignacion = value;
    }

}
