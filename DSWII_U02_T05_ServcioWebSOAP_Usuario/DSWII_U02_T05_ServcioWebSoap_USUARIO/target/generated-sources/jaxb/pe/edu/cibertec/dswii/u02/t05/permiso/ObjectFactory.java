//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.u02.t05.permiso;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.dswii.u02.t05.permiso package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.dswii.u02.t05.permiso
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPermisoRequest }
     * 
     * @return
     *     the new instance of {@link GetPermisoRequest }
     */
    public GetPermisoRequest createGetPermisoRequest() {
        return new GetPermisoRequest();
    }

    /**
     * Create an instance of {@link GetPermisoResponse }
     * 
     * @return
     *     the new instance of {@link GetPermisoResponse }
     */
    public GetPermisoResponse createGetPermisoResponse() {
        return new GetPermisoResponse();
    }

    /**
     * Create an instance of {@link Permiso }
     * 
     * @return
     *     the new instance of {@link Permiso }
     */
    public Permiso createPermiso() {
        return new Permiso();
    }

}
