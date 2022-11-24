package main.com.Creational_Pattern.Prototype_Pattern;

public class Main {
    public static void main(String[] args) {
        Prototype prototype = new EmployeeRecords(1, "Hong Hung", "Hung thich Hoang tu cai nhin dau tien", 10_000.0,
                "Binh Thuan");

        EmployeeRecords clone = (EmployeeRecords) prototype.getClone();
        System.out.println("Clone:");
        clone.showRecord();
        clone.setName("Huy Hoang");
        System.out.println("Clone:");
        clone.showRecord();

        // Hai doi tuong cung tro toi mot doi tuong, neu doi tuong nay thay doi thi doi tuong con lai cung thay doi
        EmployeeRecords clone1 = clone;

        clone1.setName("Love Hoang"); // Thay doi thuoc tinh name thong qua doi tuong clone1
        System.out.println("Clone1:");
        // Xuat thong tin cua clone1 sau khi thay doi thuoc tinh name
        clone1.showRecord(); 
        System.out.println("Clone:");
        // Thuoc tinh name cua doi tuong nay thay doi tuong tu nhu clone1 vi ca hai cung tro toi cung 1 bo nho
        clone.showRecord();
        System.out.println("clone1 is equivalent to clone: "+ clone.equals(clone1));
        System.out.println();

        // Tao doi tuong ban sao moi, neu doi tuong nay thay doi thi khong anh huong cac doi 
        // tuong ban sao khac, va nguoc lai
        EmployeeRecords clone2 = (EmployeeRecords) clone.getClone();

        System.out.println("clone2 is equivalent to clone: "+ clone.equals(clone2));
        System.out.println("Clone2:");
        clone2.showRecord(); 
        clone2.setName("Hoang de thuong");
        clone2.setSalary(2_000_000.0);
        System.out.println("Clone2:"); 
        clone2.showRecord(); // Clone2 thay doi thuoc tinh name
        System.out.println("Clone:");
        clone.showRecord(); // Clone van giu nguyen thuoc tinh name  
    }
}
