package se.nackademin;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class FortuneTellerTest {

    @Test
    public void testCalculate() {
        MagicNumbers magicNumbersMock = mock(MagicNumbers.class);
        when(magicNumbersMock.calculateA()).thenReturn(1);
        when(magicNumbersMock.calculateB()).thenReturn(1);
        when(magicNumbersMock.calculateC()).thenReturn(1);
        when(magicNumbersMock.calculateD()).thenReturn(1);
        when(magicNumbersMock.calculateE()).thenReturn(1);

        Translator translatorMock = mock(Translator.class);
        when(translatorMock.getAdjective(anyInt())).thenReturn("liten");
        when(translatorMock.getVerb(anyInt())).thenReturn("springa");
        when(translatorMock.getNoun(anyInt())).thenReturn("en lönehöjning");
        FortuneTeller fortuneTeller = new FortuneTeller(magicNumbersMock, translatorMock);
        assertEquals("Din framtid är liten. Du borde sluta springa. Vi ser att du snart kommer att skaffa en lönehöjning. Snart kommer du vilja springa, men då är det viktigt att du är liten.", fortuneTeller.calculate());
    }

    @Test
    public void testSetAge() {
        MagicNumbers magicNumbersMock = mock(MagicNumbers.class);
        Translator translatorMock = mock(Translator.class);
        FortuneTeller fortuneTeller = new FortuneTeller(magicNumbersMock, translatorMock);
        boolean result = fortuneTeller.setAge("25");
        assertTrue("should return true for valid input", result);
        verify(magicNumbersMock, times(1)).setAge(25);
    }

    @Test
    public void testSetAgeWithInvalidInput() {
        MagicNumbers magicNumbersMock = mock(MagicNumbers.class);
        Translator translatorMock = mock(Translator.class);
        FortuneTeller fortuneTeller = new FortuneTeller(magicNumbersMock, translatorMock);
        boolean result = fortuneTeller.setAge("not an integer");
        assertFalse("should return false for invalid input", result);
    }
}
