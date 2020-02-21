package figures;

import java.util.Random;

public class Point {
    int x;
    int y;
    Random random = new Random();
    Point(){
        this.x = random.nextInt(8);
        this.y = random.nextInt(8);
    }
}
