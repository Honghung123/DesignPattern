package main.com.Behavior_Pattern.Command;

public class SaveDoc implements ICommand{
    private Document doc;

   public SaveDoc(Document doc) {  
        this.doc = doc;  
    }

    @Override
    public void execute() {
        doc.save();
    }
}
