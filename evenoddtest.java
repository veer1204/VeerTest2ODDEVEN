/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author veerc
 */
import java.util.Scanner;
public class evenoddtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter the number");
        int a = input1.nextInt();
        if(a%2==0) {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
            
        }
    }
    
}
