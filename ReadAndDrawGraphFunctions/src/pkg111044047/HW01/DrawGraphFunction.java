package pkg111044047.HW01;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.Field;
import javax.swing.JPanel;

/**
 * fonksiyonun gragini cizer.
 * @author ATPSOFTWARE
 * @version 1.0
 * @created 27-�ub-2014 16:13:24
 */
public class DrawGraphFunction extends JPanel {

	private double graphRange;
        private Graphics2D g2d;
        private int sizeX ,sizeY;
        private double dongu = 0.0001;
        private boolean validGraph = false;
        private Function[] data;
        
        DrawGraphFunction(){
            this.sizeX = 400;
            this.sizeY = 400;
            foundValidGraphRange();
	}

	DrawGraphFunction(int sizeX, int sizeY, Function[] funcs){
             this.sizeX = sizeX;
             this.sizeY = sizeY;
             if(funcs != null){
                if (funcs.length>0){
                           validGraph = true;
                           data = funcs;
                }
             }
              foundValidGraphRange();
	}
        
         public void setSizeX(int size)
         {
             this.sizeX = size;
             this.setSize(sizeX, sizeY);
         }
         
          public void setSizeY(int size)
         {
             this.sizeY = size;
             this.setSize(sizeX, sizeY);
         }
        @Override
        public void paintComponent( Graphics g )
        {
            super.paintComponent( g ); // call superclass's paintComponent
            this.setBackground( Color.WHITE );
            g2d = ( Graphics2D ) g; // cast g to Graphics2D
            
            if(validGraph)
            {
                baseGraph();
                drawFunctions();
            }
            else
                 baseGraph();

        }

	private void baseGraph(){
            g2d.setColor(Color.LIGHT_GRAY);
            g2d.setStroke( new BasicStroke( 0.1f ) );
           
           for(int i= 0; i<sizeY; i+= sizeY/20)
           {
                g2d.drawLine(0, i, sizeX, i);
           }
           for(int i= 0; i<sizeX; i+=sizeX/20)
           {
                g2d.drawLine(i, 0, i, sizeY);
           }
            g2d.setStroke( new BasicStroke( 1.1f ) );
            g2d.setColor(Color.gray);
           for(int i= 0; i<sizeY; i+= sizeY/4)
           {
                g2d.drawLine(0, i, sizeX, i);
           }
           for(int i= 0; i<sizeX; i+=sizeX/4)
           {
                g2d.drawLine(i, 0, i, sizeY);
           }
            g2d.setColor(Color.BLACK);
            g2d.setStroke( new BasicStroke( 1.8f ) );
            g2d.drawLine(sizeX/2, 0, sizeX/2, sizeY);
            g2d.drawLine(0, sizeY/2, sizeX, sizeY/2);
            g2d.drawString(""+graphRange/2, 0, sizeY/4 -1);
            g2d.drawString("-"+graphRange/2, 0, (sizeY/4)*3 -1);
            g2d.drawString("-"+graphRange/2, sizeX/4 +2, sizeY);
            g2d.drawString(""+graphRange/2, (sizeX/4)*3 +2, sizeY);
            g2d.drawString("0.0", 0, sizeY/2-2);
            g2d.drawString("0.0", sizeX/2+2, sizeY);
            g2d.setStroke( new BasicStroke( 2.2f ));

	}

	/**
	 * fonksiyonlari id leirne gore cizer.
	 * 
	 * @param funcs
	 */
	private void drawFunctions(){
            if(data != null)
            {
                for(int i=0 ; i<data.length; ++i)
                {
                       drawFunction(data[i]);
                }
            }

	}
        private void drawFunction(Function func)
        {
          switch(func.getFuncId())
          {
              case 0: drawGraphSin(func);
                   break;
              case 1: drawGraphCos(func);
                   break;
              case 2: drawGraphTan(func);
                   break;
              case 3: drawGraphCot(func);
                   break;
              case 4: drawGraphCosh(func);
                   break;
              case 5: drawGraphPol(func);
                   break;
              case 6: drawGraphLog(func);
                   break;
              case 7: drawGraphExp(func);
                   break;
          }
        }

	/**
	 * cos cizer.
	 * 
	 * @param func
	 */
	private void drawGraphCos(Function func){
           
            Color color = getColor(func.getGraphColor());
            g2d.setColor(color);
            int x=0,y=0;
            for(double i=func.getRange0(); i<=func.getRange1(); i += dongu )
            {
                 x =getX(i);
                 y = getY(Math.cos(i)) ;
                   g2d.drawLine(x, y, x, y);     
            }
	}

