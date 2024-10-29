import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    // DDT
    // Teste com massa

    @ParameterizedTest
    @CsvSource(value = {
        "15, 25, 40.0",
        "0, 12, 12.0",
        "-5, 9, 4.0",
        "0.5, 3.7, 4.2"
    }, delimiter = ',')
    public void testeSomarTDD(float num1, float num2, float resultadoEsperado){
        // Os dados de entrada sao lidos da massa de teste acima
        float resulatadoAtual = Main.somar(num1, num2);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }

    public void testeSomarCSV(float num1, float num2, float resultadoEsperado){
        // Os dados de entrada sao lidos da massa de teste acima
        float resulatadoAtual = Main.somar(num1, num2);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }
}