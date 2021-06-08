package com.jc00973.campominado;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTabuleiro {

    @Test
    void testTabuleiro() {

        Tabuleiro tabuleiro = new Tabuleiro();

        Assertions.assertNotNull(tabuleiro.getPosicao(1, 2));

    }

    @Test
    void testTabuleiro2() {

        Tabuleiro tabuleiro = new Tabuleiro();

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> tabuleiro.getPosicao(-1, 20));

    }

}