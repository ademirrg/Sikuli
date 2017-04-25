package begin.the.day;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class AberturaDia {
	
	public static void main(String[] args) throws FindFailed {
		
		Screen tela = new Screen();
		
		try {
			
			//Ajusta proxy
			tela.type("r", Key.WIN);
			tela.type("inetcpl.cpl" + Key.ENTER);
			Pattern p1 = new Pattern("C:\\Sikuli\\BeginTheDay\\1.PNG");
			tela.click(p1);
			Pattern p2 = new Pattern("C:\\Sikuli\\BeginTheDay\\2.PNG");
			tela.click(p2);
			Pattern p3 = new Pattern("C:\\Sikuli\\BeginTheDay\\3.PNG");
			tela.click(p3);
			tela.type(Key.ENTER);
			tela.type(Key.ESC);
			
			//Abre Outlook
			Pattern p4 = new Pattern("C:\\Sikuli\\BeginTheDay\\4.PNG");
			tela.click(p4);
			Thread.sleep(3000L);
		
			
			//Abre páginas no Chrome
			Pattern p5 = new Pattern("C:\\Sikuli\\BeginTheDay\\5.PNG");
			tela.click(p5);
			Pattern p6 = new Pattern("C:\\Sikuli\\BeginTheDay\\6.PNG");
			tela.click(p6);
			tela.type("t", Key.CTRL);
			Pattern p7 = new Pattern("C:\\Sikuli\\BeginTheDay\\7.PNG");
			tela.click(p7);
			
			//Abre pasta do SIGMS
			Pattern p8 = new Pattern("C:\\Sikuli\\BeginTheDay\\8.PNG");
			tela.click(p8);
			Pattern p9 = new Pattern("C:\\Sikuli\\BeginTheDay\\9.PNG");
			tela.click(p9);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
