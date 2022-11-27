package main.com.Behavior_Pattern.Mediator;

public class Member1 extends Participant {
    private String name;
    private IChatRoom chat;

    public Member1(IChatRoom chat){  
        this.chat=chat;  
    }

    @Override
    public void sendMessage(String message) {
        chat.showMessage(message, this);

    }

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

   
}
