package com.pagseguro.pagseguroservice;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import com.pagseguro.pagseguroservice.Pagamento.PagSeguroService;
import com.pagseguro.pagseguroservice.Venda.Venda;
import com.pagseguro.pagseguroservice.Venda.VendaService;

public class VendaServiceTest {
    @Test
    public void registrarVenda(){
        Venda venda = new Venda();
        venda.setProduto("Boia");
        venda.setQuantidade(1);
        venda.setValor(new BigDecimal(109.5));

        VendaService vendaService = new VendaService(new PagSeguroService("67423684bhbd37246"));
        vendaService.registrar(venda, "231134531456");
    }
}
