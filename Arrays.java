//translate it to class. Maven or gradle


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maven.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author aslan
 */
public class Mavenproject1 {
    public static void main(String[] args) {
        arraymultiplerow();
    
    }
    public static void arraymultiplerow(){
        int[][] array= new int[2][5];
        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
        
        System.out.println("========write time======");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
               Scanner input= new Scanner(System.in);
                System.out.println("i="+i+",j="+j+"  "+"write it here: ");
                array[i][j]= input.nextInt();
                
            }
        }
        System.out.println("==========print time==========");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println("i="+i+","+"j="+j+"  "+ array[i][j]);
                
            }
        }
            
        }
        
    }
