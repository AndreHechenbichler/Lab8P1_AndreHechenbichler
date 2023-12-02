/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_andrehechenbichler;

import java.util.ArrayList;
import static lab8p1_andrehechenbichler.Lab8P1_AndreHechenbichler.random;

/**
 *
 * @author andre
 */
public class Game {
    public void jugar(int rond, int[][]matrices2,ArrayList<String> nums, int[][]matrices){
        for(int i=1;i<=rond;i++){
                System.out.println("Ronda: "+i);
                int[][] temp=nextgen(matrices2, matrices);
                nums=nums(temp);
                System.out.println(nums);
            }
    }
    public int [][]nextgen(int [][]matrices2, int[][]matrices){
        int cont=0;
        for(int i=0; i<matrices2.length;i++){
            for(int j=0;j<matrices2[i].length;j++){
                if(j==0||j==9||i==0||i==9){
                }else{
                if(matrices2[i][j]==1){
                    if(matrices2[i-1][j-1]==1){
                        cont++;
                    }if(matrices2[i-1][j]==1){
                        cont++;
                    }if(matrices2[i][j-1]==1){
                        cont++;
                    }if(matrices2[i+1][j-1]==1){
                        cont++;
                    }if(matrices2[i-1][j+1]==1){
                        cont++;
                    }if(matrices2[i+1][j]==1){
                        cont++;
                    }if(matrices2[i][j+1]==1){
                        cont++;
                    }if(matrices2[i+1][j+1]==1){
                        cont++;
                    }
                    if(cont==2){
                        matrices[i][j]=1;
                    }else{
                        matrices[i][j]=0;
                    }
                }if(matrices2[i][j]!=0){
                    if(matrices2[i-1][j-1]==1){
                        cont++;
                    }if(matrices2[i-1][j]==1){
                        cont++;
                    }if(matrices2[i][j-1]==1){
                        cont++;
                    }if(matrices2[i+1][j-1]==1){
                        cont++;
                    }if(matrices2[i-1][j+1]==1){
                        cont++;
                    }if(matrices2[i+1][j]==1){
                        cont++;
                    }if(matrices2[i][j+1]==1){
                        cont++;
                    }if(matrices2[i+1][j+1]==1){
                        cont++;
                    }
                    if(cont==3){
                        matrices[i][j]=1;
                    }else{
                        matrices[i][j]=0;
                    }
                }
            }
            }
           }
    return matrices;
        
    }
    public ArrayList<String>nums(int matrices[][]){
        ArrayList<String> nums=new ArrayList<String>();
        nums.clear();
        for(int i=0; i<matrices.length;i++){
            for(int j=0;j<matrices[i].length;j++){
                System.out.print("["+matrices[i][j]+"]");
                if(matrices[i][j]==1){
                    nums.add(i+":"+j);
                }
            }
            System.out.println("");
        }
    return nums;
    
}
    public int [][] llenar_random(int tam){
        ArrayList<String> nums=new ArrayList<String>();
        int[][]temp=new int[tam][tam];
        for(int i=1; i<tam-1;i++){
            for(int j=1;j<tam-1;j++){
                temp[i][j]=random.nextInt((1-0)+1)+0;
            }
        }
    return temp;
    }
}