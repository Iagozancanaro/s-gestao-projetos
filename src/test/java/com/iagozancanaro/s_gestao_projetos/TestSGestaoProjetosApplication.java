package com.iagozancanaro.s_gestao_projetos;

import org.springframework.boot.SpringApplication;

public class TestSGestaoProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.from(SGestaoProjetosApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
