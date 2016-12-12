package component;

import java.util.ArrayList;
import java.util.List;


public abstract class AController implements IController
{
	protected AView view; 
	protected AModel model;
	
	public AController(AView view, AModel model) 
	{
		this.view = view;
		this.model = model;
		initialize();
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
