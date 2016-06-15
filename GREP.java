// Date: 6/8/16

package grep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GREP {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        File text = new File("sample.txt");
        Scanner scan = new Scanner(text);
        String x = scan.nextLine();
        int line_number = 0;
        while(scan.hasNextLine())
        {
            line_number++;
            if(x.contains(input))
            {
                System.out.println(line_number + ": " + x);
            }
            x = scan.nextLine();
        }
    }
}
