package component;

import java.util.List;
import java.util.Map;
import java.util.HashMap;


public abstract class AFrameController extends AController {
	
	private Map<String,APanelController> panelControllers;
	
	public AFrameController(AFrameView view, AModel model) {
		super(view, model);
		panelControllers = new HashMap<String,APanelController>();
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initComponents() {
		// TODO Auto-generated method stub

	}
	
	protected void addPanelComponent(APanelController panelController, String ID)
	{
		panelControllers.put(ID, panelController);
		getView().addPanelComponent(panelController.getView(), ID);
	}
	
	@Override
	public AFrameView getView() {
		// TODO Auto-generated method stub
		return (AFrameView)super.getView();
	}
	
}
