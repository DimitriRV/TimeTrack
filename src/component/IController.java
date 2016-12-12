package component;

import java.util.List;

public interface IController {
	public void initialize();
	public AView getView();
	public void setView(AView view);
	public AModel getModel();
	public void setModel(AModel model);
	public void initComponents();
	public void render();
}
