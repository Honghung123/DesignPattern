package main.com.Behavior_Pattern.Mediator;

public class Main {
    public static void main(String args[]) {
        IChatRoom chat = new ChatRoomImp();

        Member1 u1 = new Member1(chat);
        u1.setname("Ashwani Rajput");
        u1.sendMessage("Hi Ashwani! how are send Message?");
        try{
             Thread.sleep(2000);
         } catch (Exception e) {
             throw new RuntimeException(e);
        }
        Member2 u2 = new Member2(chat);
        u2.setname("Soono Jaiswal");
        u2.sendMessage("I am Fine ! Yeosaue tell?");
    }
}
