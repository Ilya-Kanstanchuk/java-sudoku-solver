
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void run(final JFrame frame, final int width, final int height) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setTitle(frame.getClass().getSimpleName());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(width, height);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
            }
        });
    }
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {

        }
        JFrame frame = new JFrame();
        SudokuElement[][] elements = SudokuList.generateSudoku();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 0, 0));
        for (int i = 0; i < 9; i++)
        {
            panel.add(new ComplexCell(elements, i + 1));
        }
        frame.add(panel, BorderLayout.CENTER);
        run(frame, 500, 500);
    }
}