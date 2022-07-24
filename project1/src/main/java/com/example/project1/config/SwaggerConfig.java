package com.example.project1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    /**
     * 配置swagger 的docket的bean实例
     * @return
     */
    @Bean
    public Docket docket(){

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()//选择扫描的方式
                //RequustHandlerSeletors
                //basePackage
                //any
                //none
                //withClassAnnotation
                //withMethodAnnotation
                .apis(RequestHandlerSelectors.basePackage("com.example.project1"))
                .build();
    }

    /***
     * 配置swagger 的信息 apiInfo
     * @return
     */
    private ApiInfo apiInfo() {
        //作者信息
        Contact contact = new Contact("fb", "localhost", "16607248794@163.com");
        return new ApiInfo(
          "fb的swaggerApi文档",
          "文档的描述",
          "版本号",
          "termsOfSeviceurl",
          contact,
          "license",
          "licenseUrl",
          new ArrayList()
        );
    }


}
