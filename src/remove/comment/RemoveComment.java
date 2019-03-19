/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remove.comment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mohamed Saide
 */
public class RemoveComment {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException
    {
         try
        {
          FileReader fr=new FileReader("code and comment.txt");
          BufferedReader br=new BufferedReader(fr);
          String line;
          while ((line=br.readLine()) !=null ) 
          {   
              Characters(line);
          }
          
        }
        
        catch(IOException e)
                {
                    System.out.print("error");
                } 
    }
    private static void Characters(String line) throws IOException 
    {     
          char []arr=line.toCharArray();
          for(int i=0;i<arr.length;i++)
          {   if(arr[0]!='/')
              {
               System.out.print(arr[i]);
              }
             else
             {   
                 break;
             }
          } 
         System.out.println(""); 
    }
    
}
  