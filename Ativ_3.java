package Java;

import java.util.Scanner;
public class Ativ_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira um número: ");
            int x= sc.nextInt();
            String result=(x>0)?x+(" é positivo"):(x==0)?x+(" é zero"):x+(" é negativo");
            System.out.println(result);
        }
    }