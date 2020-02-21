package figures;

public class Rectangle extends Figure{
    Point p1;
    Point p2;
    Rectangle(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    @Override
    public void area(){
        double area;
        area = Math.abs(p1.x - p2.x) * Math.abs(p1.y - p2.y);
        System.out.println("Circle: " + area);
    }


}
