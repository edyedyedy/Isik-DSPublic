/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.isikun.cse.ds.lab;

/**
 *
 * @author elifd
 */
public class StringExample {
     public static void main(String[] args) {
        char c='a';
        
        long startTime = System.nanoTime();
            repeat1(c,100);
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime);
            System.out.println("elapsedTime : "+elapsedTime);   

    }
    public static String repeat1(char c,int n){
 	String answer ="";
 	for (int j=0; j <n; j++)
 		answer += c;
	 return answer;
 }
    
    public static String repeat2(char c,int n){
	StringBuilder sb =new StringBuilder( );
	for (int j=0; j <n; j++)
 		sb.append(c);
	return sb.toString( );
}
    
    
}
