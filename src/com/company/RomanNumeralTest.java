package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomanNumeralTest {

    @Test
    public void TestConvert1ShouldReturnI() {
        assertEquals( "I", RomanNumeral.convertArabicToRomanNumeral(1));
    }

    @Test
    public void TestConvert2ShouldReturnII() {
        assertEquals("II", RomanNumeral.convertArabicToRomanNumeral(2));
    }

    @Test
    public void TestConvert5ShouldReturnV() {
        assertEquals("V", RomanNumeral.convertArabicToRomanNumeral(5));
    }

    @Test
    public void TestConvert10ShouldReturnX() {
        assertEquals("X", RomanNumeral.convertArabicToRomanNumeral(10));
    }

    @Test
    public void TestConvert4ShouldReturnIV() {
        assertEquals("IV", RomanNumeral.convertArabicToRomanNumeral(4));
    }

    @Test
    public void TestConvertsNumbersCorrectly() {
        assertEquals("XCIX", RomanNumeral.convertArabicToRomanNumeral(99));
        assertEquals("XCIV", RomanNumeral.convertArabicToRomanNumeral(94));
        assertEquals("XLIV", RomanNumeral.convertArabicToRomanNumeral(44));
        assertEquals("XLIX", RomanNumeral.convertArabicToRomanNumeral(49));
        assertEquals("XLVIII", RomanNumeral.convertArabicToRomanNumeral(48));
        assertEquals("LXXXVIII", RomanNumeral.convertArabicToRomanNumeral(88));
    }
}
