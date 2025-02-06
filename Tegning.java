import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class Tegning {
    public static void draw(Graphics g) {
        final int WIDTH = 20;
        int height = 20;
        g.setColor(Color.BLACK);
        int x = 0;
        int y = 0;
            for (int j = 0; j < 10; j++) {
                g.fillRect(x, y, WIDTH, WIDTH);
                x = x+2*WIDTH;
            }

            x = WIDTH;
            y = WIDTH;
            for (int j = 0; j < 10; j++) {
                g.fillRect(x, y, WIDTH, WIDTH);
                x=x+2*WIDTH;
            };
        x = 0;
        y = 2*height;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                g.fillRect(x, y, WIDTH, WIDTH);
                x = x+2*WIDTH;
            }

            x = WIDTH;
            y += height;
            for (int j = 0; j < 10; j++) {
                g.fillRect(x, y, WIDTH, WIDTH);
                x=x+2*WIDTH;
            }
            x=0;
            y+=height;
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 400;
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph){
                draw(graph);
            }

        };
        frame.add(component);
        frame.setVisible(true);
    }
}