	/**
	 * cosh(x) fonksiyonunu cizer
	 * 
	 * @param func
	 */
	private void drawGraphCosh(Function func){
             Color color = getColor(func.getGraphColor());
             g2d.setColor(color);
             int x=0,y=0;
            for(double i=func.getRange0(); i<=func.getRange1(); i += dongu )
            {
                x =getX(i);
                y = getY(Math.cosh(i)) ;
                   g2d.drawLine(x, y, x, y);     
            }
	}

	/**
	 * 
	 * @param func
	 */
	private void drawGraphCot(Function func){
             Color color = getColor(func.getGraphColor());
             g2d.setColor(color);
             int x=0,y=0;
            for(double i=func.getRange0(); i<=func.getRange1(); i += dongu )
            {
                 x =getX(i);
                 y = getY(Math.cos(i)/Math.sin(i)) ;
                   g2d.drawLine(x, y, x, y);     
            }
	}

	/**
	 * e^x cizer
	 * 
	 * @param func
	 */
	private void drawGraphExp(Function func){
             Color color = getColor(func.getGraphColor());
             g2d.setColor(color);
             int x=0,y=0;
            for(double i=func.getRange0(); i<=func.getRange1(); i += dongu )
            {
                 x =getX(i);
                 y = getY(Math.exp(i)) ;
                   g2d.drawLine(x, y, x, y);     
            }
             
	}

	/**
	 * 
	 * @param func
	 */
	private void drawGraphLog(Function func){
             Color color = getColor(func.getGraphColor());
             g2d.setColor(color);
             int x=0,y=0;
            for(double i=func.getRange0(); i<=func.getRange1(); i += dongu )
            {
                 x =getX(i);
                 y = getY(Math.log(i)) ;
                   g2d.drawLine(x, y, x, y);     
            }
	}

	/**
	 * 
	 * @param func
	 */
	private void drawGraphPol(Function func){
             Color color = getColor(func.getGraphColor());
             g2d.setColor(color);
             int x=0,y=0;
            for(double i=func.getRange0(); i<=func.getRange1(); i += dongu )
            {
                 x =getX(i);
                 y = getY(i) ;
                   g2d.drawLine(x, y, x, y);  
                   if(x == 0)
                   {
                       
                   }
            }
	}

	/**
	 * sin cizer
	 * 
	 * @param func
	 */
	private void drawGraphSin(Function func){
             Color color = getColor(func.getGraphColor());
             g2d.setColor(color);
             int x=0,y=0;
            for(double i=func.getRange0(); i<=func.getRange1(); i += dongu )
            {
                x =getX(i);
                y = getY(Math.sin(i)) ;
                   g2d.drawLine(x, y, x, y);     
            }
	}

	/**
	 * 
	 * @param func
	 */
	private void drawGraphTan(Function func){
             Color color = getColor(func.getGraphColor());
             g2d.setColor(color);
              int x=0,y=0;
            for(double i=func.getRange0(); i<=func.getRange1(); i += dongu )
            {
                x =getX(i);
                y = getY(Math.tan(i)) ;
                   g2d.drawLine(x, y, x, y);     
            }
	}

	public double getGraphRange(){
		return this.graphRange;
	}

	/**
	 * x koordinatini doner.
	 * 
	 * @param value
	 */
	private int getX(double value){
                int xartis = (int)(sizeX/(2*this.graphRange));
              if(value>=0)
              {
                  return (int)(sizeX/2+value*xartis);
              }
              else
              {
                   return (int)(sizeX/2+(value*xartis));
              }
	}

	/**
	 * y koordinatini doner.
	 * 
	 * @param result
	 */
	private int getY(double result){
		 int yartis=(int)(sizeY/(2*this.graphRange));
                if(result>=0)
                {
                    return (int)(sizeY/2-result*yartis);
                }
                else
                {
                     return (int)(sizeY/2-result*yartis);
                }
	}

	/**
	 * 
	 * @param range
	 */
	public void setGraphRange(double range){
            this.graphRange = range;
	}
        
        private Color getColor(String str)
        {
             Color color;
            try {
                Field field = Color.class.getField(str);
                color = (Color)field.get(null);
            } catch (Exception e) {
                color = Color.CYAN; // Not defined
            }
            
            return color;
        }
        
        private void foundValidGraphRange()
        {
            double range0=0.0,range1=0.0,range=0.0;
            if(data == null)
                    this.graphRange = 5.0;
            else
            {
                for(int i =0; i<data.length; ++i)
                {
                    range0 = data[i].getRange0();
                    range1 = data[i].getRange1();

                    if(range0 < 0 )
                                range0 *= -1;
                    if(range1 < 0 )
                                range1 *= -1;

                    if(range0 > range )
                                range = range0;

                    if(range1 > range )
                                range = range1;
                }
                this.graphRange = range;
            }
        }

}