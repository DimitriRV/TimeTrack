package component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

public abstract class AFrameView extends AView{

	
	protected JFrame frame;
	
	public AFrameView() {
		super();
		frame = new JFrame();
		
		// TODO Auto-generated constructor stub
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