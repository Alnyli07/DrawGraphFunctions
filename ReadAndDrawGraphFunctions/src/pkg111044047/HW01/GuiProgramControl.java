package pkg111044047.HW01;

/**
 * gorsel program kontrol
 * @author ATPSOFTWARE
 * @version 1.0
 * @created 27-�ub-2014 16:13:24
 */
public class GuiProgramControl extends ReadAndDisplay {

	public GuiFrame m_GuiFrame;

	public GuiProgramControl(){

	}

	/**
	 * komutlarin islemesini saglayan fonksiyon
	 */
	public void processCommand(){
            m_GuiFrame = new GuiFrame();
            m_GuiFrame.setVisible(true);
	}
}