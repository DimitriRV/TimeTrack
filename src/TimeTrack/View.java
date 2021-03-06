package TimeTrack;

import java.sql.Statement;
import java.util.Observable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import component.AFrameView;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class View extends AFrameView {

	private static final long serialVersionUID = 1L;	
	private JPanel currentSessionPane;

	/**
	 * Create the frame.
	 */
	public View() {
		super();
	}
	
	public void render() 
	{
		
		// TODO Auto-generated method stub
		
//		this.initComponents();
		
//		try {
//			Class.forName("org.hsqldb.jdbcDriver");
//		} catch (ClassNotFoundException  e) {
//			System.err.println( "Treiberklasse nicht gefunden!" ); 
//			return; 
//		}
//		
//		Connection con = null;
//		
//		try {
//			con = DriverManager.getConnection("jdbc:hsqldb:file:database/db; shutdown=true", "root", "root");
//			Statement stmt = con.createStatement();
//			
//			String sql = "SELECT * FROM Customer";
//			ResultSet rs = stmt.executeQuery(sql);
//			
//			while (rs.next()) {
//				String id = rs.getString(1);
//				String firstName = rs.getString(2);
//				String lastName = rs.getString(3);
////				textPane.setText(textPane.getText()+"\n"+id+", "+firstName+", "+lastName);
//			}
//			
//			rs.close();
//			stmt.close();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		finally {
//			if(con != null)
//			{
//				try {
//					con.close();
//				} catch (SQLException e2) {
//					// TODO: handle exception
//					e2.printStackTrace();
//				}
//			}
//		}
		
		super.render();
		
	}

	@Override
	public void initComponents() 
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		currentSessionPane = panelViews.get("currentSession").getPanel();
		currentSessionPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(currentSessionPane);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}