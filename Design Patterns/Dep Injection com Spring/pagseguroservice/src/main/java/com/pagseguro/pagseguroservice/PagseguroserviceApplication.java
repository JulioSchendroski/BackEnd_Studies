package com.pagseguro.pagseguroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pagseguro.pagseguroservice.Venda.VendaService;

@SpringBootApplication
public class PagseguroserviceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PagseguroserviceApplication.class, args);
		VendaService vendaService = applicationContext.getBean(VendaService.class);
	}

}
