package main.com.Behavior_Pattern.Command;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();

        ICommand clickOpen = new OpenDoc(doc);
        ICommand clickSave = new SaveDoc(doc);

        Invoker menu = new Invoker(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
    }
}
