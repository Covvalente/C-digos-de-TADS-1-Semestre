import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mateu
 */
public class exercicio4 {
   public static void main(String[] args) {
       
       Scanner Leitor= new Scanner(System.in);
       System.out.println("Insira o kw consumido");
       float kw =Leitor.nextFloat();
       if(kw<150){
           double cons = (kw*0.20+11.90);
           System.out.println("O valor de sua conta é de "+ cons);
       }else if ((kw >=150)&&(kw<500)){
           double cons= (kw*0.25 +11.90);
           System.out.println("O valor de sua conta é de "+cons);
       }else{ 
           double cons = (kw *0.30+11.90);
           System.out.println("O valor de sua conta é de "+cons);
       }
   }
}
   