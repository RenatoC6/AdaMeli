package com.Modulo_4.aula3.exercicio.Salary;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class WorkDay {

    private WorkShift morning;
    private WorkShift afternoon;
    private BigDecimal hourlyRate;
    private LocalDate day;

    public WorkDay(WorkShift morning, WorkShift afternoon, BigDecimal hourlyRate, LocalDate day) {
        this.morning = morning;
        this.afternoon = afternoon;
        this.hourlyRate = hourlyRate;
        this.day = day;
    }

    public BigDecimal amount(){
        var amountMinutes = morning.totalHoras().toMinutes() + afternoon.totalHoras().toMinutes();
        var minuteRate = hourlyRate.divide(BigDecimal.valueOf(60), RoundingMode.HALF_UP);
        System.out.println("No dia " + day + " foram trabalhados " + amountMinutes + " minutos.");
        return minuteRate.multiply(BigDecimal.valueOf(amountMinutes));

    }




}
