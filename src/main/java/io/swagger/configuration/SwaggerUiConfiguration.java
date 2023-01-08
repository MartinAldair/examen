package io.swagger.configuration;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import io.swagger.v3.oas.models.servers.Server;
import java.util.Arrays;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OpenAPI Swagger-UI configuración del bean.
 *
 * @see https://swagger.io/specification/
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-06T19:40:43.392Z[GMT]")
@Configuration
public class SwaggerUiConfiguration {

    /**
     *
     * OpenAPI Swagger-UI configuración.
     *
     * @return -
     */
    @Bean
    public OpenAPI customOpenAPI() {
        Server localServer = new Server();
        localServer.setDescription("local");
        localServer.setUrl("http://localhost:8080");
        OpenAPI openAPI = new OpenAPI();
        openAPI.info(info());
        openAPI.setExternalDocs(externalDocumentation());
        openAPI.setServers(Arrays.asList(localServer));
        return openAPI;
    }

    /**
     *
     * OpenAPI info() configuración.
     *
     * @return -
     */
    private Info info() {
        return new Info()
                .title("Examen - OpenAPI 3.0")
                .description("Este es una Api basado en la especificación OpenAPI 3.0. "
                        + "Se Puede obtener más información sobre la API en [https://examen.mx](https://examen.mx).")
                .termsOfService("http://examen.mx/terms/")
                .version("1.0.01")
                .contact(new Contact()
                        .email("examen@mail.mx"))
                .license(new License()
                        .name("Apache 2.0")
                        .url("http://www.apache.org/licenses/LICENSE-2.0.html"));
    }

    private ExternalDocumentation externalDocumentation() {
        return new ExternalDocumentation()
                .description("Más información sobre el examen")
                .url("http://examen.mx");
    }

    /**
     *
     * OpenAPI apiGroup() configuración.
     *
     * @return -
     */
    @Bean
    public GroupedOpenApi apiGroup() {
        String[] paths = {"/persona/**"};
        String packagesToScan[] = {"mx.examen.controller"};
        return GroupedOpenApi.builder()
                .group("persona")
                .packagesToScan(packagesToScan)
                .pathsToMatch(paths)
                .build();
    }

}
