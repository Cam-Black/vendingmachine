package vendormachine.vendors.item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class SnackTest {
	public final Snack SNACK = new Snack("Water", 1f);
	@Test
	public void testSnackCreditNotNull() {
		assertNotNull(new Snack(1f));
	}
	
	@Test
	public void testSnackCreditAndNameNotNull() {
		assertNotNull(new Snack("Water", 1f));
	}
	
	@Test
	public void testCost() {
		assertEquals(SNACK.cost(), 1f);
	}
	
	@Test
	public void testSetValue() {
		SNACK.setValue(2f);
		assertEquals(SNACK.cost(), 2f);
	}
	
	@Test
	public void testGetName() {
		assertEquals(SNACK.getName(), "Water");
	}
}
