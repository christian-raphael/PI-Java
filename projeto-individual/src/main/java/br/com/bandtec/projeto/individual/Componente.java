package br.com.bandtec.projeto.individual;

import java.util.concurrent.ThreadLocalRandom;

public class Componente {
    Integer numeroAleatorio;
    Integer usoMaximo = 0;
    Integer usoMinimo;
    Integer capacidadeMaxima = 0;
    Double totalUso = 0.0;
    
    void gerarDados() {
       numeroAleatorio = ThreadLocalRandom.current().nextInt(0, capacidadeMaxima + 1);
       compararDados();
    }
    
    void compararDados() {        
        if(numeroAleatorio > usoMaximo) {
            usoMaximo = numeroAleatorio;
        }
        
        if(usoMinimo == null) {
            usoMinimo = usoMaximo;
        }
        
        if(numeroAleatorio < usoMinimo) {
            usoMinimo = numeroAleatorio;
        }
        
        totalUso += numeroAleatorio;
    }
}
