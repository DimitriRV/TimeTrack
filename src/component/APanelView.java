package component;

import javax.swing.JPanel;

public abstract class APanelView extends AView{
	
	protected JPanel panel;
	
	public APanelView() {
		// TODO Auto-generated constructor stub
		super();
		panel = new JPanel();
	}
	
//	public APanelView() {
//		// TODO Auto-generated constructor stub
//		panel = new JPanel();
//	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
}
