package com.cubic.multithreading.assignment;

public class Vowel {
	
	static synchronized void Alphabet() throws InterruptedException{
		
		char[] alpharr={'a','e','i','o','u'};
		
		for(int i=0;i<alpharr.length;i++){
			
			System.out.print(alpharr[i]+" ");
			
			
				Thread.sleep(500);			
			
		}
		
	}

}
