package main.com.Structural_Pattern.Brigde;

public class Main {
    public static void main(String[] args) {
        QuestionFormat questions = new QuestionFormat("Java Programming Language"); 
        questions.delete("What is class? ");
        questions.display();
        questions.newOne("What is inheritance? "); 
        questions.newOne("How many types of inheritance are there in java? ");
        questions.displayAll();

        Color red_color = new Red();
        Color blue_color = new Blue();
        Sharp circle_red = new Circle(red_color);
        Sharp circle_blue = new Circle(blue_color);
        Sharp rectangle_red = new Rectangle(red_color);
        Sharp rectangle_blue = new Rectangle(blue_color);
        circle_blue.getSharp();
        circle_red.getSharp();
        rectangle_red.getSharp();
        rectangle_blue.getSharp();

    }
}
      