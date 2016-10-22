package aula6.formatacao;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExemploNumberFormat {

	public static void main(String[] args) {
		System.out.println(NumberFormat.getInstance().format(5000));
		System.out.println(NumberFormat.getPercentInstance().format(92));
		System.out.println(NumberFormat.getCurrencyInstance().format(920));

		DecimalFormat decimalFormat = new DecimalFormat("00.00");
		System.out.println(decimalFormat.format(10.1));
		System.out.println(decimalFormat.format(10.12));
		System.out.println(decimalFormat.format(1.1));
	}
}
