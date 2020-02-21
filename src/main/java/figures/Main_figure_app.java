package figures;
import java.util.ArrayList;

public class Main_figure_app {
    public static <figures> void main(String[] args) {
       Rectangle rc = new Rectangle(new Point(2, 3), new Point(5, 3));
       Triangle tr =  new Triangle(new Point(2, 3), new Point(5, 3), new Point(6, 5));
       Circle cr =  new Circle(new Point(2,3), 4);

       ArrayList <Figure> arrayList = new ArrayList();
       arrayList.add(rc);
       arrayList.add(tr);
       arrayList.add(cr);
       double total = 0;
       for (Figure f: arrayList) {
         total += f.area();
       }
      System.out.println(total);
    }
}
