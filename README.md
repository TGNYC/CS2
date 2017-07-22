# CS2
My Computer Science Class

___
[Input Output without Scanner](https://github.com/TGNYC/CS2/blob/master/InputOutput.java)
*09/15/15*

INPUT OUTPUT WITHOUT SCANNER:
Without using the Scanner class, examine the Java API and write a program that takes in a Players Name as well as their 3 Golf Scores, then determine and display (without using System.out.println) their AVERAGE Score.

___
[Over Eighteen With JOption Pane](https://github.com/TGNYC/CS2/blob/master/OverEighteen.java)
*09/17/2015*

OVER EIGHTEEN WITH JOPTION PANE:
You can use JoptionPane or Scanner to do the following: Read in a person's FIRST NAME , BIRTHDAY(MONTH AND YEAR). Then using the current Month and Year determine if the person is OVER 18 years old. Display a result. Example:
```java
Input: SallyJoeBob 09 2000
Output: SallyJoeBob, you are NOT over 18 years old.
```

___
[String Examination](https://github.com/TGNYC/CS2/blob/master/StringExamination.java)
*09/21/15*

STRING EXAMINATION: Read in a String and determine the following: TOTAL number of letters, If it starts with a Vowel, Total number of numbers in the string. Example:
```java
Input:  Apple123
Output: 8 letters, YES, 3
```

___
[ExactAgeCalc](https://github.com/TGNYC/CS2/blob/master/ExactAgeCalc.java)
*09/24/15*

EXACTAGECALC:
Accept a month day and year of birth. Get the current date and determine a persons full age as in YEARS plus days old. Example:
```java
Date: 9-27-2015
Input: 9-26-2000
Output: 14 years and 364 days old
```

___
[Library Fine](https://github.com/TGNYC/CS2/blob/master/LibraryFine.java)
*09/29/15*

LIBRARYFINE: Write a Java Application that reads in a persons full name (First Middle and Last) along with the fines they owe on 10 books.  The fines range from no fine .0 to a fine of 10.95Ask the user for the information and then calculate the TOTAL fine they oweDisplay their FULL NAME along with their TOTAL FINE. YOU MUST Write code to process this information using ALL ofThe I/O methods we discussed: JOptionPane ScannerAlso Display the Largest Fine and the Smallest Fine. Example:
```java
Please Enter Your First Name:	David
Please Enter Your Middle Name:	John
Please Enter Your Last Name:	Farrell

Enter the Fine for the First Book:	  .10
Enter the Fine for the Second Book:	1.10
Enter the Fine for the Third Book:	3.10
Enter the Fine for the Fourth Book:	8.10
Enter the Fine for the Fifth Book:	    .0
Enter the Fine for the Sixth Book:	  .70
Enter the Fine for the Seventh Book:   .90
Enter the Fine for the Eighth Book:	  .05
Enter the Fine for the Ninth Book:	  .10
Enter the Fine for the Tenth Book:	  .10

David John Farrell, Your total fine is: $14.25
```
___
[Text Analysis](https://github.com/TGNYC/CS2/blob/master/TextAnalysis.java)
*06/13/16*

TEXT ANALYSIS:
Write a program that allows the user to type in several lines of text (use a sentinel to know when the user is done). Read in the data and perform the following: Determine the number of occurrences of each letter in the alphabet in the text. Determine the number of one-letter words, two-letter words, three-letter words, etc… Determine how many lines of text and how many words were entered.

___
[GREP](https://github.com/TGNYC/CS2/blob/master/GREP.java)
*06/08/16*

GREP:
StringsWrite a simplified GREP program (GREP is a UNIX utility that scans a file or several files for a given word and prints out all lines in which that word occurs) that looks for a word in 1 file. A word is defined as a contiguous string of alphanumeric characters. For each line in which the word is contained, display the line number and the line: For example, theuser tells you to look in file army.txt to find the word “army” results in `Line 25: You are in the army now.`
___
[Find Names](https://github.com/TGNYC/CS2/blob/master/FindNames.java)
*06/10/16*

FIND NAMES:
Write a program that finds names in a file that start with a (user specified) specified character.
Create a file that contains people’s names: Joe Mary Jennifer Danny Etc...

Ask the user for the character to use in the search and roll thru the names in the file and display all names starting with the given character. At the end, display the number of names that matched and ask the user if they want to perform another search. Create a sentinel value to end the program (upon user request). Example:
```java
Enter a letter to search names: J
The following names matched the search for J:
Joe
Jennifer
There were 2 matches
```
___
[Encode/Decode](https://github.com/TGNYC/CS2/blob/master/EncodeDecode.java)
*06/11/16*

ENCODE/DECODE:
Write a program that will take in a word from a user. Redisplay the nuser to conform the word they entered and ask them if they want to ENCODE or DECODE the word. Allow the word to contain letters and/or numbers.Define string variables to serve as and index key and a code key. If the user requested to encode the word, use the key string variables to uniformly convert the word to a coded word and display it to the user. If the user requested to decode the word, use the key string variables to uniformly convert the word to from its coded state and display it to the user. SAMPLE:
```
Enter a message in all caps: HELLO
You just typed in HELLO
Enter E to encode, D to decode: 
E
Your message has been encoded as:
36ZZW
```
___
[CountWords](https://github.com/TGNYC/CS2/blob/master/CountWords.java)
*06/15/16*

COUNT WORDS:
Write a program that takes in a file from a user and prints out:the number of words in the file the total number of characters in the filethe longest word in the filethe average length of the words in the file. Allows the user to input a word and the program displays if the word is in the file and, if so, how many times it occurs. EXAMPLE:
```
Please enter the name of the file to check:
myfile.txt
There were 121 words in the file
There were 634 characters in the file
The longest word in the file is mississippi
The average length of a word in the file is 7
Please Enter a Word to Search For: 
the
The word the appears 62 times in the file.
```
