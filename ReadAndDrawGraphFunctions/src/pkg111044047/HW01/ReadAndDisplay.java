package pkg111044047.HW01;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;


/**
 * @author ATPSOFTWARE
 * @version 1.0
 * @created 27-�ub-2014 16:13:24
 */
public abstract class ReadAndDisplay implements ProgramControl {
private final String[] base = {"sin(x)","cos(x)","tan(x)","cot(x)","cosh(x)",
                                                "x","log(x)","exp(x)"};
 private  String fileName;
 private  ProcessProgram prg = null;
 private  String[] data;
 private  boolean[] valid;

 
	public ReadAndDisplay(){

	}

        @Override
	public void clearVisulation(int sizeId){
         if(prg == null)
                prg = new ProcessProgram();
         else
         {
              if(  prg.getFrame() != null )
                        prg.getFrame().dispose();
              prg = new ProcessProgram();
         }
         prg.setSizeId(sizeId);
         prg.createGraphFrame();
	}

        @Override
	public boolean displayGraph(int sizeId){
              if(data != null)
              {
                if( prg == null)
                      prg = new ProcessProgram();
                else
                {
                   if(  prg.getFrame() != null )
                                prg.getFrame().dispose();
                    prg = new ProcessProgram();
                }
                
                if(prg.createFunctions(data,valid) == 0)
                                return false;
                prg.setSizeId(sizeId);
                prg.createGraphFrame();
                return true;
              }
                return false;
	}


        @Override
	public void readFile(){
		int i=0;
             data = new String[readLine()];// satir sayisi kadar yer al.
          File file = new File(this.fileName);
            try{
                BufferedReader reader = new BufferedReader(new FileReader(file));
          
                for( String satir=reader.readLine(); satir!= null; satir=reader.readLine()){

                    data[i] = satir;
                    ++i;
                }
                reader.close();
              }
              catch(IOException e)
              { 
              }
              // gecerlimi kontrol et
              controlData();
        }
        
        private void controlData()
        {
            if(data != null){
               valid = new boolean[data.length];
            
            for(int i=0; i<valid.length; ++i)
            {
                if(isValid(data[i]))
                {
                    valid[i] = true;
                }
                else
                     valid[i] = false;
            }
           }
        }
        
        private boolean isValid(String str)
        {
            int control = 0;
            String[] analiz = str.split(",");
            if(analiz.length == 4)
            {
            if(isFunc(analiz[0]))
                    control++;
            if(isDouble(analiz[1]))
                    control++;
            if(isDouble(analiz[2]))
                    control++;
            if(isValidColor(analiz[3]))
                    control++;
            }
            if(control == 4)
                    return true;
            else
                    return false;
        }
        
        // fonksiyon mu ?
        private boolean isFunc(String str)
        {
            
            for(int i=0; i<8; ++i)
            {
                if(str.equals(base[i]))
                            return true;
            }
            return false;
        }
        
        // double a convert edebiliyormuyuz ?
        private boolean isDouble(String str)
        {
            try{
               Double.parseDouble(str);
            }
            catch(NumberFormatException e)
            {
                return false;
            }
            return true;
        }
        
        // renk sistemde tanimlimi?
        private boolean isValidColor(String str)
        {
            Color color;
            try {
                Field field = Color.class.getField(str);
                color = (Color)field.get(this);
            } catch (Exception e) {
                color = null; // Not defined
            }
            
            if(color == null)
                    return false;
            else
                    return true;
        }
        public int isValidNums()
        {
            int res =0;
            if(valid != null){
                for(int i=0; i<valid.length; ++i)
                {
                    if(valid[i] == true)
                            res++;
                }
            }
            return res;
        }
        
        public int unValidNums()
        {
            if(valid != null){
                 return  valid.length - isValidNums();
            }
            return 0;
        }
        
        public String[] getReadingData()
        {
            return this.data;
        }
        
        public boolean[] getIsValidData()
        {
            return this.valid;
        }
        public void setFileName(String str)
        {
            this.fileName = str;
        }
        public String getFileName()
        {
            return this.fileName;
        }
      
        private int readLine()
        {
            File file = new File(this.fileName);
       
         int res = 0;
      // dosyadaki satir sayisina gore string dizisi acmamiz icin Vector olustur.
            try{
                BufferedReader reader = new BufferedReader(new FileReader(file));
          
                for( String satir=reader.readLine(); satir!= null; satir=reader.readLine()){

                  res++;
                }
                reader.close();
              }
              catch(IOException e)
              { 
              }
            return res;
        }
}