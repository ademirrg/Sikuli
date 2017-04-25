package winscp;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Conectar {
	
	public static void main(String[] args) throws FindFailed {
		
		try {
			Screen tela = new Screen();
			
			//Conecta na VPN
			Pattern vpn1 = new Pattern("C:\\Sikuli\\VPN\\1.PNG");
			tela.click(vpn1);
			Pattern vpn2 = new Pattern("C:\\Sikuli\\VPN\\2.PNG");
			tela.click(vpn2);
			Pattern vpn3 = new Pattern("C:\\Sikuli\\VPN\\3.PNG");
			tela.click(vpn3);
			Pattern vpn4 = new Pattern("C:\\Sikuli\\VPN\\4.PNG");
			tela.click(vpn4);
			Pattern vpn5 = new Pattern("C:\\Sikuli\\VPN\\5.PNG");
			tela.click(vpn5);
			Pattern vpn6 = new Pattern("C:\\Sikuli\\VPN\\8.PNG");
			Thread.sleep(2000L);
			tela.click(vpn6);
			
			//Conecta as inst�ncias do WinSCP
			Pattern win1 = new Pattern("C:\\Sikuli\\WinSCP\\1.PNG");
			tela.click(win1);
			Pattern win2 = new Pattern("C:\\Sikuli\\WinSCP\\2.PNG");
			tela.doubleClick(win2);
			Thread.sleep(5000L);
			tela.type("ellow08" + Key.ENTER);
			Thread.sleep(4000L);
			Pattern win4 = new Pattern("C:\\Sikuli\\WinSCP\\4.PNG");
			tela.click(win4);
			Pattern win5 = new Pattern("C:\\Sikuli\\WinSCP\\5.PNG");
			tela.click(win5);
			Thread.sleep(4000L);
			tela.type("ellow08" + Key.ENTER);
			Thread.sleep(3000L);
			tela.type("tail -f " + Key.DIVIDE + "log_jboss" + Key.DIVIDE + "sigms" + Key.DIVIDE + Key.TAB + Key.ENTER);
			Pattern win6 = new Pattern("C:\\Sikuli\\WinSCP\\6.PNG");
			tela.click(win6);
			Pattern win7 = new Pattern("C:\\Sikuli\\WinSCP\\7.PNG");
			tela.click(win7);
			Pattern win8 = new Pattern("C:\\Sikuli\\WinSCP\\8.PNG");
			tela.doubleClick(win8);
			Thread.sleep(5000L);
			tela.type("ellow08" + Key.ENTER);
			Thread.sleep(4000L);
			Pattern win9 = new Pattern("C:\\Sikuli\\WinSCP\\4.PNG");
			tela.click(win9);
			Pattern win10 = new Pattern("C:\\Sikuli\\WinSCP\\5.PNG");
			tela.click(win10);
			Thread.sleep(4000L);
			tela.type("ellow08" + Key.ENTER);
			Thread.sleep(3000L);
			tela.type("tail -f " + Key.DIVIDE + "log_jboss" + Key.DIVIDE + "sigms" + Key.DIVIDE + Key.TAB + Key.ENTER);	
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}