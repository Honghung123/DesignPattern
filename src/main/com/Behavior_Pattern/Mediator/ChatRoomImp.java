package main.com.Behavior_Pattern.Mediator;
 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoomImp implements IChatRoom {
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm:ss a");
    
    @Override
    public void showMessage(String message, Participant p) { 
        // get current date time
        Date date = new Date();
        System.out.println("Message from " + p.getName() +": "+ message);
        System.out.println("\t\t\t\t" + "[" + dateFormat.format(date).toString() + "]");
    }
}
