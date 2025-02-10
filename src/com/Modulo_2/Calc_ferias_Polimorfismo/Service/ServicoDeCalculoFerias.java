package com.Modulo_2.Calc_ferias_Polimorfismo.Service;

import com.Modulo_2.Calc_ferias_Polimorfismo.Modelo.Funcionario;

public interface ServicoDeCalculoFerias extends ServiçoDeCalculo{

    double calcularFerias(Funcionario funcionario);

}
