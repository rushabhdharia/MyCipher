# MyCipher
Basic Cipher created for Cryptography and System Security Course

## Code Explaination
### Encryption
1. Firstly, the plainText, that is, RUSHABH is taken as Input. 
2. Then Ceasar Cipher is used 
+ Therefore, my plainText RUSHABH changes to UXVKDEK (Adding +3 to each Alphabet)
3. I've considered the alphabets to follow a circular order, that is, A,B,C,....,Z,A,B,...Z,A,.. 
+ Now, the alphabet's numerical value is doubled by adding it with itself. Therefore, A becomes A+A, that is, 1+1 which becomes B (2)
+ If the value exceeds by 26 then it is subtracted by 26, as it follows a circular order.
+ Therefore, UXVKDEK changes to OUQVHJV, which is the encryptedText

### Decryption
1. The encryptedText, that is, OUQVHJV is taken as Input
2. Then each character's numerical value is checked if it is divisible by 2, to find if it is an even or odd value.
3. If it is an odd number then 27 is added to it (as we follow a circular order). Therefore, all odd values become even.
4. Then the value is divided by 2. 
+ Therefore the encryptedText changes from OUQVHJV to UXVKDEK.
5. Then the value is subtracted by 3 to get the original plainText, that is, RUSHABH.
