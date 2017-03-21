package goerguelue;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.color.*;
import org.junit.*;
/*
 * 
 */
public class AutoTest {

	Auto a;
	
	@Before
	public void start(){
		a=new Auto();
	}
	
	@Test
	public void testCreateAuto(){
		assertEquals("Are not the same Cars","Ford, weiﬂ, 160PS",a.toString());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testIllegalCreateAuto(){
		a = new Auto("",null,0);
	}
	
	@Test
	public void testLeistung(){
		a.setLeistung(160);
		assertEquals("Ford, rot, 160PS",a.toString());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testIllegalLeistung(){
		a.setLeistung(0);
	}
	
	@Test
	public void testType(){
		a.setType("BMW X6");
		assertEquals("BMW X6, rot, 160PS",a.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalType(){
		a.setType("");;
	}
	
	@Test
	public void testColorBlack(){
		a.setFarbe(Color.BLACK);
		assertEquals("Ford, schwarz, 160PS", a.toString());
	}
	
	@Test
	public void testColorWhite(){
		a.setFarbe(Color.WHITE);
		assertEquals("Ford, weiﬂ, 160PS", a.toString());
	}
	
	@Test
	public void testColorRed(){
		a.setFarbe(Color.RED);
		assertEquals("Ford, rot, 160PS",a.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalColor(){
		a.setFarbe(null);
	}
	
	@Test
	public void end(){
		System.out.println("Test finished!");
	}

}
