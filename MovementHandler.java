import java.awt.*;
import java.awt.event.*;

public class MovementHandler extends Frame implements KeyListener {
    private int firstX;
    private int secondY;
    private boolean hide;
    // private String dash;
    // private String secondDash;
    // private String thirdDash;


    public MovementHandler() {
        setSize(400, 400);
        setVisible(true); // displaying the window

        addKeyListener(this);
        firstX = 150;
        secondY = 150;
        hide = false; // pour rendre le carré visible

        addWindowListener(new WindowAdapter() { // add an event listener for window
            public void windowClosing(WindowEvent we) { // closing the window
                System.exit(0);
            }
        });

        while (true) {
            repaint(); // 
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());


        if (!hide) {
        g.setColor(Color.green);
        g.fillRect(firstX, secondY, 50, 50); //taille de carré
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        


        if (key == KeyEvent.VK_Z && secondY - 25 > 0) {
            secondY -= 5; 
        } else if (key == KeyEvent.VK_S && secondY < getHeight() - 50) {
            secondY += 5;
        } else if (key == KeyEvent.VK_Q && firstX > 0) {
            firstX -= 5;
        } else if (key == KeyEvent.VK_D && firstX < getWidth() - 50) {
            firstX += 5;
        }
        else if (key == KeyEvent.VK_SPACE) { 
        hide = !hide; // Bascule entre l'état caché et visible
    }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new MovementHandler();
    }

    
    
}