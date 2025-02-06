package com.Modulo_2.Biblioteca;


import com.Modulo_2.Biblioteca.Modelo.Livro;
import com.Modulo_2.Biblioteca.Modelo.Recibo.ReciboEmprestimo;
import com.Modulo_2.Biblioteca.Modelo.Recibo.ReciboEmprestimoFactory;


class AppLibrary {

    static void main(String[] args) {
        //ReciboEmprestimo recibo = ReciboEmprestimoFactory.criarRecibo(null, null);

        Livro livro1 = new Livro("", "", "", 1990, "", RegraDeEmprestimo.CURTA_DURACAO);

        livro1.setRegraDeEmprestimo(RegraDeEmprestimo.LONGA_DURACAO);

        ReciboEmprestimo recibo = ReciboEmprestimoFactory.criarRecibo(null, null);

    }

}


