/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerscorewithbound;

import java.util.Scanner;

/**
 *
 * @author kant2
 */
public class SoccerScoreWithBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LiveScoreBean lsbean= new LiveScoreBean();
        Thai Sub = new Thai();
        UAE Sub2 = new UAE();
        Scanner sc = new Scanner(System.in);
        lsbean.addPropertyChangeListener(Sub);
        lsbean.addPropertyChangeListener(Sub2);
 
        String type;
        do {
            System.out.printf("Enter Score Thai VS UAE ==> ");
            type = sc.nextLine();
            lsbean.setScoreLine(type);
        }while(!type.equals(""));
    }
    
}
