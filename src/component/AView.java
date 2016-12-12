package component;

import java.util.List;
import java.util.Observable;

public abstract class AView implements IView {

	public AView() {
		// TODO Auto-generated constructor stub
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