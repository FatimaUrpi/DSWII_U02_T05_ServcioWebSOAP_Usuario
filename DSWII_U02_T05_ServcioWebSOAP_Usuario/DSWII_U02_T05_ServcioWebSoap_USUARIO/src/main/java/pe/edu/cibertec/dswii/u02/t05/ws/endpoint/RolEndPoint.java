package pe.edu.cibertec.dswii.u02.t05.ws.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.dswii.u02.t05.rol.GetRolRequest;
import pe.edu.cibertec.dswii.u02.t05.rol.GetRolResponse;
import pe.edu.cibertec.dswii.u02.t05.rol.Rol;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

@Endpoint
public class RolEndPoint {

    private static final String NAMESPACE_URI_ROL = "http://t05.u02.dswii.cibertec.edu.pe/rol-service";
    private static final Logger log = LoggerFactory.getLogger(RolEndPoint.class);

    @PayloadRoot(namespace = NAMESPACE_URI_ROL, localPart = "GetRolRequest")
    @ResponsePayload
    public GetRolResponse getRol(@RequestPayload GetRolRequest request) {
        GetRolResponse response = new GetRolResponse();
        Rol nuevoRol = new Rol();

        nuevoRol.setIdRol(request.getId());
        nuevoRol.setNombre("Rol de prueba");
        nuevoRol.setDescripcion("Descripción de prueba");

        try {
            // Crear instancias de XMLGregorianCalendar
            //Sirve para poder setear fechas tipo XML calendar como las de nuestra entidad
            XMLGregorianCalendar fechaCreacion = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(new GregorianCalendar());
            XMLGregorianCalendar fechaActualizacion = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(new GregorianCalendar());

            // Asignar las fechas
            nuevoRol.setFechaCreacion(fechaCreacion);
            nuevoRol.setFechaActualizacion(fechaActualizacion);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }

        response.setRol(nuevoRol);
        return response;
    }
}
