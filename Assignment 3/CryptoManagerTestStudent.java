package application;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("APPLE"));
		assertTrue(CryptoManager.isStringInBounds("\"BANANA\""));
		assertFalse(CryptoManager.isStringInBounds("ball"));
		assertFalse(CryptoManager.isStringInBounds("{HELLO"));
		
	}

	@Test
	void testCaesarEncryption() {
		
		assertEquals("PRQWJRPHU\\#FROOHJH", CryptoManager.caesarEncryption("MONTGOMERY COLLEGE", 3));
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("COMPUTER}SCIENCE", 2));
		
	}

	@Test
	void testBellasoEncryption() {
		assertEquals("U^,ZPUJ,U\"(OM\"P", CryptoManager.bellasoEncryption("MY NAME IS JAVA", "HELLO"));
		assertEquals("S<Z0K5P#*\"NZY'", CryptoManager.bellasoEncryption("I'M A CS MAJOR", "JUMP"));
	}

	@Test
	void testCaesarDecryption() {
		assertEquals("JAVA", CryptoManager.caesarDecryption("LCXC", 2));
		assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("LIPPS$[SVPH", 4));
		
	}

	@Test
	void testBellasoDecryption() {
		assertEquals("SOCCER IS MY FAVORITE SPORT", CryptoManager.bellasoDecryption("U[DFPT,JV+O%!ILX[SL_G,TSZT ", "BLACK"));
		assertEquals("HELLO THERE", CryptoManager.bellasoDecryption("ZF ^P4&IY$F", "RAT"));
	}

}
