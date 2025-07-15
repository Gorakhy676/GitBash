package demo;

import org.testng.annotations.Test;

public class Package1 {

	@Test
	public void add() {
		System.out.println("hey");
		String url = System.getProperty("url");
		String browser = System.getProperty("bro");

		System.out.println(url);
		System.out.println(browser);
	}
}
