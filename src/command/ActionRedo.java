package command;

public class ActionRedo implements ActionListenerCommand {

	ToolBar toolBar;
	
	public ActionRedo(ToolBar toolBar){
		this.toolBar = toolBar;
	}
	
	@Override
	public void execute() {
		toolBar.redo();
	}

}
