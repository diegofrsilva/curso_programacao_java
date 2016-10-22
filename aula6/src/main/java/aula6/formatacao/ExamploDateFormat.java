package aula6.formatacao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ExamploDateFormat {

	public static void main(String[] args) throws ParseException {
		DateFormat dateFormat = DateFormat.getInstance();
		DateFormat dateFormatEnglish = DateFormat.getDateInstance(
				DateFormat.FULL, Locale.ENGLISH);

		System.out.println(dateFormat.format(new Date()));
		System.out.println(dateFormatEnglish.format(new Date()));
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDateFormat.format(new Date())); 
		
		Date dataNascimento = simpleDateFormat.parse("23/05/1989");
		System.out.println(dataNascimento);
		
	}
}
