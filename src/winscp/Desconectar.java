package winscp;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Desconectar {
	
	public static void main(String[] args) throws FindFailed {
		
		try {
			Screen tela = new Screen();
			Pattern passo1 = new Pattern("C:\\Sikuli\\VPN\\1.PNG");
			tela.click(passo1);
			Pattern passo2 = new Pattern("C:\\Sikuli\\VPN\\2.PNG");
			tela.click(passo2);
			Pattern passo3 = new Pattern("C:\\Sikuli\\VPN\\3.PNG");
			tela.click(passo3);
			Pattern passo4 = new Pattern("C:\\Sikuli\\VPN\\4.PNG");
			tela.click(passo4);
			Pattern passo5 = new Pattern("C:\\Sikuli\\VPN\\7.PNG");
			tela.click(passo5);
			Pattern passo6 = new Pattern("C:\\Sikuli\\VPN\\8.PNG");
			Thread.sleep(2000L);
			tela.click(passo6);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
