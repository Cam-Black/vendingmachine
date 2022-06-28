package vendormachine.users.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WalletTEST {

	public final Wallet WALLET = new Wallet();

	@Test
	public void testStartCredit() {
		Wallet wallet = new Wallet(1F);
		assertEquals(wallet.getAllCredit(), 1L);
	}
	
	@Test 
	public void testStartBrand() {
		Wallet wallet = new Wallet("Gucci",1F);
		assertEquals(wallet.getBrand(), "Gucci");
	}

	@Test
	public void testAddCredit() {
		WALLET.addCredit(1.5F);
		assertEquals(WALLET.getAllCredit(), 2F);
	}

	@Test
	public void testGetCredit() {
		assertEquals(WALLET.getCredit(0.5F), 0.5F);
	}

	@Test
	public void testGetTooMuchCredit() {
		assertEquals(WALLET.getCredit(1F), 0);
	}

	@Test
	public void testGetBrand() {
		Wallet wallet = new Wallet("Gucci", 1F);
		assertEquals(wallet.getBrand(), "Gucci");
	}

	@Test
	public void testSetCredit() {
		WALLET.setCredit(1F);
		assertEquals(WALLET.getAllCredit(), 1F);
	}

	@Test
	public void testSetBrand() {
		WALLET.setBrand("Gucci");
		assertEquals(WALLET.getBrand(), "Gucci");
	}
}
