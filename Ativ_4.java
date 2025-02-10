package Java;

import java.util.Scanner;
public class Ativ_4 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Informe um numero:");
            int num= sc.nextInt();
            String result=(num%5==0)?"Múltiplo de 5":"Não é múltiplo de 5";
            System.out.println(result);
        }
    }