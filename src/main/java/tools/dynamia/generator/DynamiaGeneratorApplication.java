package tools.dynamia.generator;


import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "DynamiaTools API",
                description = "DynamiaTools Metadata API",
                license = @License(name = "Apache 2 License", url = "https://github.com/dynamiatools/framework?tab=Apache-2.0-1-ov-file#readme"),
                contact = @Contact(name = "Mario Serrano", email = "mario@dynamiasoluciones.com"),
                version = "5.3.6"
        ),
        externalDocs = @ExternalDocumentation(description = "DynamiaTools Documentation", url = "https://www.dynamia.tools")
)
public class DynamiaGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamiaGeneratorApplication.class, args);
    }


}
