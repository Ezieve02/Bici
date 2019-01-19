package components;

import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

public class Button extends JButton {
    private JLayeredPane layeredPane;
    private JLabel buttonBackground;
    private JLabel buttonText;
    private Dimension buttonSize;
    private Font font;
    private Utils instance;

    public Button() {
        initUI();
    }

    private void initUI() {
        layeredPane = new JLayeredPane();
        buttonBackground = new JLabel(new ImageIcon("img/components/buttonBackground.png"));
        buttonText = new JLabel("START");
        buttonSize = new Dimension(343, 90);
        instance = Utils.getInstance();
        font = instance.creaFont();

        setOpaque(false);
        setContentAreaFilled(false);
        setFocusable(false);
        setBorder(BorderFactory.createEmptyBorder());

        buttonBackground.setSize(buttonSize);
        buttonText.setSize(buttonSize);
        buttonText.setFont(font);
        buttonText.setForeground(Color.white);
        buttonText.setHorizontalAlignment(SwingConstants.CENTER);

        layeredPane.add(buttonBackground, new Integer(0));
        layeredPane.add(buttonText, new Integer(1));

        add(layeredPane);
    }
}
