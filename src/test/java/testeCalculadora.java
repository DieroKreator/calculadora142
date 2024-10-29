import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.iterasys.Main;

public class testeCalculadora {
    
    @Test 
    public void testeSomar(){
        // AAA - Arrange / Act / Assert

        float num1 = 10;
        float num2 = 8;

        float resultadoEsperado = 18;

        float resulatadoAtual = Main.somar(num1, num2);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }

    @Test
    public void testeSubtrair(){
        float num1 = 25;
        float num2 = 14;

        float resultadoEsperado = 11;

        float resulatadoAtual = Main.subtrair(num1, num2);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }

    @Test
    public void testeMultiplicar(){
        float num1 = 8;
        float num2 = 7;

        float resultadoEsperado = 56;

        float resulatadoAtual = Main.multiplicar(num1, num2);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }

    @Test
    public void testeDividir(){
        int num1 = 27;
        int num2 = 3;
        String resultadoEsperado = "9";

        String resulatadoAtual = Main.dividirTry(num1, num2);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }

    @Test
    public void testeDividirPorZero(){
        int num1 = 7;
        int num2 = 0;
        String resultadoEsperado = "Não é possível dividir por zero";

        String resulatadoAtual = Main.dividirTry(num1, num2);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }
}