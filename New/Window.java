import javax.swing.*;

public class Window extends JFrame
{
    private JPanel currentPanel;

    Window(int width, int height)
    {
        setSize(width, height);
    }

    /**
     * @param panelIndex 1=InputPanel, 2=PersonInputPanel, 3=ResultsPanel
     */
    void setCurrentPanel(int panelIndex)
    {}
}