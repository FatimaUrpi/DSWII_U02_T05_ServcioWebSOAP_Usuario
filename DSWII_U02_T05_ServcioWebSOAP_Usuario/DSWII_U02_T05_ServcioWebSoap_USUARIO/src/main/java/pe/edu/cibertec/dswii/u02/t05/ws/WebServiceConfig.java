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

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }


    @Bean(name = "permisos")
    public DefaultWsdl11Definition defaultWsdl11DefinitionPersona(@Qualifier("permisosSchema") XsdSchema permisosSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PermisoPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_PERMISO);
        wsdl11Definition.setSchema(permisosSchema);
        return wsdl11Definition;
    }


    @Bean
    public XsdSchema permisosSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/permiso-schema.xsd"));
    }


}
