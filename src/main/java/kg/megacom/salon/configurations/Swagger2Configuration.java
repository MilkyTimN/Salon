package kg.megacom.salon.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {


    public static final String SALON = "Салоны";
    public static final String MASTER = "Мастера";
    public static final String WORKDAY = "Гарфик работы";
    public static final String CUSTOMER = "Пользователи";
    public static final String BOOKINGTIME = "Время записи";


    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("kg.megacom.salon.controllers"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiEndPointsInfo())
                .tags(new Tag(SALON,""))
                .tags(new Tag(MASTER, ""))
                .tags(new Tag(WORKDAY, ""))
                .tags(new Tag(CUSTOMER, ""))
                .tags(new Tag(BOOKINGTIME, ""));
    }

    private ApiInfo apiEndPointsInfo(){
        return new ApiInfoBuilder()
                .title("Salon Service")
                .description("Just Service")
                .version("1.0.0")
                .build();
    }
}

