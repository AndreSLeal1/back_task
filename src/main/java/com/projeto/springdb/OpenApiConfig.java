/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projeto.springdb;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;
/**
 *
 * @author SheyErakh
 */





@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Nome da sua API",
        version = "1.0",
        description = "Descrição da sua API"
    )
)
public class OpenApiConfig {
    // Configurações adicionais (opcional)
}