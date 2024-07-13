import java.sql.SQLOutput;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        int[] scores1 ={6,7,8,9,10};
        int[] scores2 ={5,6,7,8,9};
    Student student1 = new Student("Giang",20,scores1);
    Student student2 = new Student("Linh",20,scores2);

        System.out.println(" thong tin hoc sinh :");
        System.out.println(student1.getInfor());
        System.out.println("==============================");
        System.out.println(student2.getInfor());
        System.out.println("==============================");
        System.out.println(" Thay doi thong tin hs 1 :");
        System.out.println(" THay doi ten :");
        Scanner nameinput = new Scanner(System.in);
        String newname = nameinput.nextLine();
        student1.setName(newname);
        System.out.println("Thay doi tuoi :");
        Scanner ageinput = new Scanner(System.in);
        int age = ageinput.nextInt();
        student1.setAge(age);
        System.out.println(" thong tin hoc sinh sau khi thay doi :");
        System.out.println(student1.getInfor());
        System.out.println("=====================================");
        System.out.println("diem trung binh cua hoc sinh 1 :");
        System.out.println(student1.average());
        System.out.println("diem trung binh cua hoc sinh 2 :");
        System.out.println(student2.average());
    }

}
