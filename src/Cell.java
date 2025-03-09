import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    private int number;
    private JLabel label = new JLabel();
    public Cell(int number)
    {
        setLayout(new BorderLayout());
        this.number = number;
        if(number != 0)
        {
            label.setText(number + "");
            label.setForeground(Color.RED);
        }
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        add(label);
        setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

    }
    public String getCellText()
    {
        return label.getText();
    }
    public void setCellText(String txt)
    {
        label.setText(txt);
    }

}
