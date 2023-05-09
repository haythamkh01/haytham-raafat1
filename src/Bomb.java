import java.awt.*;

public class Bomb extends GameComponent {


    private int x;
    private int y;
    private int width;
    private int height;


    public Bomb (int x,int y,int width,int height){
        this.x =x;
        this.y=y;
        this.width= width;
        this.height= height;
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.fillOval( this.x,this.y,this.width, this.height);
    }
    public Rectangle getRect() {
        Rectangle rectangle = new Rectangle(this.x, this.y, this.width, this.height);
        return rectangle;

    }



    }








