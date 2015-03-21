package pkg111044047.HW01;
/**
 * fonksiyonlar�n bilgisini tutan s�n�f
 * @author ATPSOFTWARE
 * @version 1.0
 * @created 27-�ub-2014 16:13:24
 */
public class Function {

	/**
	 * fonksiyon tipini tutar. yazlimcinin kendi siteminde tanimlidir.
	 */
	private int funcId;
	/**
	 * fonksiyonun ismi
	 */
	private String funcName;
	/**
	 * ilkdeger
	 */
	private double funcRange0;
	/**
	 * sondeger
	 */
	private double funcRange1;
	/**
	 * grafik rengi
	 */
	private String graphColor;

	 Function(){
            setFuncId("sin(x)");
            setName("sin(x)");
            setRange0(-5);
            setRange1(5);
            setGraphColor("BLACK");
	}

	/**
	 * datayi ayristirir ve gerekli bilgileri doldurarak function objesi yapar.
	 * 
	 * @param data
	 */
	 Function(String data){
            
            String[] veri = data.split(",");
            setFuncId(veri[0]);
            setName(veri[0]);
            setRange0(Double.parseDouble(veri[1]));
            setRange1(Double.parseDouble(veri[2]));
            editingRangeSmallestThanGreater();
            setGraphColor(veri[3]);
	}

	

	public String getGraphColor(){
		return this.graphColor;
	}

	/**
	 * @return fonksiyonun ismini dondurur
   
	 */
	public String getName(){
		return this.funcName;
	}

	public double getRange0(){
		return this.funcRange0;
	}

	public double getRange1(){
		return this.funcRange1;
	}

	/**
	 * 
	 * @param color
	 */
	public void setGraphColor(String color){
           this.graphColor = color;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name){
            this.funcName = name;
	}

	/**
	 * 
	 * @param range
	 */
	public void setRange0(double range){
            this.funcRange0 = range;

	}

	/**
	 * 
	 * @param range
	 */
	public void setRange1(double range){
            this.funcRange1 = range;

	}
        
        private void setFuncId(String str)
        {
            if(str.equals("sin(x)"))
                        this.funcId = 0;
            else if(str.equals("cos(x)"))
                        this.funcId = 1;
            else if(str.equals("tan(x)"))
                        this.funcId = 2;
            else if(str.equals("cot(x)"))
                        this.funcId = 3;
            else if(str.equals("cosh(x)"))
                        this.funcId = 4;
            else if(str.equals("x"))
                        this.funcId = 5;
            else if(str.equals("log(x)"))
                        this.funcId = 6;
            else if(str.equals("exp(x)"))
                        this.funcId = 7;
        }
        
        public int getFuncId()
        {
            return this.funcId;
        }
        
        private void editingRangeSmallestThanGreater()
        {
            if(this.funcRange0 > this.funcRange1)
            {
                double temp = this.funcRange1;
                this.funcRange1 = this.funcRange0;
                this.funcRange0 = temp;
            }
        }

}