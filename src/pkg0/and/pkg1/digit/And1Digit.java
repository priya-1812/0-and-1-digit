/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0.and.pkg1.digit;
import java.util.Scanner;
public class And1Digit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int i;
        while(t>0)
        {
            int count0=0,count1=0;
            String str=in.next();
            for( i=0;i<str.length();i++)
            {
                char ch =str.charAt(i);
               if(ch=='0')
               {
                   count0++;
               }
               else
               {
                   count1++;
               }
            }
            if(count0==1 || count1==1)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("NO");
            }
            
            
        }
    }
    
}
