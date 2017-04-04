/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtonumber;

/**
 *
 * @author Palash-PC
 */
public class StringToNumber {
 
    public static int stringToNumber(String str){
         
        char ch[] = str.toCharArray();
        int sum = 0;
        int zero = (int)'0';
        for(char c:ch){
            int tmp = (int)c;
            sum = (sum*10)+(tmp-zero);
        }
        return sum;
    }
     
    public static void main(String a[]){ 
        System.out.println(stringToNumber("1234"));
        System.out.println(stringToNumber("5678"));
    }
}
