package com.design;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {

//        //添加head参数start
//        ParameterBuilder tokenPar = new ParameterBuilder();
//        List<Parameter> pars = new ArrayList<>();
//        tokenPar.name("Authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//        pars.add(tokenPar.build());
//        //添加head参数end
//
//        Predicate<RequestHandler> predicate = input -> {
//            Class<?> declaringClass = null;
//            if (input != null) {
//                declaringClass = input.declaringClass();
//            }
//            // 排除
//            if (declaringClass == BasicErrorController.class) {
//                return false;
//            }
//            // 被注解的类
//            assert declaringClass != null;
//            return declaringClass.isAnnotationPresent(Api.class);
//        };

        return new Docket(DocumentationType.SWAGGER_2)
//                .globalOperationParameters(pars)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.design"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .version("1.0")
                .build();
    }


}
