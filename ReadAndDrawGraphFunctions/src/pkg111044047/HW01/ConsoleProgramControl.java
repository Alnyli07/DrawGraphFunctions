package pkg111044047.HW01;

import java.io.IOException;
import java.util.Scanner;

/**
 * programin konsoldan kontrolu
 * @author ATPSOFTWARE
 * @version 1.0
 * @created 27-�ub-2014 16:13:24
 */
public class ConsoleProgramControl extends ReadAndDisplay {

    private final String exampInput = "C:\\Users\\ATPSOFTWARE\\Desktop\\functions.txt";
	public ConsoleProgramControl(){

	}
	/**
	 * komutlarin islemesini saglayan fonksiyon
	 */
    @Override
	public void processCommand(){
            int select,sizeId = 0;
            do{    
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            printMenu();
            Scanner s = new Scanner(System.in);
            select = s.nextInt();
           switch(select)
           {
               case 1 : 
                     System.out.println(" input File example( "+exampInput+")\nEnter: ");
                     s.nextLine();
                     this.setFileName(s.nextLine());
                     this.readFile();
                     printFile(this.getReadingData()); 
                    break;
               case 2 : 
                   System.out.println(" Select size:\n 0 - 400 X 400\n"
                           + "1 - 500 X 500\n2 - 600 X 600\n3 - 640 X 480 ");
                    sizeId = s.nextInt();
                   if(sizeId <= 3 && sizeId >= 0){
                   if(this.displayGraph(sizeId))
                             System.out.println(" draw Graph, You can see frame.\n");
                        else
                             System.out.println(" No data .. Try Read .\n");
                   }
                   else
                       System.out.println(" Wrong size ..\n");
                    break;
               case 3 :  System.out.println(" Cleared graph .\n");
                   this.clearVisulation(sizeId);
                    break;
               case 0 :  
                   System.out.println(" Exiting programme.. Good Bye \n");
                   System.exit(0); 
                   break;
               default: System.out.println("\n Wrong Selection\n");
           }
           System.out.println("\n Enter any integer to continue .. ");
           int devam =s.nextInt();
            }while(select != 0);
           
            
	}
        
        private void printMenu(){
             System.out.println("--------------------------------------------\n");
             System.out.println("-                                          -\n");
             System.out.println("--    Welcome Function Graph Programme    --\n");
             System.out.println("-                                          -\n");
             System.out.println("-  1 -   Read File                         -\n");
             System.out.println("-  2 -   Display Graphs                    -\n");
             System.out.println("-  3 -   Clear Visilations                 -\n");
             System.out.println("-  0 -   exit                              -\n");
             System.out.println("-                                          -\n");
             System.out.println("---------------- Select -------------------- ");
        }
        
        private void printFile(String[] data)
        {
           
             System.out.println("- File in ..\n");
            for(int i=0; i<data.length; ++i)
            {
                System.out.println("VALID: "+this.getIsValidData()[i]+"  - "+i+" - "+ data[i]+"\n");
            }
                
        }

}