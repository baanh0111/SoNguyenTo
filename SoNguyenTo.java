import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();


        if (a < 2 ){
            System.out.println("Khong phai so nguyen to.");
            return;
        }else {
            boolean isPrime = true;
            for ( int i = 2 ; i <= Math.sqrt(a); i++){
                if (a % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(a + " la so nguyen to.");
            } else {
                System.out.println(a + " khong phai so nguyen to.");
            }

        }
    }
}
