package se.nackademin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FortuneTellerIT {

    @Test
    public void testGetFortune() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("16");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        String output = fortuneTeller.calculate();
        assertEquals("Fortune should be calculated correctly", "Din framtid är mjuk. Du borde sluta se. Vi ser att du snart kommer att skaffa en fotboja. Snart kommer du vilja mäta, men då är det viktigt att du är mörk.", output);
    }
        @Test
    public void testGetFortuneDOver5() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("5");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        String output = fortuneTeller.calculate();
        assertEquals("Fortune should be calculated correctly", "Din framtid är vacker. Du borde sluta se. Vi ser att du snart kommer att skaffa ett hus. Snart kommer du vilja springa, men då är det viktigt att du är hård.", output);
    }
        @Test
    public void testSetAgeNull() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge(null);
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        boolean output = fortuneTeller.setAge(null);
        assertFalse("should return false for null value", output);
    }
        @Test
    public void testSetLocationNull() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("5");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation(null);
        fortuneTeller.setName("Sture Hagfors");
        boolean output = fortuneTeller.setLocation(null);
        assertFalse("should return false for null value", output);
    }
        @Test
    public void testSetLocationEmpty() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("5");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("");
        fortuneTeller.setName("Sture Hagfors");
        boolean output = fortuneTeller.setLocation("");
        assertFalse("should return false for empty value", output);
    }    
        @Test
    public void testSetHeightNull() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("5");
        fortuneTeller.setHeight(null);
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        boolean output = fortuneTeller.setHeight(null);
        assertFalse("should return false for null value", output);
    }
        @Test
    public void testSetIncomeNull() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("5");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome(null);
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        boolean output = fortuneTeller.setIncome(null);
        assertFalse("should return false for null value", output);
    }
        @Test
    public void testSetIncomeMax() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("5");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("10000001");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        boolean output = fortuneTeller.setIncome("10000001");
        assertFalse("should return false for max+1 value", output);
    }     
        @Test
    public void testSetNameNull() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("5");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName(null);
        boolean output = fortuneTeller.setName(null);
        assertFalse("should return false for null value", output);
    }
            @Test
    public void testSetNameEmpty() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("5");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("");
        boolean output = fortuneTeller.setName("");
        assertFalse("should return false for empty value", output);
    } 
}
