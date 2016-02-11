package hackit.upc.edu.domini;


/**
 * Created by aleix on 11/02/2016.
 */
public class Point {
    public Integer x;
    public Integer y;
    private static Point limits;

    public static Integer distance(Point a, Point b){
        int distance;
        double d = Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y - b.y)*(a.y - b.y));
        if((d - (int) d) == 0 ) distance = (int) d;
        else distance = (int) d + 1;
        return distance;
    }

    public static Point getLimits() {
        return limits;
    }

    public static void setLimits(Point limits) {
        Point.limits = limits;
    }

    public Point(){
        x = -1;
        y = -1;
    }

    public Point(Integer x, Integer y) throws Exception{
        if(x < limits.x && x >= 0) this.x = x;
        else throw new Exception("Limits");
        if(y < limits.y && y >= 0) this.y = y;
        else throw new Exception("Limits");
    }
}
