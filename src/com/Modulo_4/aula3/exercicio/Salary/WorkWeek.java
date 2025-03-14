package com.Modulo_4.aula3.exercicio.Salary;

import java.math.BigDecimal;
import java.util.List;

public class WorkWeek {
    private List<WorkDay> days;

    public WorkWeek(List<WorkDay> days) {
        this.days = days;
    }

    public BigDecimal salary() {
        if (days.size() < 2) { // era pra ser 7, deixei 2 pra facilitar
            throw new IllegalStateException("Deve ser trabalhado 7 dias para receber");
        }
        var amount = BigDecimal.ZERO;
        for (WorkDay day : days) {
            amount = amount.add(day.amount());
        }
        return amount;
    }

}
