package pe.edu.cibertec.dswii.u02.t05.ws.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.dswii.u02.t05.permiso.GetPermisoRequest;
import pe.edu.cibertec.dswii.u02.t05.permiso.GetPermisoResponse;
import pe.edu.cibertec.dswii.u02.t05.permiso.Permiso;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;


@Endpoint
public class PermisoEndPoint {

    private static final String NAMESPACE_URI_PERMISO = "http://t05.u02.dswii.cibertec.edu.pe/permiso-service";
    private static final Logger log = LoggerFactory.getLogger(RolEndPoint.class);

    @PayloadRoot(namespace = NAMESPACE_URI_PERMISO, localPart = "GetPermisoRequest")
    @ResponsePayload
    public GetPermisoResponse getPermiso(@RequestPayload GetPermisoRequest request) {
        GetPermisoResponse response = new GetPermisoResponse();;
        Permiso nuevoPermiso = new Permiso();

        nuevoPermiso.setId(request.getId());
        nuevoPermiso.setIdUsuario(1L);
        nuevoPermiso.setIdRol(4L);
        try {
            //Sirve para poder setear fechas tipo XML calendar como las de nuestra entidad
            XMLGregorianCalendar fechaAsignacion = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(new GregorianCalendar());

            // Asignar las fechas
            nuevoPermiso.setFechaAsignacion(fechaAsignacion);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());

        }



        response.setPermiso(nuevoPermiso);
        return response;
    }
}
