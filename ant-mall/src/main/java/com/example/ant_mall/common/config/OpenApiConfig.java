package com.example.ant_mall.common.config;

// import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    /**
     * 配置 API 文档的元信息，如标题、描述、版本等。
     * 这对应了旧配置中的 apiInfo() 部分。
     */
    @Bean
    public Info apiInfo() {
        return new Info()
                .title("我的标题")
                .description("我的描述")
                .version("1.0")
                .contact(new Contact()
                        .name("daoren")
                        .url("https://xxx.com")
                        .email("xx@qq.com"))
                // 如果需要配置服务条款，可以在这里添加
                // .termsOfService("http://www.xx.com/")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"));
    }
    
    /**
     * 配置 API 分组。
     * 这对应了旧配置中的 groupName() 和 select() 部分。
     */
    @Bean
    public GroupedOpenApi allApiGroup() {
        return GroupedOpenApi.builder()
                .group("all") // 分组名称
                .packagesToScan("com.knife.ant") // 指定Controller扫描路径
                .pathsToMatch("/**") // 匹配所有路径
                .build();
    }
}