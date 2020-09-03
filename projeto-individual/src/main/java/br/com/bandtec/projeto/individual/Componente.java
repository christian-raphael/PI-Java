package br.com.bandtec.projeto.individual;

import java.util.concurrent.ThreadLocalRandom;

public class Componente {
    Integer numeroAleatorio;
    Integer usoMaximo = 0;
    Integer usoMinimo = 100;
    Double mediaUso = 0.0;
    
    void gerarDados() {
       numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 101);
       compararDados();
    }
    
    void compararDados() {
        if(numeroAleatorio < usoMinimo) {
            usoMinimo = numeroAleatorio;
        }
        
        mediaUso += numeroAleatorio;
        
        if(numeroAleatorio > usoMaximo) {
            usoMaximo = numeroAleatorio;
        }
    }
}
