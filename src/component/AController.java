package component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class AController implements IController
{
	protected AView view; 
	protected AModel model;
	private Map<String,APanelController> panelControllers;
	
	public AController(AView view, AModel model) 
	{
		this.view = view;
		this.model = model;
		panelControllers = new HashMap<String,APanelController>();
		initialize();
	}
	
	protected void addPanelComponent(APanelController panelController, String ID)
	{
		panelControllers.put(ID, panelController);
		getView().addPanelComponent(panelController.getView(), ID);
	}
	
	public void initialize()
	{
		this.initComponents();
	}
	
	@Override
	public AView getView() 
	{
		return view;
	}
	
	@Override
	public void setView(AView view) {
		// TODO Auto-generated method stub
		this.view = view;
	}
	
	@Override
	public AModel getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public void setModel(AModel model) {
		// TODO Auto-generated method stub
		this.model = model;
	}

	public void render()
	{
		try {
			AView v = getView();
			v.render();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
