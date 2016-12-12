package CurrentSession;

import component.*;

public class Controller extends APanelController {

	public Controller() {
		super(_getView(), _getModel());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initComponents() {
		// TODO Auto-generated method stub

	}
	
	public View getView() {
		// TODO Auto-generated method stub
		return (View) super.getView();
	}
	
	private static View _getView()
	{
		return new View();
	}
	
	private static Model _getModel()
	{
		return new Model();
	}
}
