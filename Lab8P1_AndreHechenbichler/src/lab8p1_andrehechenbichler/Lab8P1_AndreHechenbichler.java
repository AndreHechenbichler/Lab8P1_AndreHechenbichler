/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_andrehechenbichler;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author andre
 */
public class Lab8P1_AndreHechenbichler {
static Scanner leer=new Scanner(System.in);
static Random random=new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*********MENU*********");
        System.out.println("1. Para juego de la vida");
        System.out.println("2. Para salir");
        int resp=leer.nextInt();
        while(resp==1){
            Game clase=new Game();
            int tam=10;
            int [][]matrices=new int [tam][tam];
            matrices= clase.llenar_random(tam);
            ArrayList<String> nums=new ArrayList<String>();
            nums=clase.nums(matrices);
            System.out.println(nums);
            int matrices2[][]=new int[matrices.length][matrices[0].length];
            System.out.println("Cuantas rondas quiere jugar");
            int rond=leer.nextInt();
            clase.jugar(rond, matrices2, nums, matrices);
            System.out.println("");
            System.out.println("*********MENU*********");
            System.out.println("1. Para juego de la vida");
            System.out.println("2. Para salir");
            resp=leer.nextInt();
        }
    }
}
