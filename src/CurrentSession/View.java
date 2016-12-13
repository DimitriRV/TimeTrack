package CurrentSession;

import java.awt.*;
import java.util.Observable;

import javax.swing.border.EmptyBorder;
import javax.swing.*;

import component.APanelView;

public class View extends APanelView {
//	private JTextPane textPane;
//	private JTable table;
	
	private JPanel leftPanel, centerPanel;
	private JLabel projectLabel,taskLabel,infoLabel;
	private JButton startButton,stopButton,switchButton,pauseButton;
	private JTextField projectField,taskField,infoField;
	
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
//		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new BorderLayout(5, 5));
		
		leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(4,1));
		
		startButton = new JButton("start");
		stopButton = new JButton("stop");
		switchButton = new JButton("switch");
		pauseButton = new JButton("pause");
		
		leftPanel.add(startButton);
		leftPanel.add(stopButton);
		leftPanel.add(switchButton);
		leftPanel.add(pauseButton);
		
		panel.add(leftPanel,BorderLayout.LINE_START);
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(0, 1,6,3));
		
		projectLabel = new JLabel("Project");
		projectField = new JTextField();
		
		taskLabel = new JLabel("Task");
		taskField = new JTextField();
		
		infoLabel = new JLabel("Info");
		infoField = new JTextField();
		
		
		
		
		centerPanel.add(projectLabel);
		centerPanel.add(projectField);
		
		centerPanel.add(taskLabel);
		centerPanel.add(taskField);
		
		centerPanel.add(infoLabel);
		centerPanel.add(infoField);
		
		panel.add(centerPanel, BorderLayout.CENTER);
		
		
//		textPane = new JTextPane();
//		textPane.setBounds(74, 38, 285, 166);
//		panel.add(textPane);
//		String[][] rowData = {};
//		String[] columnNames = {
//				"ID", "name", "lastName"
//		};
		
//		table = new JTable(rowData, columnNames);
//		JScrollPane x = new JScrollPane(table);
//		x.setBounds(74, 38, 200, 200);
//		panel.add(x);
	}
}