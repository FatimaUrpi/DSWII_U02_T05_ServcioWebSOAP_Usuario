//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.u02.t05.permiso;

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
 *         <element name="permiso" type="{http://t05.u02.dswii.cibertec.edu.pe/permiso-service}Permiso"/>
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
    "permiso"
})
@XmlRootElement(name = "GetPermisoResponse")
public class GetPermisoResponse {

    @XmlElement(required = true)
    protected Permiso permiso;

    /**
     * Obtiene el valor de la propiedad permiso.
     * 
     * @return
     *     possible object is
     *     {@link Permiso }
     *     
     */
    public Permiso getPermiso() {
        return permiso;
    }

    /**
     * Define el valor de la propiedad permiso.
     * 
     * @param value
     *     allowed object is
     *     {@link Permiso }
     *     
     */
    public void setPermiso(Permiso value) {
        this.permiso = value;
    }

}
