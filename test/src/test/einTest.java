package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class einTest {
    public static void main(String[] args) {
	System.out.println("Programm beenden? (j)");
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	try {
	    String tmp = read.readLine().trim();
	    if (tmp.equals("j")) {
		System.exit(0);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
