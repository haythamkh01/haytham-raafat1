import java.awt.*;

public class Utils {
    public static boolean checkCollision (Ball ball,Bomb bomb,GameRectangle rectangle){
        boolean collision = false;
        Rectangle rectangle1=new Rectangle(ball.getRect());
        Rectangle rectangle2=new Rectangle(bomb.getRect());
        Rectangle rectangle3=new Rectangle(rectangle.getRect());
        if (rectangle1.intersects(rectangle2)){
            collision=true;
        }if (rectangle1.intersects(rectangle3)){
            collision=true;
        }
        return collision;


    }

    }
