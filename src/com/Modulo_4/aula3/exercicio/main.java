package com.Modulo_4.aula3.exercicio;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia semana: ");
        String diaTrabalhado = sc.nextLine();
        System.out.println("Digite o hora de entrada: ");
        String horaEntrada = sc.nextLine();
        System.out.println("Digite o hora de saida: ");
        String horaSaida = sc.nextLine();
        System.out.println("Digite o valor hora: ");
        double valorHora = sc.nextDouble();

        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaEntrada1 = LocalTime.parse(horaEntrada,formatadorHora);
        LocalTime horaSaida1 = LocalTime.parse(horaSaida,formatadorHora);

        //CalculaSalario calcsalario = new CalculaSalario();
        double valorDia = CalculaSalario.calculaSalarioDia(horaEntrada1, horaSaida1, valorHora);

        System.out.println("Valor Dia: " + valorDia);

    }
}
