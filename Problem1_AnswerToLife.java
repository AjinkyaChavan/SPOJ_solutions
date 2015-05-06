import java.util.*;
import java.lang.*;
import java.io.*;


class Problem1_AnswerToLife
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		BufferedReader bf;
		
		try{
			bf = new BufferedReader(new InputStreamReader(System.in));
			int j;
			
			while((j = Integer.parseInt(bf.readLine())) != 42){
				System.out.println(j);
				
				j = Integer.parseInt(bf.readLine());
				
				if(j == 42)
					break;
				else
					System.out.println(j);
				
				
					}				  
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}