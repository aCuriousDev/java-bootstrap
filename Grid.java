import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    private JButton[][] buttons;
    private JButton startButton;
    private JButton stopButton;

    public Grid() {
        setTitle("Bootstrap Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(3, 3));
            buttons = new JButton[3][3];
            

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                buttons[i][j].setFocusPainted(false);
                gridPanel.add(buttons[i][j]);
                
            }
        }
        add(gridPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        
        startButton = new JButton("Start");
        buttonPanel.add(startButton);

        
        stopButton = new JButton("Stop");
        buttonPanel.add(stopButton);

        add(buttonPanel, BorderLayout.SOUTH);
        

        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { // to run the grid
            Grid grid = new Grid(); // create a new instance of my grid
            grid.setVisible(true); // to display the grid on my screen
        });
    }
}
