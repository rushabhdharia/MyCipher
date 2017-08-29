import java.util.Scanner;
public class Cipher {
  public static void main(String args[])
  {
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the plain text");
    String plainText = sc.next();
    int n = plainText.length();
    char text[] = plainText.toCharArray();
    for(i=0;i<n;i++)
    {
      text[i]-=65;
      text[i]+=text[i];
      if(text[i]>26)
      text[i]-=26;  
      else
      text[i]+=1;
      text[i]+=65;
      
    }
    String encrypt = String.valueOf(text);
    System.out.println("Encrypted text = "+encrypt);
    
    System.out.print("Decrypted text = ");
    for(i=0;i<n;i++)
    {
      //char ij = 'I';
      int test=Character.getNumericValue(text[i])-9;
      
      if(test%2!=0)
      {
        test += 27;
         
      }
      test = test/2 + 64; 
      System.out.print((char)test);
    } 
    //String decrypt = String.valueOf(text);
    //System.out.println("Decrypted text = "+decrypt);
  }
}