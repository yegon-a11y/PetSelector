package petradiobuttonapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetRadioButtonApp extends JFrame implements ActionListener {

    private JRadioButton birdBtn, catBtn, dogBtn, rabbitBtn, pigBtn;
    private JLabel imageLabel;
    private ButtonGroup group;

    public PetRadioButtonApp() {
        setTitle("Pet Selector");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5, 1));

        birdBtn = new JRadioButton("Bird");
        catBtn = new JRadioButton("Cat");
        dogBtn = new JRadioButton("Dog");
        rabbitBtn = new JRadioButton("Rabbit");
        pigBtn = new JRadioButton("Pig");

        group = new ButtonGroup();
        group.add(birdBtn);
        group.add(catBtn);
        group.add(dogBtn);
        group.add(rabbitBtn);
        group.add(pigBtn);

        leftPanel.add(birdBtn);
        leftPanel.add(catBtn);
        leftPanel.add(dogBtn);
        leftPanel.add(rabbitBtn);
        leftPanel.add(pigBtn);

        add(leftPanel, BorderLayout.WEST);

       
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        birdBtn.addActionListener(this);
        catBtn.addActionListener(this);
        dogBtn.addActionListener(this);
        rabbitBtn.addActionListener(this);
        pigBtn.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String pet = "";

        if (birdBtn.isSelected()) {
            pet = "Bird";
            imageLabel.setIcon(new ImageIcon(getClass().getResource("bird.png")));
        } 
        else if (catBtn.isSelected()) {
            pet = "Cat";
            imageLabel.setIcon(new ImageIcon(getClass().getResource("cat.png")));
        } 
        else if (dogBtn.isSelected()) {
            pet = "Dog";
            imageLabel.setIcon(new ImageIcon(getClass().getResource("dog.png")));
        } 
        else if (rabbitBtn.isSelected()) {
            pet = "Rabbit";
            imageLabel.setIcon(new ImageIcon(getClass().getResource("rabbit.png")));
        } 
        else if (pigBtn.isSelected()) {
            pet = "Pig";
            imageLabel.setIcon(new ImageIcon(getClass().getResource("pig.png")));
        }

        JOptionPane.showMessageDialog(this, 
                "You selected: " + pet);
    }

    public static void main(String[] args) {
        new PetRadioButtonApp();
    }
}