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
}