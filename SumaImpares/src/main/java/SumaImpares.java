/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juand
 */
public class SumaImpares {
    
    public static void main(String Args[])
    {
        long num[]=new long[100000000];
        long suma=0;

        for(int i=0;i<100000000;i++)
        {
            num[i]=i+1;
            if(num[i]%2!=0)
            {
                suma=num[i]+suma;
            }
        }
        System.out.println("La suma es: "+suma);
        
        
    }
    
    
    
}
