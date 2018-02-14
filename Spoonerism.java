import java.util.*;
public class Spoonerism {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your phrase:");
        String phrase = input.nextLine();

        System.out.println("Enter first word:");
        String firstWord = input.nextLine();

        System.out.println("Enter second word:");
        String secondWord = input.nextLine();

        int firstPos = 0;
        int secondPos = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.substring(i,i+firstWord.length()).equals(firstWord)){ // check if part of the indices of phrase match with the firstWord
                firstPos = i;
                break;
            }
        }

        for (int j = 0; j < phrase.length(); j++) {
            if (phrase.substring(j,j+secondWord.length()).equals(secondWord)){ // check if part of the indices of phrase match with the secondWord
                    secondPos = j;
                    break;
            }
        }

        String firstPart = firstWord.substring(0,1);
        String secondPart = secondWord.substring(0,1);

        String newFirst = secondPart + firstWord.substring(1);
        String newSecond = firstPart + secondWord.substring(1);

        System.out.println(phrase.substring(0,firstPos)+newFirst+phrase.substring(firstPos+firstWord.length(),secondPos)+newSecond);
    }

}

