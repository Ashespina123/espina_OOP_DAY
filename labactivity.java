import java.util.Scanner;

public class labactivity {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter message: ");
        String message = input.nextLine();
        String[] letters = message.split("\\s+");
        int upper = 0;
        
        for (String letter : letters){
            if (!letter.isEmpty()){
                
                letter = letter.substring(1);
                
                for (char j : letter.toCharArray()){
                    if ( j >= 'A' && j <= 'Z'){
                        upper++;
                        break;
                    }
                }
            }
        }
        if ( upper > 0){
            System.out.println("Jeje!");
        }
        else {
            System.out.println("uWu!");
        }
    }
    
}