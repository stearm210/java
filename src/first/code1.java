package first;
import java.util.Scanner;
import java.util.Random;
public class code1 {
    public static void main(String[]args){
        Random r=new Random();
        int c=r.nextInt(10);//0~9之间的随机数
        int d=r.nextInt(10)+3;
        System.out.println(c);
    }
}
