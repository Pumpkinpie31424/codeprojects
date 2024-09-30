

import java.util.Scanner;  // for Keyboard Input
import java.util.Arrays;

public class Cipher
{
   static final Scanner INPUT = new Scanner(System.in);
   static final Scanner TEXT = new Scanner(System.in);
   //main start
   public static void main(String[] args)
   { 
   
   //Declared variables and constants
   int OffsetCase = 0;
   
   int INDEX_ACTUAL = 0;
   int INDEX_START = 0;
   int NUMBER_ZERO = 0;
   int NUMBER_ONE_POSITIVE = 1;
   int NUMBER_TWO = 2;
   int NUMBER_THREE = 3;
   int NUMBER_FOUR = 4;
   int NUMBER_FIVE = 5;
   int NUMBER_SIX = 6;
   int NUMBER_SEVEN = 7;
   int NUMBER_EIGHT = 8;
   int NUMBER_NINE = 9;
   int NUMBER_TEN = 10;
   int NUMBER_ELEVEN = 11;
   int NUMBER_TWELVE = 12;
   int NUMBER_THIRTEEN = 13;
   int NUMBER_FOURTEEN = 14;
   int NUMBER_FIFTEEN = 15;
   int NUMBER_SIXTEEN = 16;
   int NUMBER_SEVENTEEN = 17;
   int NUMBER_EIGHTEEN = 18;
   int NUMBER_NINETEEN = 19;
   int NUMBER_TWENTY = 20;
   int NUMBER_TWENTY_ONE = 21;
   int NUMBER_TWENTY_TWO = 22;
   int NUMBER_TWENTY_THREE = 23;
   int NUMBER_TWENTY_FOUR = 24;
   int NUMBER_TWENTY_FIVE = 25;
   int NUMBER_TWENTY_SIX = 26;
 
   //Ask user for input 
   System.out.print("Enter an offset for this encryption between -26 and 26: ");
   //Store input of offset declared by user
   OffsetCase = INPUT.nextInt();
   OffsetCase = OffsetCase * -NUMBER_ONE_POSITIVE;
   
   //Get input for text to mix up
   System.out.println("Enter text.");
   String FirstInput = TEXT.nextLine();
   
   //Uppercase values
   String UpperCase = FirstInput.toUpperCase();
   
   //to char array
   char[] charArray = UpperCase.toCharArray();

   //Plain text starting array
   char[] LETTERS_AZ = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
   
   //Cipher 
   char[] ChangedLetters = new char[NUMBER_TWENTY_SIX];
 
   //Convert to cipher and put to new array
   for (INDEX_ACTUAL = NUMBER_ZERO; INDEX_ACTUAL < LETTERS_AZ.length; ++INDEX_ACTUAL) 
   {
      //Positive rotation
      if (OffsetCase < NUMBER_ZERO)
      {
         //Index greater than 25 
         if ((INDEX_ACTUAL + (OffsetCase * -NUMBER_ONE_POSITIVE)) > NUMBER_TWENTY_FIVE){
         ChangedLetters[INDEX_ACTUAL] = LETTERS_AZ[(INDEX_ACTUAL - OffsetCase) % NUMBER_TWENTY_SIX];
         }
         else if (((INDEX_ACTUAL - OffsetCase) <= NUMBER_TWENTY_FIVE) && ((INDEX_ACTUAL - OffsetCase) >= NUMBER_ZERO)) 
         {
         ChangedLetters[INDEX_ACTUAL] = LETTERS_AZ[INDEX_ACTUAL - OffsetCase];
         }
         else if ((INDEX_ACTUAL - OffsetCase) < NUMBER_ZERO)
         {
         ChangedLetters[INDEX_ACTUAL] = LETTERS_AZ[NUMBER_TWENTY_FIVE - OffsetCase];
         }
      }
      //Neagtive roation and conditions
      if (OffsetCase > NUMBER_ZERO)
      {
         OffsetCase = OffsetCase * -NUMBER_ONE_POSITIVE;
         if (INDEX_ACTUAL - OffsetCase > NUMBER_TWENTY_FIVE)
         {
         ChangedLetters[INDEX_ACTUAL] = LETTERS_AZ[(INDEX_ACTUAL - OffsetCase) % NUMBER_TWENTY_SIX];
         }
         else if (((INDEX_ACTUAL - OffsetCase) <= NUMBER_TWENTY_FIVE) && ((INDEX_ACTUAL - OffsetCase) >= NUMBER_ZERO)) 
         {
         ChangedLetters[INDEX_ACTUAL] = LETTERS_AZ[NUMBER_TWENTY_SIX - (INDEX_ACTUAL - OffsetCase)];
         }
         else if ((INDEX_ACTUAL - OffsetCase) < NUMBER_ZERO){
         ChangedLetters[INDEX_ACTUAL] = LETTERS_AZ[NUMBER_TWENTY_SIX + OffsetCase];
         }
       }
   }
   //Checking characters in input array and checking if they are equal to eachother then assiging input array to cipher array position to match characters. 
   for(INDEX_START = NUMBER_ZERO; INDEX_START < charArray.length; ++INDEX_START)
   {
      if(charArray[INDEX_START] == ' ')
      {
         System.out.print(' ');
      }
      if(charArray[INDEX_START] == 'A')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_ZERO];
         System.out.print(ChangedLetters[NUMBER_ZERO]);
      }      
      if(charArray[INDEX_START] == 'B')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_ONE_POSITIVE];
         System.out.print(ChangedLetters[NUMBER_ONE_POSITIVE]);
      }
      if(charArray[INDEX_START] == 'C')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_TWO];
         System.out.print(ChangedLetters[NUMBER_TWO]);
      }
      if(charArray[INDEX_START] == 'D')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_THREE];
         System.out.print(ChangedLetters[NUMBER_THREE]);
      }
      if(charArray[INDEX_START] == 'E')
      {
      charArray[INDEX_START] = LETTERS_AZ[NUMBER_FOUR];
      System.out.print(ChangedLetters[NUMBER_FOUR]);
      }
      if(charArray[INDEX_START] == 'F')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_FIVE];
         System.out.print(ChangedLetters[NUMBER_FIVE]);
      }
      if(charArray[INDEX_START] == 'G')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_SIX];
         System.out.print(ChangedLetters[NUMBER_SIX]); 
      }
      if(charArray[INDEX_START] == 'H')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_SEVEN];
         System.out.print(ChangedLetters[NUMBER_SEVEN]);
      }
      if(charArray[INDEX_START] == 'I')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_EIGHT];
         System.out.print(ChangedLetters[NUMBER_EIGHT]);
      }
      if(charArray[INDEX_START] == 'J')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_NINE];
         System.out.print(ChangedLetters[NUMBER_NINE]);
      }
      if(charArray[INDEX_START] == 'K')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_TEN];
         System.out.print(ChangedLetters[NUMBER_TEN]);
      }
      if(charArray[INDEX_START] == 'L')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_ELEVEN];
         System.out.print(ChangedLetters[NUMBER_ELEVEN]);
      }
      if(charArray[INDEX_START] == 'M')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_TWELVE];
         System.out.print(ChangedLetters[NUMBER_TWELVE]);
      }
      if(charArray[INDEX_START] == 'N')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_THIRTEEN];
         System.out.print(ChangedLetters[NUMBER_THIRTEEN]);
      }
      if(charArray[INDEX_START] == 'O')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_FOURTEEN];
         System.out.print(ChangedLetters[NUMBER_FOURTEEN]);
      }
      if(charArray[INDEX_START] == 'P')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_FIFTEEN];
         System.out.print(ChangedLetters[NUMBER_FIFTEEN]);
      }
      if(charArray[INDEX_START] == 'Q')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_SIXTEEN];
         System.out.print(ChangedLetters[NUMBER_SIXTEEN]);
      }
      if(charArray[INDEX_START] == 'R')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_SEVENTEEN];
         System.out.print(ChangedLetters[NUMBER_SEVENTEEN]);
      }
      if(charArray[INDEX_START] == 'S')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_EIGHTEEN];
         System.out.print(ChangedLetters[NUMBER_EIGHTEEN]);
      }
      if(charArray[INDEX_START] == 'T')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_NINETEEN];
         System.out.print(ChangedLetters[NUMBER_NINETEEN]);
      }
      if(charArray[INDEX_START] == 'U')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_TWENTY];
         System.out.print(ChangedLetters[NUMBER_TWENTY]);
      }
      if(charArray[INDEX_START] == 'V')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_TWENTY_ONE];
         System.out.print(ChangedLetters[NUMBER_TWENTY_ONE]);
      }
      if(charArray[INDEX_START] == 'W')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_TWENTY_TWO];
         System.out.print(ChangedLetters[NUMBER_TWENTY_TWO]);
      }
      if(charArray[INDEX_START] == 'X')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_TWENTY_THREE];
         System.out.print(ChangedLetters[NUMBER_TWENTY_THREE]);
      }
      if(charArray[INDEX_START] == 'Y')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_TWENTY_FOUR];
         System.out.print(ChangedLetters[NUMBER_TWENTY_FOUR]);
      }
      if(charArray[INDEX_START] == 'Z')
      {
         charArray[INDEX_START] = LETTERS_AZ[NUMBER_TWENTY_FIVE];
         System.out.print(ChangedLetters[NUMBER_TWENTY_FIVE]);
      }
    }
  }
}