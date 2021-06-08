package com.jc00973.campominado;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class TestCampoMinado {

    private ByteArrayInputStream testIn;


    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void testOutOfBound1() {

        provideInput(("1" + System.lineSeparator() + "10"));

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> campoMinado.main(null));

    }

    @Test
    void testOutOfBound2() {

        provideInput(("11" + System.lineSeparator() + "1"));

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> campoMinado.main(null));

    }

    @Test
    void testSelecionarPosicoesAleatorias1() {

        provideInput(("1" + System.lineSeparator() + "1"  + System.lineSeparator() +
                "1" + System.lineSeparator() + "2"  + System.lineSeparator() +
                "1" + System.lineSeparator() + "3"  + System.lineSeparator() +
                "1" + System.lineSeparator() + "4"  + System.lineSeparator() +
                "1" + System.lineSeparator() + "5"  + System.lineSeparator() +
                "1" + System.lineSeparator() + "6"  + System.lineSeparator() +
                "1" + System.lineSeparator() + "7"  + System.lineSeparator() +
                "1" + System.lineSeparator() + "8"));

        campoMinado.main(null);

    }

    @Test
    void testSelecionarPosicoesAleatorias2() {

        provideInput(("1" + System.lineSeparator() + "1"  + System.lineSeparator() +
                "2" + System.lineSeparator() + "2"  + System.lineSeparator() +
                "3" + System.lineSeparator() + "3"  + System.lineSeparator() +
                "4" + System.lineSeparator() + "4"  + System.lineSeparator() +
                "5" + System.lineSeparator() + "5"  + System.lineSeparator() +
                "6" + System.lineSeparator() + "6"  + System.lineSeparator() +
                "7" + System.lineSeparator() + "7"  + System.lineSeparator() +
                "8" + System.lineSeparator() + "8"));

        campoMinado.main(null);

    }


}