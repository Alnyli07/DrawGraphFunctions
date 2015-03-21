package pkg111044047.HW01;

import java.util.Vector;
import javax.swing.JFrame;


/**
 * @author ATPSOFTWARE
 * @version 1.0
 * @created 27-�ub-2014 16:13:24
 */
public class ProcessProgram {

	private Function[] functions;
        private JFrame graphFrame=null;
        private int [][] size={ {400,400},{ 500,500},{600,600},{640,480}};
        private int sizeId;
        public Function m_Function;
        public DrawGraphFunction m_DrawGraphFunction;

	public ProcessProgram(){

	}

	/**
	 * functions objelerini olu�turur ve ka� tane oldugunu doner.
	 * 
	 * @param datas
	 */
	public int createFunctions(String[] datas, boolean[] valid ){
          
            Vector func = new Vector(0);
            if(datas != null)
            {
                for(int i=0; i<datas.length; ++i)
                {
                    if(valid[i])
                    {
                        m_Function = new Function(datas[i]);
                        func.add(m_Function);
                    }     
                }
                functions = new Function[func.size()];
                for(int i=0; i<func.size(); ++i)
                {
                    functions[i] = (Function) func.get(i);
                }
            }
            else
                return 0;
            return functions.length;
	}
        
        // Fonksiyonlarını grafigini cizilmis sekilde gosterir.
	public void createGraphFrame(){
            if(functions == null)
             {
                 m_DrawGraphFunction = new DrawGraphFunction(size[sizeId][0],size[sizeId][1]
                                            ,null);
                 //sizeId = 0;
             }
            else
                m_DrawGraphFunction = new DrawGraphFunction(size[sizeId][0],
                                                      size[sizeId][1],functions);
            if(graphFrame == null)
                    graphFrame = new JFrame("Graph");
            else
                    graphFrame.dispose();
            
                graphFrame.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
                graphFrame.setBounds(100, 70, size[sizeId][0]+12, size[sizeId][1]+30);
                graphFrame.setResizable(false);
                graphFrame.add(m_DrawGraphFunction);
                graphFrame.setVisible(true);
        
	}
        
        public void setSizeId(int id){
            this.sizeId = id;
        }
        
        
        public JFrame getFrame()
        {
            return this.graphFrame;
        }
       
         

}