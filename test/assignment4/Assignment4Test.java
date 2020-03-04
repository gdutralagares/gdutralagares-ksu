package assignment4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

import assignment4.BaseConversion;

public class Assignment4Test {
	
	@Test
	public void Test_Base8Conversion() {
		int n1=753, numSystemToConvertTo=8;
		String convertedNumber = BaseConversion.RecursiveBaseConversion(n1, numSystemToConvertTo);
		assertEquals(convertedNumber, "1361");
	}
	
	@Test
	public void Test_Base16Conversion() {
		int n1=753, numSystemToConvertTo=16;
		String convertedNumber = BaseConversion.RecursiveBaseConversion(n1, numSystemToConvertTo);
		assertEquals(convertedNumber, "2F1");
	}
	
	@Test
	public void Test_Base20Conversion() {
		int n1=9098, numSystemToConvertTo=20;
		String convertedNumber = BaseConversion.RecursiveBaseConversion(n1, numSystemToConvertTo);
		assertEquals(convertedNumber, "12EI");
	}
	
	@Test
	public void Test_Base2Conversion() {
		int n1=692, numSystemToConvertTo=2;
		String convertedNumber = BaseConversion.RecursiveBaseConversion(n1, numSystemToConvertTo);
		assertEquals(convertedNumber, "1010110100");
	}
	
	@Test
	public void Test_Base8Conversion_2() {
		int n1=200, numSystemToConvertTo=8;
		String convertedNumber = BaseConversion.RecursiveBaseConversion(n1, numSystemToConvertTo);
		assertEquals(convertedNumber, "310");
	}


}