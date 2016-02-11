package hackit.upc.edu.domini;


/**
 * Created by aleix on 11/02/2016.
 */
public class Point {
    public Integer x;
    public Integer y;

    public static Integer distance(Point a, Point b){
        int distance;
        double d = Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y - b.y)*(a.y - b.y));
        if((d - (int) d) == 0 ) distance = (int) d;
        else distance = (int) d + 1;
        return distance;
    }

    public Point(){
        x = -1;
        y = -1;
    }
}
