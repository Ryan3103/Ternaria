package Java;

import java.util.Scanner;
public class Ativ_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        String result=(num%2==0)?num+" é par":num+" é impar";
        System.out.println(result);
    }
}