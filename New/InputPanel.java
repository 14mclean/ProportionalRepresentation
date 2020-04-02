import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.CompactNumberFormat;
import java.text.NumberFormat;

public class InputPanel extends JPanel implements ActionListener
{
    private JLabel[] labels = new JLabel[2];
    private JFormattedTextField[] entryFields = new JFormattedTextField[2];
    private JPanel[] panels = new JPanel[2];
    private JButton nextButton;

    InputPanel()
    {
        panels[0] = new JPanel(layout);
        panels[1] = new JPanel(layout);
        nextButton = new JButton("Next");

        labels[0] = new JLabel("Number of People:");
        labels[1] = new JLabel("Number of Rooms:");

        entryFields[0] = new JFormattedTextField(NumberFormat.getNumberInstance());
        entryFields[1] = new JFormattedTextField(NumberFormat.getNumberInstance());
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().hashCode() == nextButton.hashCode())
        {
            // Get and return inputs
            // Move to personInput
        }
    }
}