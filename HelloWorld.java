import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isOdd = (num%2 ==1|| num<0)? true:false;
        int sum = 0;
        if(isOdd){
            for (int i = 1; i < num; i++) {
                if(i%4 == 0){
                    sum+=i;
                }
                else{
                    continue;
                }
            }
            System.out.println(sum);
        }
        else{
            System.out.println("Hatalı Giriş Yaptınız.");
        }
    sc.close();
    }                   
}