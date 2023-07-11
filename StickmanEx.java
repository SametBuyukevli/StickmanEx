package stickmanEx;

import javax.swing.*;
import java.awt.*;

public class StickmanEx extends JFrame {
    public StickmanEx() {
        initUI();
    }

    private void initUI() {
        add(new Surface());
        setTitle("Stickman");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
