package com.pagseguro.pagseguroservice.Pagamento;

import java.math.BigDecimal;

public interface GatewayPagamento {
    void efetuarPagamento(String numeroCartao, BigDecimal valor);
}
