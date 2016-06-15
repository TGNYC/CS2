// Date: 6/8/16

package grep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GREP {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner user = new Scanner(System.in);
        String input = user.next();
        
        File txt = new File("sample.txt");
        Scanner f = new Scanner(txt);
        String x = f.nextLine();
        int ln = 0;
        while(f.hasNextLine())
        {
            ln++;
            if(x.contains(input))
            {
                System.out.println(ln+": "+ x);
            }
            x=f.nextLine();
        }
    }
}
