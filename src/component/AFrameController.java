package component;

import java.util.List;
import java.util.Map;
import java.util.HashMap;


public abstract class AFrameController extends AController {
	
	public AFrameController(AFrameView view, AModel model) {
		super(view, model);
	}

	@Override
	public void initComponents() {
		// TODO Auto-generated method stub

	}
	
	
	
	@Override
	public AFrameView getView() {
		// TODO Auto-generated method stub
		return (AFrameView)super.getView();
	}
	
}
