package main.com.Behavior_Pattern.Command;

public class OpenDoc implements ICommand{
    private Document doc;

    public OpenDoc(Document doc) {  
        this.doc = doc;  
    }

    @Override
    public void execute() {
        doc.open();
    }
}
