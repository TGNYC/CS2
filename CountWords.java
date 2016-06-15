// 06/15/16

public static void countWords(String name) throws FileNotFoundException 
{
        File original_file = new File(name);
        Scanner input = new Scanner(original_file);
        int words = 0, characters = 0;
        String longest = "", other_longest = "";
        while (input.hasNext()) 
        {
            words++;
            String current_Word = input.next();
            characters += current_Word.length();
            if (current_Word.length() > longest.length()) 
            {
                longest = current_Word;
                other_longest = "";
            }
            else 
            {
                if (current_Word.length() == longest.length())
                    other_longest += ", " + current_Word;
            }
        }
        System.out.println("There were " + words + " words");
        System.out.println("There were " + characters + " characters");
        System.out.println("The longest word was " + longest + other_longest);
        System.out.println("The Average Word Length was " + characters/words);
    }

