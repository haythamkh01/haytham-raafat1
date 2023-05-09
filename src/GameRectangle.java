import java.awt.*;

public class GameRectangle extends GameComponent{

    private int x;
    private int y;
    private int width;
    private int height;

public GameRectangle(int x, int y, int width, int height){
    this.x =x;
    this.y=y;
    this.width= width;
    this.height= height;
}
    public void paint(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect( this.x,this.y,this.width, this.height);
    }
    public Rectangle getRect() {
        Rectangle rectangle = new Rectangle(this.x, this.y, this.width, this.height);
        return rectangle;

    }


}
