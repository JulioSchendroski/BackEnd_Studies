package com.pagseguro.pagseguroservice.Pagamento;

import java.math.BigDecimal;


public class PagSeguroService implements GatewayPagamento {
    private String token;

    public PagSeguroService(String token){
        this.token = token;
    }

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor){
        System.out.print("[PagSeguro] Usando token: " + token);
        System.out.print("[PagSeguro] Cobrando: " + valor + " do cartão" + numeroCartao);
    }
}
