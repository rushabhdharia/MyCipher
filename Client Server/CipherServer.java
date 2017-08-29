import java.util.Scanner;
import java.io.*;
import java.net.*;

public class CipherServer {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    try{
      ServerSocket ss = new ServerSocket(6000);
      Socket s = ss.accept();
      InputStream is = s.getInputStream();
      OutputStream os = s.getOutputStream();
      DataInputStream dis = new DataInputStream(is);
      String encryptText = dis.readUTF();
      System.out.println("Encrypted Text = "+encryptText);
      decrypt(encryptText);
      s.close();
    } catch(Exception e)
    {
        System.out.println(e);
    }
  }

  public static void decrypt(String encryptText)
  {

    int i;
    int n = encryptText.length();
    char text[] = encryptText.toCharArray();
    System.out.print("Decrypted text = ");
    for(i=0;i<n;i++)
    {
      int test=Character.getNumericValue(text[i])-9 ;//Character.getNumericValue() returns value from 10-35 for A-Z. Therefore -9 is used. 
      
      if(test%2!=0)
      {
        test += 27; //if test is odd we add the value by 27 to make it even.    
      }
      test = test/2; 
      test += 64; // Convert back to ASCII
      test -= 3; // Ceasar Cipher decryption
      System.out.print((char)test);
    } 
  }
}