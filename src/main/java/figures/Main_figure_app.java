package figures;
import java.util.ArrayList;
import java.util.Random;

public class Main_figure_app {
    public static Figure newfig(){
      Random random = new Random();
      switch (random.nextInt(3)) {
        case 0:
          return (new Triangle(new Point(), new Point(), new Point()));
        case 1:
          return  (new Rectangle(new Point(), new Point()));
        default:
          return (new Circle(new Point(), random.nextInt(8)));
      }
    }
    public static void main(String[] args) {
      ArrayList <Figure> figures = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
       figures.add(newfig());
      }
      for (Figure f: figures)
        System.out.println(f.area());
    }
}
