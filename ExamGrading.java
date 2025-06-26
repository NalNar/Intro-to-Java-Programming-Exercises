public class ExamGrading {
    public static void main(String[]args){
        // create a randomized array of char answer key 
        char [][] answer = new char[100][10]; // example, 100 students gives a mcq of 10 
        
        // randomize answers to the 2d array of 'answer'
        for (int row = 0; row < answer.length; row++ ){
            for (int column = 0; column<answer[row].length ; column++){
                // goal is to generate the ascii equivalent of A B C D and then type cast to char
                // A 65 B 66 C 67 D 68
                answer [row][column] = (char) ((Math.random() * (4)) + 65); // * (max - min + 1) + min) , so 4 inclusive of D 68
            }
        }
        // randomize answer key for the mcq, 1D array of solutions
        char [] answerKey = new char[10];
        for (int i = 0; i< answerKey.length; i++){
            answerKey[i] = (char) ((Math.random()*4)+65);
        }

        // validation of the answer to answer key
        for (int i = 0 ; i<answer.length; i++){
            int correct = 0;
            for (int j = 0; j < answer[i].length; j++){
                if (answer[i][j] == answerKey[j])
                correct++;
            }
        
        // randomize student names from an aray of common names 
            
            String[] commonNames = {"Alex", "Sam", "Jordan", 
                                    "David", "Michael", "William", 
                                    "Jamie", "Casey", "Cameron", 
                                    "Skyler","Stephanie","Amy"};
            String[] studentNames = new String[100];

            for (int k = 0; k < studentNames.length; k++){
            int randomIndex = (int) (Math.random() * commonNames.length);
            studentNames[k] = commonNames[randomIndex];

            }

        // output after one run of loop
            System.out.println(studentNames[i] + " Code is " + i + " & Got " + correct + " Correct");
        }


    }
    
}
