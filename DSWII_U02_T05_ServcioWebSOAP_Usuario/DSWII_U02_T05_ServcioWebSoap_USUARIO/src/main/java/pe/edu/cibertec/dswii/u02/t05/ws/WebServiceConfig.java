package pe.edu.cibertec.dswii.u02.t05.ws;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {


    private static final String NAMESPACE_URI_PERMISO = "http://t05.u02.dswii.cibertec.edu.pe/permiso-service";
    private static final String NAMESPACE_URI_ROL = "http://t05.u02.dswii.cibertec.edu.pe/rol-service";
    private static final String NAMESPACE_URI_USUARIO = "http://t05.u02.dswii.cibertec.edu.pe/usuario-service";

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }



    @Bean(name = "permisos")
    public DefaultWsdl11Definition defaultWsdl11DefinitionPermisos(@Qualifier("permisosSchema") XsdSchema permisosSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PermisoPort");
            wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_PERMISO);
        wsdl11Definition.setSchema(permisosSchema);
        return wsdl11Definition;
    }

    @Bean(name = "rol")
    public DefaultWsdl11Definition defaultWsdl11DefinitionRol(@Qualifier("rolSchema") XsdSchema rolSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("RolPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_ROL);
        wsdl11Definition.setSchema(rolSchema);
        return wsdl11Definition;
    }

    @Bean(name = "usuario")
    public DefaultWsdl11Definition defaultWsdl11DefinitionUsuario(@Qualifier("usuarioSchema") XsdSchema usuarioSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("UsuarioPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_USUARIO);
        wsdl11Definition.setSchema(usuarioSchema);
        return wsdl11Definition;
    }



    @Bean(name = "permisosSchema")
    public XsdSchema permisosSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/permiso-schema.xsd"));
    }

    @Bean(name = "rolSchema")
    public XsdSchema rolSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/rol-schema.xsd"));
    }

    @Bean(name = "usuarioSchema")
    public XsdSchema usuarioSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/usuario-schema.xsd"));
    }

}
