package com.Modulo_2.Calc_ferias_Polimorfismo.Service;

import com.Modulo_2.Calc_ferias_Polimorfismo.Modelo.Funcionario;

public class CalcularFeriasEstagio implements ServicoDeCalculoFerias {


    @Override
    public double calcularFerias(Funcionario funcionario) {
        return funcionario.getSalario() * 1.3;
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }
}
