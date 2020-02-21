package figures;

public class Circle extends Figure {
    double p = 3.14;
    int r;
    Point p1;
    Circle(Point p1, int a){
        this.p1 = p1;
        r = a;
    }
    @Override
    public double area(){
        return p*Math.pow(r, 2);
    }
}
