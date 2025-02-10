package Java;

import java.util.Scanner;
public class Ativ_14 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira um número: ");
            int x= sc.nextInt();
            String result=(x>10&&x<50)?("Dentro do intervalo"):("fora do intervalo");
            System.out.println(result);
        }
    }