//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.u02.t05.rol;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.dswii.u02.t05.rol package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.dswii.u02.t05.rol
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRolRequest }
     * 
     * @return
     *     the new instance of {@link GetRolRequest }
     */
    public GetRolRequest createGetRolRequest() {
        return new GetRolRequest();
    }

    /**
     * Create an instance of {@link GetRolResponse }
     * 
     * @return
     *     the new instance of {@link GetRolResponse }
     */
    public GetRolResponse createGetRolResponse() {
        return new GetRolResponse();
    }

    /**
     * Create an instance of {@link Rol }
     * 
     * @return
     *     the new instance of {@link Rol }
     */
    public Rol createRol() {
        return new Rol();
    }

    /**
     * Create an instance of {@link RolPermiso }
     * 
     * @return
     *     the new instance of {@link RolPermiso }
     */
    public RolPermiso createRolPermiso() {
        return new RolPermiso();
    }

    /**
     * Create an instance of {@link UsuarioRol }
     * 
     * @return
     *     the new instance of {@link UsuarioRol }
     */
    public UsuarioRol createUsuarioRol() {
        return new UsuarioRol();
    }

}
