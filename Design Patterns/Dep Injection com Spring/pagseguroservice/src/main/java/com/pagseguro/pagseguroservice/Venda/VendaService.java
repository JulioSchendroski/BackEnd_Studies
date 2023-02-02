package com.pagseguro.pagseguroservice.Venda;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.pagseguro.pagseguroservice.Pagamento.GatewayPagamento;

@Component
public class VendaService {

    private GatewayPagamento gatewayPagamento;

    public VendaService(GatewayPagamento gatewayPagamento){
        this.gatewayPagamento = gatewayPagamento;
    }

    public void registrar(Venda venda, String numeroCartao){
        BigDecimal valorTotal = venda.getValor().multiply(new BigDecimal(venda.getQuantidade()));

        System.out.println("[Venda] Registrando venda de " + venda.getProduto() + " no valor dotal de " + valorTotal);

        // PagSeguroService pagSeguroService = new PagSeguroService("67423684bhbd37246");
        gatewayPagamento.efetuarPagamento(numeroCartao, valorTotal);
    }
}
