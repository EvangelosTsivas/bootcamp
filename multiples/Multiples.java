/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;

/**
 *
 * @author Vagos
 */
public class Multiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i =1; i<=100; i++){
            if(i%3==0){
                System.out.println(i + " :Multiple of 3!");
            }else if(i%5==0){
                System.out.println(i+ " :Multiple of five!");
            }else{
                System.out.println(i);
            }
        }
    }
    
}
