package practice;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaSwingExample {
    public static void main(String[] args) {
        JFrame mainFrame = createFrame(400, 500, true);

        JButton clickBtn = createButton(mainFrame, "click");
        clickBtn.addActionListener(actionEvent -> {
            JFrame frame = createFrame(200, 150, true);
            frame.setTitle("Hello!");
        });
    }

    private static void enableClosingConfirmation(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    frame.dispose();
                }
            }
        });
    }

    private static JButton createButton(JFrame mainFrame, String label) {
        JButton button1 = new JButton(label);
        button1.setBounds(130, 100, 50, 40);
        mainFrame.add(button1);
        return button1;
    }

    private static JFrame createFrame(int width,
                                      int height,
                                      boolean closingConfirmation) {
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(width, height);
        mainFrame.setVisible(true);
        if (closingConfirmation) {
            enableClosingConfirmation(mainFrame);
        }
        return mainFrame;
    }
}
