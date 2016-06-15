# CS2
My Computer Science Class

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