package com.Modulo_2.Calc_ferias_Polimorfismo;

import com.Modulo_2.Calc_ferias_Polimorfismo.Modelo.Funcionario;
import com.Modulo_2.Calc_ferias_Polimorfismo.Modelo.TipoFuncionario;
import com.Modulo_2.Calc_ferias_Polimorfismo.Service.ServicoDeCalculoDeFeriasFactory;
import com.Modulo_2.Calc_ferias_Polimorfismo.Service.ServicoDeCalculoFerias;

public class App_Calc_Ferias {

    public static void main(String[] args) {

        String nome = args[0];

        TipoFuncionario tipoFuncionario = TipoFuncionario.values()[Integer.valueOf(args[1]) - 1];

        double salario = Double.valueOf(args[2]);

        Funcionario funcionario = new Funcionario(nome, salario, tipoFuncionario);

        ServicoDeCalculoFerias calculoFerias = ServicoDeCalculoDeFeriasFactory.obterLogicaDeCalculo(funcionario.getTipoFuncionario());

        double ferias = calculoFerias.calcularFerias(funcionario);

        System.out.println(ferias);

    }
}
