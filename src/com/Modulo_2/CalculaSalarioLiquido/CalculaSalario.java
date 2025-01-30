package com.Modulo_2.CalculaSalarioLiquido;


public class CalculaSalario {

    public static void main(String[] args) {

        boolean valeTransporte = false;

        String nome = ArgsUtil.getString("-n", args);
        String cargo = ArgsUtil.getString("-c", args);
        double salarioBase = ArgsUtil.getDouble("-s", args);
        int validaVT = ArgsUtil.getBoolean("-vt", args); // valores: 0 - true; 1 - false; 2 - invalido
        if(validaVT == 0){
            valeTransporte = true;}
        String dataNascimento = ArgsUtil.getString("-dt", args);
        //System.out.println("data nascimento: " + dataNascimento);
        boolean validaData = ArgsUtil.validarData(dataNascimento);
        if(!validaData){
            System.out.println("Data de nascimento invalida (dd/mm/yyyy): " + dataNascimento);
            return;
        }

        if (nome == null || cargo == null ||salarioBase <= 0 || validaVT == 2) {
            System.out.println("Erro: Todos os parâmetros devem ser fornecidos corretamente.");
            System.out.println("Use: -n <nome> | -c <cargo> | -s <salariobase> | -vt <vale transp (true ou false) | -dt <data de nasc (dd/mm/yyyy)>");
            return;
        }

        Funcionario f1 = new Funcionario();
        f1.dadosPessoais = new DadosPessoais(nome, dataNascimento );
        f1.dadosContratuais = new DadosContratuais(cargo, salarioBase, valeTransporte);


        CalculadoraSalario calc = new CalculadoraSalario();
        double valorDesconto = calc.calcularSalario(f1);
        double salarioLiquido = calc.calcularSalarioLiquido(salarioBase, valorDesconto);

        //double valorDesconto = f1.calcularSalario(salarioBase, valeTransporte);
        //System.out.println("valor desconto: " + valorDesconto);
        //double salarioLiquido = f1.calcularSalarioLiquido(salarioBase, valorDesconto);

        imprimir(f1.dadosPessoais, f1.dadosContratuais, salarioLiquido);
    }

    static void imprimir(DadosPessoais dp, DadosContratuais dc, double salarioLiquido){

        String recebeVT = "Não";

        System.out.println("---------------------------------------------------");
        System.out.println("Funcionario.......: " + dp.nome);
        System.out.println("Data Nascimento...: " + dp.dataNascimento);
        System.out.println("Cargo.............: " + dc.cargo);
        System.out.println("Salario Base......: " + String.format("R$ %.2f", dc.salarioBase));
        if(dc.valeTransporte) recebeVT = "Sim";
        System.out.println("Recebe VT.........: " + recebeVT);
        System.out.println("---------------------------------------------------");
        System.out.println("Salario Liquido...: " + String.format("R$ %.2f", salarioLiquido));
        System.out.println("---------------------------------------------------");
    }
}
