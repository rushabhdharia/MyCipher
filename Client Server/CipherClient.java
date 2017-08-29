// Created Server and Client
import java.util.Scanner;
import java.io.*;
import java.net.*;

public class CipherClient {
  public static void main(String args[])
  {
    //int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the plain text");
    String plainText = sc.next();
    String encryptText = encrypt(plainText);
    try{
      Socket s = new Socket("localhost",6000);
      InputStream is = s.getInputStream();
      OutputStream os = s.getOutputStream();
      DataInputStream dis = new DataInputStream(is);
      DataOutputStream dos = new DataOutputStream(os);
      dos.writeUTF(encryptText);
      s.close();
    } catch(Exception e){
      System.out.println(e);
    }
    //decrypt(encryptText);
    
  }

  public static String encrypt(String plainText)
  {
    int i;
    int n = plainText.length();
    char text[] = plainText.toCharArray();
    for(i=0;i<n;i++)
    {
      text[i]-=65; // ASCII to Alpha
      text[i]+=3; // Ceasar Cipher encryption
      text[i]+=text[i]; 
      if(text[i]>26)
        text[i]-=26;  
      else
        text[i]+=1;
      text[i]+=65; //alpha to ASCII
      
    }
    String encrypt = String.valueOf(text);
    System.out.println("Encrypted text = "+encrypt);
    return encrypt;
  }
 
}