/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg111044047.HW01;


/**
 *
 * @author ATPSOFTWARE
 * 
 */
public class GraphProgramme {
    
    public ProgramControl m_ProgramControl;
    public ProcessProgram m_ProcessProgram;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GuiProgramControl gui = new GuiProgramControl();
        gui.processCommand();
        ConsoleProgramControl console = new ConsoleProgramControl();
        console.processCommand();
    }
    
}
