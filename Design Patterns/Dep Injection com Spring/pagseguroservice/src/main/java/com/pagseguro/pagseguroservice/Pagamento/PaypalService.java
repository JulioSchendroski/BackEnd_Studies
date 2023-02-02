package com.pagseguro.pagseguroservice.Pagamento;

import java.math.BigDecimal;

public class PaypalService implements GatewayPagamento{
    private String token;

    public PaypalService(String token){
        this.token = token;
    }

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor){
        System.out.print("[Paypal] Usando token: " + token);
        System.out.print("[Paypal] Cobrando: " + valor + " do cartão" + numeroCartao);
    }
}
