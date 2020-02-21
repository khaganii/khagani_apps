package figures;

public class Circle extends Figure {
    double p = 3.14;
    int r;
    Point p1;
    Circle(Point p1, int a){
        this.p1 = p1;
        r = a;
    }
    public void area(){
        double area;
        area = p*Math.pow(r, 2);
        System.out.println("Circle: " + area);
    }
}
