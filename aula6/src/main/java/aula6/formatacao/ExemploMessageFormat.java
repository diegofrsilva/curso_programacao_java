package aula6.formatacao;

import java.text.MessageFormat;
import java.util.Date;

public class ExemploMessageFormat {

	public static void main(String[] args) {
		String template = "SELECT * FROM pessoa where nome like {0} or sobrenome like {1}";
		String message = MessageFormat.format(template, "juquinha", "da silva");

		System.out.println(message);
		
		Date date = new Date();
		Object[] messageArguments = { "Brasil", new Integer(25), date };

		String pattern = "Às {2,time,short} em {2,date,long} foram realizados {1,number,integer} no {0}";
		System.out.println(MessageFormat.format(pattern, messageArguments));
	}
}
