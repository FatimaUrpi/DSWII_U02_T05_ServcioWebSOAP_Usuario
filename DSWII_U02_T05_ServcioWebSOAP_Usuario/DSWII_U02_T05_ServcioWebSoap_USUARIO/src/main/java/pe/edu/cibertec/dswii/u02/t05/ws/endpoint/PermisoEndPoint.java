package pe.edu.cibertec.dswii.u02.t05.ws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.dswii.u02.t05.model.permiso.GetPermisoRequest;
import pe.edu.cibertec.dswii.u02.t05.model.permiso.GetPermisoResponse;
import pe.edu.cibertec.dswii.u02.t05.model.permiso.Permiso;


@Endpoint
public class PermisoEndPoint {

    private static final String NAMESPACE_URI = "http://cibertec.edu.pe/dswii/u02/t05/permiso-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPermisoRequest")
    @ResponsePayload
    public GetPermisoResponse getPermiso(@RequestPayload GetPermisoRequest request) {
        GetPermisoResponse response = new GetPermisoResponse();;
        Permiso nuevoPermiso = new Permiso();

        nuevoPermiso.setId(request.getId());
        nuevoPermiso.setIdUsuario(123L);
        nuevoPermiso.setIdRol(456L);

        response.setPermiso(nuevoPermiso);
        return response;
    }
}
