package pointclass;

public class Point
	{
            private int x;
            private int y;
                
        public Point(int a, int b)
	{
            x = a;
            y = b;
	}
        
        public void setx(int a)
	{
		if (a <= 10) {
			x = a;
		}
	}
        
        public int getx()
	{
		return x;
	}


	}
	
	// new file
	
	package pointclass;

public class PointClass {

    public static void main(String[] args) throws Exception {
        
        Point a[];
        a = new Point[2];
        a[0] = new Point(1,1);
	a[1] = new Point(5,5);
	// creates two points
        
    }
    
}
