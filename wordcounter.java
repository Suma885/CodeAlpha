import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wordcounter {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a JLabel to display word count
        JLabel label = new JLabel("No. of Words: 0");
        label.setBounds(20, 10, 150, 30);

        // Create a JTextArea for user input
        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 50, 350, 80);

        // Create a JButton to count words
        JButton countButton = new JButton("Count Words");
        countButton.setBounds(20, 140, 150, 30);

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                int wordCount = countWords(text);
                label.setText("No. of Words: " + wordCount);
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(textArea);
        frame.add(countButton);

        frame.setLayout(null); // Use null layout for simplicity
        frame.setVisible(true);
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}