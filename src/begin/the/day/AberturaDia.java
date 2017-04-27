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
//			tela.type("r", Key.WIN);
//			Thread.sleep(2000L);
//			tela.type("inetcpl.cpl" + Key.ENTER);
//			Pattern p1 = new Pattern("C:\\Sikuli\\BeginTheDay\\1.PNG");
//			tela.click(p1);
//			Pattern p2 = new Pattern("C:\\Sikuli\\BeginTheDay\\2.PNG");
//			tela.click(p2);
//			Pattern p3 = new Pattern("C:\\Sikuli\\BeginTheDay\\3.PNG");
//			tela.click(p3);
//			tela.type(Key.ENTER);
//			tela.type(Key.ESC);
			
			//Conecta na VPN
			Pattern vpn1 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\1.PNG");
			tela.click(vpn1);
			Pattern vpn2 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\2.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\2.PNG", 15000L);
			tela.click(vpn2);
			Pattern vpn3 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\3.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\3.PNG", 15000L);
			tela.click(vpn3);
			Pattern vpn4 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\4.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\4.PNG", 15000L);
			tela.click(vpn4);
			Pattern vpn5 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\5.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\5.PNG", 15000L);
			tela.click(vpn5);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\9.PNG", 15000L);
			Pattern vpn6 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\VPN\\8.PNG");
			tela.click(vpn6);
			
			//Abre páginas no Chrome
			Pattern p5 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\5.PNG");
			tela.click(p5);
			Pattern p6 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\6.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\6.PNG", 15000L);
			tela.click(p6);
			Pattern p11 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\11.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\11.PNG", 15000L);
			tela.click(p11);
			Thread.sleep(1000L);
			tela.type("t", Key.CTRL);
			Pattern p7 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\7.PNG");
			tela.click(p7);
			
			//Abre pasta do SIGMS
			Pattern p8 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\8.PNG");
			tela.click(p8);
			Pattern p9 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\9.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\9.PNG", 15000L);
			tela.click(p9);
			
			//Abre Slack
			tela.type("d", Key.WIN);
			tela.type(Key.WIN);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\14.PNG", 15000L);
			tela.type("slack");
			Pattern p10 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\10.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\10.PNG", 15000L);
			tela.click(p10);
			Pattern p12 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\12.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\12.PNG", 15000L);
			tela.click(p12);
			tela.type("d", Key.WIN);
			
			//Abre Outlook
			Pattern p4 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\BeginTheDay\\4.PNG");
			tela.click(p4);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
