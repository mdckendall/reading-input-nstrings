import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ss = new Scanner(System.in);
    
    System.out.println("Input any word, and I will tell you how many letters that word has:\n\n");
    String word = ss.nextLine();
    int length= word.length();
    
    System.out.println("\n\n" + word + " has " + length + " letters! ");
    
  }
}