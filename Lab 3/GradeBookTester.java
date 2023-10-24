package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook gb1 = new GradeBook(5);
	GradeBook gb2 = new GradeBook(5);
	@BeforeEach
	void setUp() throws Exception {
	
	gb1.addScore(60.0);
	gb1.addScore(50.0);
	
	gb2.addScore(40.0);
	gb2.addScore(30.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		 gb1 = null;
		 gb2 = null;
	}

	@Test
	void testAddScore() {
		assertEquals(" 60.0 50.0 ",gb1.toString());
		assertEquals(" 40.0 30.0 ",gb2.toString());
		
		assertEquals(2, gb1.getScoreSize());
		assertEquals(2, gb2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(110.0, gb1.sum());
		assertEquals(70.0, gb2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(50.0, gb1.minimum());
		assertEquals(30, gb2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(60.0, gb1.finalScore());
		assertEquals(40.0, gb2.finalScore());
	}
	


}
