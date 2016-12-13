package TimeTrack;

import java.awt.EventQueue;

import component.AController;
import component.AFrameController;
import component.AModel;
import component.AView;

public class Controller extends AFrameController{
	
	public Controller() {
		super(_getView() , _getModel());
		// TODO Auto-generated constructor stub
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller app = new Controller();
					app.render();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@Override
	public void initComponents() {
		// TODO Auto-generated method stub
		addPanelComponent(new CurrentSession.Controller(), "currentSession");
	}
	
	public View getView() {
		return (View) super.getView();
	}
	
	public Model getModel() {
		return (Model) super.getModel();
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