package ar.com.templateit.test;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		 
		DecimalFormat decimales = new DecimalFormat("0.00");
	      double numero = 145.00;

	      System.out.println(decimales.format(numero));
    }
}
