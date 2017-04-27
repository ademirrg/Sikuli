package winscp;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class AbrirWinSCP {
	
	public static void main(String[] args) throws FindFailed {
		
		Screen tela = new Screen();
		
		try {
			
//			//Conecta na VPN
//			Pattern vpn1 = new Pattern("/images/VPN/1.PNG");
//			tela.click(vpn1);
//			Pattern vpn2 = new Pattern("/images/VPN/2.PNG");
//			tela.wait("/images/VPN/2.PNG", 15000L);
//			tela.click(vpn2);
//			Pattern vpn3 = new Pattern("/images/VPN/3.PNG");
//			tela.wait("/images/VPN/3.PNG", 15000L);
//			tela.click(vpn3);
//			Pattern vpn4 = new Pattern("/images/VPN/4.PNG");
//			tela.wait("/images/VPN/4.PNG", 15000L);
//			tela.click(vpn4);
//			Pattern vpn5 = new Pattern("/images/VPN/5.PNG");
//			tela.wait("/images/VPN/5.PNG", 15000L);
//			tela.click(vpn5);
//			tela.wait("/images/VPN/9.PNG");
//			Pattern vpn6 = new Pattern("/images/VPN/8.PNG");
//			tela.click(vpn6);
			
			//Conecta as instâncias do WinSCP
			Pattern win1 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\1.PNG");
			tela.click(win1);
			Pattern win2 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\2.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\2.PNG", 15000L);
			tela.doubleClick(win2);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\8.PNG", 15000L);
			tela.type("ellow08" + Key.ENTER);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\11.PNG", 15000L);
			Thread.sleep(1500L);
			tela.type("p", Key.CTRL);
			Pattern win3 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\3.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\3.PNG", 15000L);
			tela.click(win3);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\9.PNG", 15000L);
			tela.type("ellow08" + Key.ENTER);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\10.PNG", 15000L);
			tela.type("tail -f " + Key.DIVIDE + "log_jboss" + Key.DIVIDE + "sigms" + Key.DIVIDE + Key.TAB + Key.ENTER);
			Pattern win4 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\4.PNG");
			tela.click(win4);
			tela.type("n", Key.CTRL);
			Pattern win5 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\5.PNG");
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\5.PNG");
			tela.doubleClick(win5);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\8.PNG", 15000L);
			tela.type("ellow08" + Key.ENTER);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\11.PNG", 15000L);
			Thread.sleep(1500L);
			tela.type("p", Key.CTRL);
			Pattern win6 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\3.PNG");
			tela.click(win6);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\9.PNG", 15000L);
			tela.type("ellow08" + Key.ENTER);
			tela.wait("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\10.PNG", 15000L);
			tela.type("tail -f " + Key.DIVIDE + "log_jboss" + Key.DIVIDE + "sigms" + Key.DIVIDE + Key.TAB + Key.ENTER);	
			Pattern win7 = new Pattern("C:\\Users\\ademirgarcia\\Documents\\Workspace_Sikuli\\Sikuli\\images\\WinSCP\\7.PNG");
			tela.click(win7);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
