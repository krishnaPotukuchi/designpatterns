package command;

public class ActionUndo implements ActionListenerCommand {

	ToolBar toolBar;
	
	public ActionUndo(ToolBar toolBar){
		this.toolBar = toolBar;
	}

	@Override
	public void execute() {
		toolBar.undo();
	}
	
	
	
}
