package CurrentSession;

import java.util.Observable;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

import component.APanelView;

public class View extends APanelView {
	private JTextPane textPane;
	private JTable table;
	
	public View() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initComponents() {
		// TODO Auto-generated method stub
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		textPane = new JTextPane();
		textPane.setBounds(74, 38, 285, 166);
		panel.add(textPane);
		String[][] rowData = {};
		String[] columnNames = {
				"ID", "name", "lastName"
		};
		
		table = new JTable(rowData, columnNames);
		JScrollPane x = new JScrollPane(table);
		x.setBounds(74, 38, 200, 200);
		panel.add(x);
	}
}