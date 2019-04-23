package graphics;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GuiForm extends JFrame {
    private JPanel panel1;
    private JButton DELETEButton;
    private JButton ADDButton;
    private JList list1;
    private JPanel panelButtons;
    private JTextField textField1;
    private JPanel panelList;

    private DefaultListModel<String> defaultListModel = new DefaultListModel<>();

    public GuiForm() {

        this.setSize(600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        populateList();
        this.add(panel1);
        ADDButton.addActionListener(e -> addToList());
        DELETEButton.addActionListener(e -> deleteElementFromList());

        this.setVisible(true);
    }

    public void populateList() {
        List<String> strings = new ArrayList<>();
        strings.add("Element 1");
        strings.add("Element 2");
        strings.add("Element 3");

        strings.forEach(s -> defaultListModel.addElement(s));

        list1.setModel(defaultListModel);
    }

    public void addToList() {
        defaultListModel.addElement(textField1.getText());
    }

    public void deleteElementFromList() {
        int selectedIndex = list1.getSelectedIndex();

        if (selectedIndex != -1) {
            defaultListModel.remove(selectedIndex);
        }
    }
}
