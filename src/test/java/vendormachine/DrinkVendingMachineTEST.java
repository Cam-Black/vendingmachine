package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import vendormachine.users.Person;
import vendormachine.users.util.Wallet;
import vendormachine.vendors.DrinkVendingMachine;
import vendormachine.vendors.enums.BRANDS;

//import vendormachine.vendors.DrinkVendingMachine;

public class DrinkVendingMachineTEST {
	
	/** 
	 * Task 2:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.vendors.DrinkVendingMachine'
	 * 
	 * 	Goal: 
	 * 		80% code/line coverage
	 * 		TDD: analyse code and add missing methods.
	 * */
	
	public final DrinkVendingMachine MACHINE = new DrinkVendingMachine();
	public final BRANDS brand = null;
	@Test
	public void testDrinkVendingMachineConstructor() {
		DrinkVendingMachine machine = new DrinkVendingMachine(1f, brand);
		assertNotNull(machine);
	}
	@Test
	public void testGiveCredit() {
		Wallet wallet = new Wallet(1f);
		Person user = new Person("Cam", wallet);
		MACHINE.giveCredit(user, 1f);
		assertEquals(MACHINE.getCredit(), 1f);
	}
	
	@Test
	public void testSelectDrinkNotEnoughCredit() {
		assertNull(MACHINE.selectDrink(1));
	}
	
	@Test
	public void testSelectDrinkDoesNotExist() {
		assertNull(MACHINE.selectDrink(-1));
	}
	
	@Test
	public void testSelectDrink() {
		MACHINE.setCredit(10f);
		assertEquals(MACHINE.selectDrink(0).toString(), "Water");
	}
}
