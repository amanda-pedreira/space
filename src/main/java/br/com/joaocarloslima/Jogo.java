package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {

    public Nave nave;
    public ArrayList<Asset> assets = new ArrayList<>();
    private int pontos;
    private int nivel = 1;
    
    public Jogo() {
        nave = new Nave(295, 400, 10, Direcao.CIMA);
    }

    public Tiro atirar() {
        Tiro tiro = nave.atirar(nivel);
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro() {
        Random random = new Random();
        int posicao = random.nextInt(590);

        Meteoro meteoro = new Meteoro(posicao, 0, 2, Direcao.BAIXO);
        assets.add(meteoro);

        return meteoro;
    }


    public int pontuar() {
        pontos++;

       if ((pontos == 10 || pontos == 20 || pontos == 30) && (nivel < 4)) {
            nivel = nivel + 1;
        }

        return pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }

}
