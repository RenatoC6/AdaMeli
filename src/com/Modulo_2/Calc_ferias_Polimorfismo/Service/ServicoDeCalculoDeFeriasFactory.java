package com.Modulo_2.Calc_ferias_Polimorfismo.Service;

import com.Modulo_2.Calc_ferias_Polimorfismo.Modelo.TipoFuncionario;

public class ServicoDeCalculoDeFeriasFactory {

    public static ServicoDeCalculoFerias obterLogicaDeCalculo(TipoFuncionario tipoFuncionario) {
        return switch (tipoFuncionario) {
            case CLT -> new CalcularFeriasCLT();
            case PJ -> new CalcularFeriasPJ();
            case ESTAGIO ->  new CalcularFeriasEstagio();
            case ESTRANGEIRO -> new CalcularFeriasEstrangeiro();
            default -> throw new IllegalArgumentException();        };
    }
}
