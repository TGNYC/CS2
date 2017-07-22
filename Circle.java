package circleclass;

public class Circle {
    private String name;
    private double radius, circumference, diameter, area;
    private String type;
    
    public Circle() {
        name = "Globe";
        radius = 5;
        setCircumference(radius);
        setDiameter(radius);
        setArea(radius);
    }
    
    public Circle(String n, String t, double a) {
        name = n;
        type = t;
        if (type == "radius") {
            radius = a;
            setRadius(type);
        } else if (type == "circumference") {
            circumference = a;
            setRadius(type);
        } else if (type == "diameter") {
            diameter = a;
            setRadius(type);
        } 
    }
    
    public void setRadius(String a) {
        if (type == "radius") {
            setCircumference(radius);
            setDiameter(radius);
            setArea(radius);
        } else if (type == "circumference") {
            radius = circumference / 2 / Math.PI;
            setDiameter(radius);
            setArea(radius);
        } else if (type == "diameter") {
            radius = diameter / 2;
            setCircumference(radius);
            setArea(radius);
        }                
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
    
    public void setCircumference(double a) {
        circumference = a * 2 * Math.PI;
    }
    
    public double getCircumference() {
        return circumference;
    }
    
    public void setDiameter(double a) {
        diameter = a * 2;
    }
    
    public double getDiameter() {
        return diameter;
    }
    
    public void setArea(double a) {
        area = Math.PI * Math.pow(a, 2);
    }
    
    public double getArea() {
        return area;
    }
}
