package pe.edu.cibertec.dswii.u02.t05.ws.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.dswii.u02.t05.usuario.GetUsuarioRequest;
import pe.edu.cibertec.dswii.u02.t05.usuario.GetUsuarioResponse;
import pe.edu.cibertec.dswii.u02.t05.usuario.Usuario;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;


@Endpoint
public class UsuarioEndPoint {

    private static final String NAMESPACE_URI_USUARIO = "http://t05.u02.dswii.cibertec.edu.pe/usuario-service";

    @PayloadRoot(namespace = NAMESPACE_URI_USUARIO, localPart = "GetUsuarioRequest")
    @ResponsePayload
    public GetUsuarioResponse getUsuario(@RequestPayload GetUsuarioRequest request) {
        GetUsuarioResponse response = new GetUsuarioResponse();
        Usuario nuevoUsuario = new Usuario();

        // Datos estáticos de prueba
        nuevoUsuario.setIdUsuario(request.getId());
        nuevoUsuario.setNombreUsuario("usuario_prueba");
        nuevoUsuario.setContrasena("password123");
        nuevoUsuario.setActivo(true);
        nuevoUsuario.setEmail("usuario.prueba@correo.com");

        try {
            // Crear instancias de XMLGregorianCalendar
            XMLGregorianCalendar fechaCreacion = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(new GregorianCalendar());
            XMLGregorianCalendar fechaActualizacion = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(new GregorianCalendar());

            // Asignar las fechas
            nuevoUsuario.setFechaCreacion(fechaCreacion);
            nuevoUsuario.setFechaActualizacion(fechaActualizacion);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Asignar el usuario al response
        response.setUsuario(nuevoUsuario);
        return response;
    }
}

