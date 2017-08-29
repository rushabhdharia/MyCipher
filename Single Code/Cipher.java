import java.util.Scanner;
public class Cipher {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the plain text");
    String plainText = sc.next();
    String encryptText = encrypt(plainText);
    decrypt(encryptText);  
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