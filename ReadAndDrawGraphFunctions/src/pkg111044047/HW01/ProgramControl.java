package pkg111044047.HW01;
/**
 * program�n temel y�netimini i�eren interface
 * @author Ali
 * @version 1.0
 * @created 27-�ub-2014 16:13:24
 */
public interface ProgramControl {
    
	public void clearVisulation(int sizeId);

	public boolean displayGraph(int sizeId);

	/**
	 * komutlarin islemesini saglayan fonksiyon
	 */
	public void processCommand();

	public void readFile();

}