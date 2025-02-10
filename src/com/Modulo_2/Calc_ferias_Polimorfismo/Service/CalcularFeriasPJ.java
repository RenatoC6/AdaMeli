package com.Modulo_2.Calc_ferias_Polimorfismo.Service;

import com.Modulo_2.Calc_ferias_Polimorfismo.Modelo.Funcionario;

public class CalcularFeriasPJ implements ServicoDeCalculoFerias{

    public double calcularFerias(Funcionario funcionario){
        return funcionario.getSalario() / 2;

    }

    @Override
    public double calcularTaxa() {
        return 0;
    }
}
