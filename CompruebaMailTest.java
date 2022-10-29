package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompruebaMailTest {
    @Test
    public void debeDecirSpam(){
        //Given
        CompruebaMail proceso= new CompruebaMail();
        String respuestaEsperada="Marcado como spam";
        Mail correoElectronico= new Mail("hola@gmail.com","spam@colmena.com","actualizacion");
        //When
        String resultado= proceso.comprobar(correoElectronico);
        //Then
        Assertions.assertEquals(respuestaEsperada,resultado);

    }


}
