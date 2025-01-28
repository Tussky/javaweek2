package exercise3;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    // Note that circle runs, but "this.color" is never used!!

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String col){
        this.radius = radius;
        this.color = col;
    }

    public void getRadius(){
        System.out.println("Radius is: "+this.radius);
    }
    public void getArea(){
        System.out.println("Area is: " + (Math.PI * Math.pow(radius, 2)));
    }

}


