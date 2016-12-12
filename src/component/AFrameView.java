package component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

public abstract class AFrameView extends AView{

	
	protected JFrame frame;
	protected Map<String,APanelView> panelViews;
	
	public AFrameView() {
		super();
		frame = new JFrame();
		panelViews = new HashMap<String,APanelView>();
		// TODO Auto-generated constructor stub
	}
	
	protected void addPanelComponent(APanelView panelView, String ID)
	{
		panelViews.put(ID, panelView);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void render() {
		
		panelViews.forEach((key,value) ->{
			value.render();
		});
		
		// TODO Auto-generated method stub
		super.render();
		frame.setVisible(true);
	}
}