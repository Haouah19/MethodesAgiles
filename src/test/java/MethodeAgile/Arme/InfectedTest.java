package MethodeAgile.Arme;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import MethodeAgile.Arme.src.Gun;

class InfectedTest {
    private Gun gun1;
    private Gun gun2;

	@BeforeEach
	public void setUp()
	{
		this.gun1 = new Gun();
		this.gun2 = new Gun();
	}

	@Test 
	
	void testEquals() {
		  assertTrue(!gun1.equals(null));
		  assertEquals(gun1, gun2);
		  assertEquals(gun1, new Gun());
		  assertTrue(gun1.equals(gun2));
	}
	@Test
	void test2() {
		assertTrue(gun1.equals(gun2));
	}

}
