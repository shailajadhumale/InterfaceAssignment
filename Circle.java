public class Circle extends TwoD {
	public Circle()
    {
    	
    }
    public Circle(ShapeColor sc,int a)
    {
    	super(sc,a);
    }

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*a*a;//PI*R*R
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
    
    
}