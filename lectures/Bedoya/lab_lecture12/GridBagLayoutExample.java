package lab_lecture12;

import javax.swing.*;
import java.awt.*;


// This was supplied by ChatGPT 
// As a demonstration to manually position components in a GridLayout
public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setSize(400, 250);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        // Add padding between components
        gbc.insets = new Insets(5, 5, 5, 5);

        // -------------------------
        // Row 0: Name Label
        // -------------------------
        gbc.gridx = 0; // column
        gbc.gridy = 0; // row
        gbc.anchor = GridBagConstraints.EAST;
        frame.add(new JLabel("Name:"), gbc);

        // Name TextField
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0; // allow horizontal expansion
        frame.add(new JTextField(15), gbc);

        // -------------------------
        // Row 1: Email Label
        // -------------------------
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        frame.add(new JLabel("Email:"), gbc);

        // Email TextField
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        frame.add(new JTextField(15), gbc);

        // -------------------------
        // Row 2: Button (spans 2 columns)
        // -------------------------
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // span across 2 columns
        gbc.fill = GridBagConstraints.CENTER;
        gbc.weightx = 0;
        frame.add(new JButton("Submit"), gbc);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
