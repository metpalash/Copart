/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licensekey;

/**
 *
 * @author Palash-PC
 */
import java.util.Scanner;

public class LicenseKey {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter the License Key: ");
		String n = reader.nextLine();
		System.out.println("Enter the value of k: ");
		int k = reader.nextInt();
        String reverse = new StringBuilder(n).reverse().toString();
        StringBuilder tmp = new StringBuilder();
        int count = 0;
        for(char c: reverse.toCharArray()) {
            if(c!=' ' && c!='-' && count!=k){
                tmp.append(c);
                count++;
            }
            else if(c!='-' && c!=' ') {
                tmp.append('-');
                tmp.append(c);
                count=1;
            }
        }
		String fnl = tmp.toString().toUpperCase();
        String answer = new StringBuilder(fnl).reverse().toString();
        System.out.println(answer);
	}
}