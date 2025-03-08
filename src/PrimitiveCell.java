import javax.swing.*;
import java.awt.*;

public class PrimitiveCell extends JPanel {
    private SudokuElement element;
    private JLabel label = new JLabel();
    public PrimitiveCell(SudokuElement element)
    {
        setLayout(new BorderLayout());
        this.element = element;
        if(element.isThisConstant())
        {
            label.setText(element.getElementContent());
            label.setForeground(Color.RED);
        }
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        add(label);
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
    }
}
