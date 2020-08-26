package command;

public class MenuOptions {
	
	ActionRedo redo;
	ActionUndo undo;
	
	public MenuOptions(ActionListenerCommand redo, ActionListenerCommand undo){
		this.redo = (ActionRedo) redo;
		this.undo = (ActionUndo) undo;
	}
	
	public void clickUndo(){
		undo.execute();
	}
	
	public void clickRedo(){
		redo.execute();
	}
}
