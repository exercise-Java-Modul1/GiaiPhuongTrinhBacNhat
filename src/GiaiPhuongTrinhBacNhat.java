import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Bạn hãy giải phương trình bậc nhất có dạng a*x + b = 0");
        float a, b;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Mời bạn nhập hệ số a :");
            a = sc.nextFloat();
            System.out.print("Mời bạn nhập hệ số b :");
            b = sc.nextFloat();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                float x = -b / a;
                System.out.println("Phương trình có nghiệm duy nhất là: " + x);
            }
        }
    }
}
