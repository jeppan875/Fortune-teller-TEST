/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jesper
 */
public class TranslatorTest {
    


    /**
     * Test of getNoun method, of class Translator.
     */
    @Test
    public void testGetNoun() {
        Translator instance = new Translator();
        String expResult = "en lönehöjning";
        String result = instance.getNoun(0);
        assertEquals("result should be en lönehöjning",expResult, result);
    }
    @Test
    public void testGetVerb() {
        Translator instance = new Translator();
        String expResult = "springa";
        String result = instance.getVerb(0);
        assertEquals("result should be springa",expResult, result);
    }
        @Test
    public void testGetAdjective() {
        Translator instance = new Translator();
        String expResult = "stor";
        String result = instance.getAdjective(0);
        assertEquals("result should be stor",expResult, result);
    }
    
}
