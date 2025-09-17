package br.gov.br.cps.diadema.springprimeiroprojeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @RestController
public class SpringPrimeiroProjetoApplication {
	// Autowired / Qualifier -> Exemplos de uso
	/*
	@Autowired
	@Qualifier("appNome")
	private String appNome;

	@Autowired
	@Qualifier("appAltura")
	private String appAltura;

	@Autowired
	@Qualifier("appSexo")
	private String appSexo;

	@Autowired
	@Qualifier("appIdade")
	private String appIdade;

	 */
	public static void main(String[] args) {

		SpringApplication.run(SpringPrimeiroProjetoApplication.class, args);
	}

	// Criação de End-Points -> Exemplos de uso
	/*
	@GetMapping("/")
	public String index(){
		return appNome;
	}

	@GetMapping("/altura")
	public String altura(){
		return appAltura;
	}

	@GetMapping("/idade")
	public String idade(){
		return appIdade;
	}

	@GetMapping("/sexo")
	public String sexo(){
		return appSexo;
	}

	@GetMapping("/hello")
	public String helloWorld(){
		return "Hello World - FATEC - 17/09/2025";
	}
	 */


}
