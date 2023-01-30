import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

public class MainFrame extends JFrame {
    private CovidData covidData = new CovidData();
    private CovidTableModel model = new CovidTableModel();
    private JTable tab = new JTable(model);

    public MainFrame(){
        super("COVID");

        add(new JScrollPane(tab), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        add(panel, BorderLayout.NORTH);

        JButton btNacist = new JButton("Nacti");
        panel.add(btNacist);
        JButton btGraf = new JButton("Nacti");
        panel.add(btGraf);

        pack();
        setVisible(true);
        //pres celou obrazovku(uz musi byt viditelne):
//        setExtendedState(MAXIMIZED_BOTH);
    }

    private class CovidTableModel extends AbstractTableModel {
        final String[] NAMES = {"Datum", "Pocet testu PCR", "Pocet pozitivnich"};

        @Override
        public int getRowCount() {
            return covidData.getData().size();
        }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            DayEntry e = covidData.getData().get(rowIndex);
            switch (columnIndex){
                case 0 : return e.getDate();
                case 1 : return e.getPcrTotal();
                case 2 : return e.getPositive();
            }
            return null;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return NAMES[columnIndex];
        }
    }
}
