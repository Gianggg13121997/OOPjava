import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("thong tin hinh chu nhat :");
        rectangle.displayInfo();
        System.out.println("diện tích hình chữ nhật là :" + rectangle.dienTichHCN());
        System.out.println("Chu vi hình chữ nhât là :" + rectangle.chuViHCN());
        System.out.println("==================");
        System.out.println("thay đổi chiều dài HCN : ");
        int newLenght = input.nextInt();
        rectangle.setLength(newLenght);
        System.out.println("thay doi chieu rong HCN : ");
        int newWidth = input.nextInt();
        rectangle.setWidth(newWidth);
        System.out.println("thong tin sau khi thay doi :");
        rectangle.displayInfo();
        int newArea = rectangle.dienTichHCN();
        System.out.println("dien tich HCN sau khi thay doi la : " +newArea);
        int newPerimeter = rectangle.chuViHCN();
        System.out.println("Chu vi sau khi thay doi thong tin la :" + newPerimeter);
    }
}