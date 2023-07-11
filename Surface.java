package stickmanEx;

import javax.swing.*;
import java.awt.*;

public class Surface extends JPanel {
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        Steps s = new Steps();


        s.stepThree(super.getGraphics());
        s.stepFour(super.getGraphics());
        s.stepOne(super.getGraphics());
        s.stepTwo(super.getGraphics());
        repaint();

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}
