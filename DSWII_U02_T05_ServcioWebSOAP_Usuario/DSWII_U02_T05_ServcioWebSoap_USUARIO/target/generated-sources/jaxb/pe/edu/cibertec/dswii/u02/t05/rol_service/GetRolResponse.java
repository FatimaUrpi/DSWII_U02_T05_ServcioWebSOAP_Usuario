//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.u02.t05.rol_service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rol" type="{http://t05.u02.dswii.cibertec.edu.pe/rol-service}Rol"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rol"
})
@XmlRootElement(name = "GetRolResponse")
public class GetRolResponse {

    @XmlElement(required = true)
    protected Rol rol;

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link Rol }
     *     
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link Rol }
     *     
     */
    public void setRol(Rol value) {
        this.rol = value;
    }

}
