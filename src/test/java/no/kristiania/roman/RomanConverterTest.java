package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {


        @Test
        void shouldReturnIXFor9(){

            assertEquals("IX", RomanConverter.toRoman(9));
        }

        @Test
        void shoudlCalculateNumbersOver10(){
            assertEquals("X", RomanConverter.toRoman(10));
            assertEquals("XVIII", RomanConverter.toRoman(18));
        }

        @Test
        void shouldCalculateMultiplesOf10(){
            assertEquals("XXXVII", RomanConverter.toRoman(37));
        }

        @Test
        void shouldCalculateSimpleDigits(){
            assertEquals("MMMDCCCLXXXVIII", RomanConverter.toRoman(3888));
        }

        @Test
        void shouldCalculateFourLikeDigits(){
            assertEquals("CDXLIV", RomanConverter.toRoman(444));
        }

        @Test
        void shouldCalculateNineLikeDigits(){
            assertEquals("CMXCIX", RomanConverter.toRoman(999));
        }

}
