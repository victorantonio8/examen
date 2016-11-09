
public class Rectangulo extends FiguraGeometrica{
	
	double base;
	double altura;
	
	protected Rectangulo(String color,double base, double altura){
		
		super(color);
		this.base=base;
		this.altura=altura;
		}

	
	public double getBase(){
		return base;
	}
	
	 public void setBase(double base)
	 {
		 this.base=base;
	 }
	 
	 
	 public double getAltura(){
			return altura;
		}
		
		 public void setAltura(double altura)
		 {
			 this.altura=altura;
		 }
		 
		 public double getArea(){
			 return (base*altura);
		 }
		
	

	
	
	

	
	
}




	
	
