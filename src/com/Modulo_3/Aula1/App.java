package com.Modulo_3.Aula1;

public class App {

    public static void main(String[] args) {

        Animal gato = new Gato();
        gato.setCor("preto");
        gato.setNome("pretinha");
        gato.setRaca("siames");
        gato.setDisponivelParaAdocao(true);
        gato.setTipoAnimal(TipoAnimal.GATO);
        gato.emitirSom();

        Animal cachorro = new Cachorro();
        cachorro.setCor("rajado");
        cachorro.setNome("Mila");
        cachorro.setRaca("vira lata");
        cachorro.setDisponivelParaAdocao(true);
        cachorro.setTipoAnimal(TipoAnimal.CACHORRO);
        cachorro.emitirSom();

        Pessoa cuidador = new Pessoa();
        cuidador.setNome("João");
        cuidador.setTelefone("99679-9532");
        cuidador.adotar(gato);
        cuidador.adotar(cachorro);

        Animal adotado = cuidador.getAnimalAdotado();
        TipoAnimal tipoAnimal = cuidador.getAnimal().getTipoAnimal();

      // duvidas:
      // como faço pra saber que o animal é do tipo cachorro ?
      // não preciso do metodo getAnimalAdotado (posso usar  "cuidador.getAnimal().getNome())";)

        System.out.println("O cuidador " + cuidador.getNome() + " adotou o " + tipoAnimal.toString() + " " + adotado.getRaca() + " " +  adotado.getNome());
        System.out.println("O cuidador " + cuidador.getNome() + " adotou o " + cuidador.getAnimal().getTipoAnimal() + " " + cuidador.getAnimal().getRaca() + " " + cuidador.getAnimal().getNome());



    }
}
