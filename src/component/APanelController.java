package component;

public abstract class APanelController extends AController {

	public APanelController(AView view, AModel model) {
		super(view, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initComponents() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public APanelView getView() {
		// TODO Auto-generated method stub
		return (APanelView) super.getView();
	}

}
