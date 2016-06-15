// 06/11/16

public class Encoding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        String en = new String();
        int[] code= new int[original.length()];
        String dec = new String();
        String input = sc.next();
        if (input.equals("e"))
        {
            int c=0;
            while (c < original.length())
            {
                code[c] = original.charAt(c) + original.length();
                en += original.charAt(c) + original.length();
                c++;
            }
            System.out.print(en);
        }
        input = sc.next();
        if (input.equals("d")) 
        {
          int c=0;
          while (c< code.length)
          {
              dec += (char)(code[c] - original.length());
              c++;
          }
          System.out.print(dec);
        }
    }
    
}
