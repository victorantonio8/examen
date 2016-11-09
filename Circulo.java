
public class Circulo extends FiguraGeometrica{
	
	double radio;
	
	protected  Circulo(String color,double radio){
		super(color);
		this.radio=radio;
		
	}
		
		public double getRadio(){
			return radio;
		}
		
		 public void setRadio(double radio)
		 {
			 this.radio=radio;
		 }
		 
		 public double getArea(){
			 return 3.14*radio*radio;
			 
			}
		 
		
	}

	
		
		