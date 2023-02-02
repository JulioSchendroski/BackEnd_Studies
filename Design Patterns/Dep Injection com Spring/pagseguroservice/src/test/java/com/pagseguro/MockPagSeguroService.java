package com.pagseguro;

import java.math.BigDecimal;

import com.pagseguro.pagseguroservice.Pagamento.PagSeguroService;

public class MockPagSeguroService extends PagSeguroService{

    public MockPagSeguroService(String token) {
        super(token);
    }

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor){
        System.out.println("[Mock] Não faz nada!");
    }
    
}
