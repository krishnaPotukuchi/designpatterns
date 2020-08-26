package command;

public class TestCommand {


	public static void main(String[] args) {

		ToolBar toolBar = new ToolBar();
		
		ActionListenerCommand undo = new ActionUndo(toolBar);
		ActionListenerCommand redo = new ActionRedo(toolBar);
		
		MenuOptions menu = new MenuOptions(redo, undo);
		
		menu.clickRedo();
		menu.clickUndo();
		
	}

}
