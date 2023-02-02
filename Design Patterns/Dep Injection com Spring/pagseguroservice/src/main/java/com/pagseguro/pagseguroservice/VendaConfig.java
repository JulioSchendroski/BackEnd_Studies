package com.pagseguro.pagseguroservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.pagseguro.pagseguroservice.Pagamento.GatewayPagamento;
import com.pagseguro.pagseguroservice.Pagamento.PagSeguroService;
import com.pagseguro.pagseguroservice.Pagamento.PaypalService;

public class VendaConfig {
    
    @Primary
    @Bean
    public PagSeguroService pagSeguroService(){
        return new PagSeguroService("3492dhweu8rh27834");
    }

    @Bean
    public PaypalService paypalService(){
        return new PaypalService("3492dhweu8rh27834");
    }

    // @Bean
    // public VendaService vendaService(GatewayPagamento gatewayPagamento){
    //     return new VendaService(gatewayPagamento);
    // }
}
