package com.pagseguro.pagseguroservice.Venda;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Venda {

    private BigDecimal valor;
    private String produto;
    private int quantidade;
}
