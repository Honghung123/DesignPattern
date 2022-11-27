package main.com.Behavior_Pattern.Command;

public class Invoker {
    private ICommand openCommand;
    private ICommand saveCommand;
    
    public Invoker(ICommand openCommand, ICommand saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

    public void clickOpen() {
        this.openCommand.execute();
    }

    public void clickSave() {
        this.saveCommand.execute();
    }
}
