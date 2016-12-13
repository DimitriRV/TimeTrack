package component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

public abstract class AView implements IView {
	
	protected Map<String,APanelView> panelViews;
	
	public AView() {
		panelViews = new HashMap<String,APanelView>();
	}
	
	protected void addPanelComponent(APanelView panelView, String ID)
	{
		panelViews.put(ID, panelView);
	}
	
	public abstract void initComponents();

	@Override
	public void render() {
		initComponents();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}
}