package com.Modulo_2.Biblioteca;

import com.Modulo_2.Biblioteca.Modelo.*;
import com.Modulo_2.Biblioteca.Modelo.Recibo.ReciboDeDevolucao;
import com.Modulo_2.Biblioteca.Modelo.Recibo.ReciboEmprestimo;
import com.Modulo_2.Biblioteca.Modelo.Recibo.ReciboEmprestimoFactory;

import java.time.LocalDateTime;

public class ServicoDeEmprestimo {
    static final int TOLERANCIA_ENTREGA_EM_HORAS = 2;

    ReciboEmprestimo iniciarEmprestimo(Livro livro, Locador locador) {
        return ReciboEmprestimoFactory.criarRecibo(livro, locador);
    }

    ReciboDeDevolucao finalizarEmprestimo(ReciboEmprestimo reciboEmprestimo) {
        LocalDateTime dataHoraMaximaDeEntrega = LocalDateTime.now().plusHours(TOLERANCIA_ENTREGA_EM_HORAS);
        if(reciboEmprestimo.dataPrevistaDeDevolucao.isBefore(dataHoraMaximaDeEntrega)){
            return new ReciboDeDevolucao(reciboEmprestimo, LocalDateTime.now());
        }
        else{
            return new ReciboDeDevolucao(reciboEmprestimo, LocalDateTime.now(), "Entrega fora do prazo, passível de multa");
        }
    }

}
