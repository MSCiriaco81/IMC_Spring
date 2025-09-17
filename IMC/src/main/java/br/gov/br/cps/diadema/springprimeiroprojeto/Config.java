package br.gov.br.cps.diadema.springprimeiroprojeto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "appNome")
    public String appNome(){
        return "Aplicação da FATEC";
    }

    @Bean(name = "appIdade")
    public String appIdade(){
        return "20";
    }

    @Bean(name = "appAltura")
    public String appAltura(){
        return "1,86";
    }

    @Bean(name = "appSexo")
    public String appSexo(){
        return "Masculino";
    }
}
