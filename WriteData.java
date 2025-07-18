public class WriteData {
    public static void main(String[]args) throws java.io.IOException{
        java.io.File file = new java.io.File("Scores.txt");
        if (file.exists()){
            System.out.println("File Already Exists");
            System.exit(1);
        }
        // create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        // write formmated output to the file
        output.print("John T Smith ");
        output.println(80);
        output.print("Elton John ");
        output.println("99");

        // close file
        output.close();

    }
    
}
