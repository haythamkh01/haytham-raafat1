import javax.swing.JPanel;
import java.awt.*;

public class MainScene extends JPanel {
    private Ball ball;

    private GameRectangle[] rectangles;
    private Bomb []bombs;




    public MainScene(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setBackground(Color.GREEN);
        this.ball = new Ball(10, 400, 20, 20);
        this.rectangles = new GameRectangle[14];
        this.rectangles[0] = new GameRectangle(0, 350, 100, 5);
        this.rectangles[1] = new GameRectangle(100, 200, 5, 150);
        this.rectangles[2] = new GameRectangle(100, 200, 300, 5);
        this.rectangles[3] = new GameRectangle(400, 200, 5, 250);
        this.rectangles[4] = new GameRectangle(400, 450, 200, 5);
        this.rectangles[5] = new GameRectangle(600, 350, 5, 100);
        this.rectangles[6] = new GameRectangle(600, 350, 400, 5);
        this.rectangles[7] = new GameRectangle(0, 450, 200, 5);
        this.rectangles[8] = new GameRectangle(200, 300, 5, 150);
        this.rectangles[9] = new GameRectangle(200, 300, 100, 5);
        this.rectangles[10] = new GameRectangle(300, 300, 5, 250);
        this.rectangles[11] = new GameRectangle(300, 550, 400, 5);
        this.rectangles[12] = new GameRectangle(700, 450, 5, 100);
        this.rectangles[13] = new GameRectangle(700, 450, 300, 5);
        this.setFocusable(true);
        this.requestFocus();
        MovementListener movementListener = new MovementListener(this);
        this.addKeyListener(movementListener);
        this.bombs = new Bomb[11];
        this.bombs[0] = new Bomb(125, 375, 25, 25);
        this.bombs[1] = new Bomb(200, 275, 25, 25);
        this.bombs[2] = new Bomb(300, 225, 25, 25);
        this.bombs[3] = new Bomb(375, 300, 25, 25);
        this.bombs[4] = new Bomb(325, 400, 25, 25);
        this.bombs[5] = new Bomb(375, 475, 25, 25);
        this.bombs[6] = new Bomb(475, 525, 25, 25);
        this.bombs[7] = new Bomb(600, 475, 25, 25);
        this.bombs[8] = new Bomb(675, 450, 25, 25);
        this.bombs[9] = new Bomb(750, 375, 25, 25);
        this.bombs[10] = new Bomb(850, 425, 25, 25);



        }




    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.ball.paint(graphics);
        this.rectangles[0].paint(graphics);
        this.rectangles[1].paint(graphics);
        this.rectangles[2].paint(graphics);
        this.rectangles[3].paint(graphics);
        this.rectangles[4].paint(graphics);
        this.rectangles[5].paint(graphics);
        this.rectangles[6].paint(graphics);
        this.rectangles[7].paint(graphics);
        this.rectangles[8].paint(graphics);
        this.rectangles[9].paint(graphics);
        this.rectangles[10].paint(graphics);
        this.rectangles[11].paint(graphics);
        this.rectangles[12].paint(graphics);
        this.rectangles[13].paint(graphics);
        this.bombs[0].paint(graphics);
        this.bombs[1].paint(graphics);
        this.bombs[2].paint(graphics);
        this.bombs[3].paint(graphics);
        this.bombs[4].paint(graphics);
        this.bombs[5].paint(graphics);
        this.bombs[6].paint(graphics);
        this.bombs[7].paint(graphics);
        this.bombs[8].paint(graphics);
        this.bombs[9].paint(graphics);
        this.bombs[10].paint(graphics);



    }

    public void moveBallRight() {
        this.ball.moveRight();
    }

    public void moveBallLeft() {
        this.ball.moveLeft();
    }

    public void moveBallUp() {
        this.ball.moveUp();
    }

    public void moveBallDown() {
        this.ball.moveDown();


    }

    public Bomb[] getBombs() {
        return bombs;
    }

    public void setBombs(Bomb[] bombs) {
        this.bombs = bombs;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public GameRectangle[] getRectangles() {
        return rectangles;
    }

    public void setRectangles(GameRectangle[] rectangles) {
        this.rectangles = rectangles;
    }
}