import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovementListener implements KeyListener {
    private MainScene scene;

    public MovementListener(MainScene mainScene) {
        this.scene = mainScene;

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

            if (!this.scene.getBall().isStuck()) {
                this.scene.moveBallRight();
                this.scene.repaint();
                for (Bomb bomb : this.scene.getBombs()) {
                    for (GameRectangle rectangle : this.scene.getRectangles()) {
                        if (Utils.checkCollision(this.scene.getBall(), bomb, rectangle)) {
                            this.scene.getBall().setStuck(true);
                            System.out.println("BOOM!");
                        }
                    }
                }
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {

            if (!this.scene.getBall().isStuck()) {
                this.scene.moveBallLeft();
                this.scene.repaint();
                for (Bomb bomb : this.scene.getBombs()) {
                    for (GameRectangle rectangle:this.scene.getRectangles())
                    if (Utils.checkCollision(this.scene.getBall(), bomb,rectangle)) {
                        this.scene.getBall().setStuck(true);
                        System.out.println("BOOM!");
                    }
                }
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (!this.scene.getBall().isStuck()) {
                this.scene.moveBallUp();
                this.scene.repaint();
                for (Bomb bomb : this.scene.getBombs()) {
                    for (GameRectangle rectangle:this.scene.getRectangles())
                    if (Utils.checkCollision(this.scene.getBall(), bomb,rectangle)) {
                        this.scene.getBall().setStuck(true);

                        System.out.println("BOOM!");
                    }
                }
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (!this.scene.getBall().isStuck()) {
                this.scene.moveBallDown();
                this.scene.repaint();
                for (Bomb bomb : this.scene.getBombs()) {
                    for (GameRectangle rectangle:this.scene.getRectangles())
                    if (Utils.checkCollision(this.scene.getBall(), bomb,rectangle)) {
                        this.scene.getBall().setStuck(true);
                        System.out.println("BOOM!");
                    }
                }

            }
        }
        if (this.scene.getBall().getX()==960){
            this.scene.getBall().isStuck();
            this.scene.getBall().setStuck(true);
            this.scene.repaint();
            System.out.println("GOOD JOB!");

        }
    }

    public void keyReleased(KeyEvent e) {

    }
}



