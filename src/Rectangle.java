public class Rectangle {
    public int length;
    public int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("chieu dai la  :" + length);
        System.out.println("chieu rong la : " + width);
    }
    public  int dienTichHCN(){
        return length * width;
    }
    public int chuViHCN(){
        return (length+width)*2;
    }
    public void setLength(int length) {
        if(length > 0){
            this.length = length;
        }else {
            System.out.println("Nhap so hop le");
        }
    }
    public void setWidth(int width) {
        if(width > 0){
            this.width = width;
        }else {
            System.out.println("Nhap so hop le");
        }

    }
}
