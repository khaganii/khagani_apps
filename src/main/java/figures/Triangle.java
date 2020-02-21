package figures;

public class Triangle extends Figure {
    Point p1;
    Point p2;
    Point p3;
    Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    @Override
    public void area(){
        double area = p1.x + p1.y + 25;
        System.out.println("Circle: " + area);
    }
}
