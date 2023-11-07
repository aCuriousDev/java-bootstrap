import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent; 
// import java.awt.event.KeyListener;

public class Input extends KeyAdapter {
    private Engine engine;

    public Input(Engine engine) {
        this.engine = engine;
    }

    public void doTurn() {
        // MAJ du jeu
        // change players....
    }



    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                engine.movePlayer('L');
                break;  //handle left arrow key
            case KeyEvent.VK_RIGHT:
                engine.movePlayer('R');
                break;//handle right arrow
            case KeyEvent.VK_UP:
                engine.movePlayer('U');
                break; //handle up arrow
            case KeyEvent.VK_DOWN:
                engine.movePlayer('D');
                break;  //handle down arrow

        }
        engine.doTurn(); //for updating, switching turns, checking wins and losses
    }

}