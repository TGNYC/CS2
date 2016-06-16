// Date: 6/13/16

public static void main(String[] args) throws FileNotFoundException {
        String fileName;    
        String letter;      
        int total = 0;     
        
        Scanner in = new Scanner(System.in);
        fileName = in.next();
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);  

        int count = 0;
            
        if (inputFile.nextLine().equalsIgnoreCase(letter)) {                                
                    
            count++;          
                
            total += count;   
        }
    }
