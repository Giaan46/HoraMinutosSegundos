package Tp2;

import static org.junit.jupiter.api.Assertions.*;

class SegundosTest {

    
      

    

   

    @org.junit.jupiter.api.Test
    void testConvertToSeconds() {
        asserEquals(136791, Segundos.convertToSeconds(1, 13, 59, 51));
    }


    @org.junit.jupiter.api.Test
    void testConvertToDHMS() {
    }
}