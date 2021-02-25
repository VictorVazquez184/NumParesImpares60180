/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares60180;

import java.util.Scanner;

/**
 *
 * @author RORLe
 */
public class NumParesImpares60180 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1;
        int sumP = 0;
        int sumIp = 0;
        while(num <= 100) {
            if(num % 2== 0){
                sumP = num + sumP;
        }else{
                sumIp = num + sumIp;
            }
            num++;
    }
        System.out.println(sumP);
        System.out.println(sumIp);
}
}

