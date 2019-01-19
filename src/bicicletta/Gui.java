package bicicletta;

import components.Button;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {

    private Dimension frameSize;
    private JLabel background;
    private Button startButton;
    private JLayeredPane layeredPane;


    public Gui(){
        initUI();
        addListeners();
    }

    private void addListeners() {
        startButton.addActionListener(this);
    }

    private void initUI() {
        setLayout(new BorderLayout(0, 0));

        layeredPane = new JLayeredPane();
        frameSize = new Dimension(1294, 758);
        background = new JLabel();
        startButton = new Button();

        background.setIcon(new ImageIcon("img/background.png"));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bicycle");
        setSize(frameSize);
        setLocationRelativeTo(null);

        layeredPane.setLayer(background, 0);
        layeredPane.add(background);
        layeredPane.setLayer(startButton, 1);
        layeredPane.add(startButton);
        // Per visualizzare gli elementi nel JLayeredPane, bisogna impostarne le dimensioni
        background.setSize(new Dimension(frameSize));
        background.setLocation(0, -20);
        startButton.setSize(new Dimension(343, 90));
        startButton.setLocation(468, 290);

        add(layeredPane, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Bottone premuto ");
    }
}
