import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,a,b=0;
        System.out.print("Basamak sayıları toplanacak sayıyı giriniz: ");
        x = sc.nextInt();
        while(x%10!=0){
            a=x%10;
            b+=a;
            x=x/10;
        }
        System.out.print("Basamak sayıları toplamı: "+b);
    }
}