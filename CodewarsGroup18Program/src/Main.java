import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {
    /*
     *Group 18
     *Barcellano, Cristian Dave
     *Gahid, Jun Roy
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int myChoice = 0;
        showIntroduction();
        do {
            showMainMenu();
            myChoice = enterChoice(1,4);
            switch (myChoice) {
                case 1:
                    easy();
                    break;
                case 2:
                    medium();
                    break;
                case 3:
                    hard();
                    break;
                case 4:
                    System.out.println("Thank you for using our program.");
                    System.out.println("Enjoy the rest of your day.");
            }//End of switch
        } while (myChoice !=4);
        System.exit(0);
    }// End of the Main Method
    public static void showIntroduction() {
        System.out.println("\n\n\n");
        System.out.println("College of Information and Computing Sciences");
        System.out.println("            Saint Louis University");
        System.out.println("                  Baguio City ");
        System.out.println("---------------------------------------------");
        System.out.println("\n");
        System.out.println("            Cristian Dave Barcellano         ");
        System.out.println("                       &");
        System.out.println("                  Jun Roy Gahid");
        System.out.println("                   Programmers");
        System.out.println("\n");
        System.out.println("Please press a key to see Main Menu...");
    }
    public static void showMainMenu() {
        System.out.println("Main Menu ");
        System.out.println("--------------------------------");
        System.out.println("1. Show Solved Easy Codewars");
        System.out.println("2. Show Solved Medium Codewars");
        System.out.println("3. Show Solved Hard Codewars");
        System.out.println("4. Exit");
        System.out.println("--------------------------------");
    }//End of showMainMenu Method
    public static void easy() {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        do {
            showMenuEasy();
            choice = enterChoice(1,5);
            switch (choice) {
                case 1:
                    oddOrEvenDescription();
                    System.out.print("The answer is: " + oddOrEven((new int[] {2, 5 ,34, 6})));
                    break;
                case 2:
                    pythagoreanTripleDescription();
                    int[] p1={3,4,5};
                    int[] p2={3,5,7};
                    System.out.println("The answer for p1 is: " + pythagoreanTriple(p1));
                    System.out.println("The answer for p2 is: " + pythagoreanTriple(p2));
                    break;
                case 3:
                    bitCountingDescription();
                    System.out.println("The answer for the first example is : " + bitCounting(1234));
                    System.out.println("The answer for the second example is : " + bitCounting(4));
                    System.out.println("The answer for the third example is : " + bitCounting(7));
                    System.out.println("The answer for the fourth example is : " + bitCounting(9));
                    System.out.println("The answer for the fifth example is : " + bitCounting(10));
                    break;
                case 4:
                    disemvowelTrollsDescription();
                    System.out.println("The result is: " + disemvowelTrolls("This website is for losers LOL"));
                    break;
                case 5:
                    break;
            }
        } while (choice !=5);
    }//End of easy Method
    public static void medium() {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        do {
            showMenuMedium();
            choice = enterChoice(1,4);
            switch (choice) {
                case 1:
                    scrambliesDescription();
                    System.out.println("1st example is: " + scramblies("rkqodlw","world"));
                    System.out.println("2nd example is: " + scramblies("cedewaraaossoqqyt","codewars"));
                    System.out.println("3rd example is: " + scramblies("katas","steak"));
                    System.out.println("4th example is: " + scramblies("scriptjavx","javascript"));
                    System.out.println("5th example is: " + scramblies("scriptingjava","javascript"));
                    System.out.println("6th example is: " + scramblies("scriptsjava","javascripts"));
                    System.out.println("7th example is: " + scramblies("javscripts","javascript"));
                    System.out.println("8th example is: " + scramblies("aabbcamaomsccdd","commas"));
                    System.out.println("9th example is: " + scramblies("commas","commas"));
                    System.out.println("10th example is: " + scramblies("sammoc","commas"));
                    break;
                case 2:
                    consecutiveStringsDescription();
                    System.out.println("Answer for the first examples is: " + consecutiveStrings(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
                    System.out.println("Answer for the last example is: " + consecutiveStrings(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
                    break;
                case 3:
                    highestScoringWordDescription();
                    System.out.println("Answer for the first example is: " + highestScoringWord("man i need a taxi up to ubud"));
                    System.out.println("Answer for the second example is: " + highestScoringWord("what time are we climbing up to the volcano"));
                    System.out.println("Answer for the third example is: " + highestScoringWord("take me to semynak"));
                    break;
                case 4:
                    break;
            }
        } while (choice !=4);
    }//End of medium method
    public static void hard() {
        Scanner keybaord = new Scanner(System.in);
        int choice = 0;
        do {
            showMenuHard();
            choice = enterChoice(1,2);
            switch (choice) {
                case 1:
                    tenPinBowlingDescription();
                    System.out.println("Score of the first player is: " + tenPinBowling("11 11 11 11 11 11 11 11 11 11"));
                    System.out.println("Maybe this bowler should put bumpers on...\n ");
                    System.out.println("Score of the second player is: " + tenPinBowling("X X X X X X X X X XXX"));
                    System.out.println("Woah! Perfect game!");
                    break;
                case 2:
                    break;
            }
        } while (choice !=2);
    }//End of hard method
    public static int enterChoice(int min, int max) {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Input the number corresponding to your choice: ");
            choice = keyboard.nextInt();
            if (choice < min || choice > max)
                System.out.println("Invalid choice. Please ensure that you enter a number from " + min + " to " + max +".");
        } while (choice < min || choice > max);
        return choice;
    }//End of enterChoice Method
    public static void showMenuEasy() {
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Easy Menu ");
        System.out.println("--------------------------------");
        System.out.println("1. Odd or Even");
        System.out.println("2. Pythagorean Triple");
        System.out.println("3. Bit Counting");
        System.out.println("4. Disemvowel Trolls");
        System.out.println("5. Exit");
        System.out.println("--------------------------------");
    }//End of showMenuEasy Method
    public static void showMenuMedium() {
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Medium Menu ");
        System.out.println("--------------------------------");
        System.out.println("1. Scramblies");
        System.out.println("2. Consecutive Strings");
        System.out.println("3. Highest Scoring Word");
        System.out.println("4. Exit");
        System.out.println("--------------------------------");
    }
    public static void showMenuHard() {
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Hard Menu ");
        System.out.println("--------------------------------");
        System.out.println("1. Ten-Pin Bowling");
        System.out.println("2. Exit");
        System.out.println("--------------------------------");
    }
    public static void oddOrEvenDescription() {
        System.out.println("--------------------------------");
        System.out.println("From a given list of integers, this program will determine whether the sum of its elements is odd or even.");
        System.out.println("The given integers are : 2, 5, 34, 6");
    }//End of oddOrEvenDescription Method
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int n : array){
            sum += n;
        }
        return sum%2==0 ? "even" : "odd";
    }//End of oddOrEven Method
    public static void pythagoreanTripleDescription() {
        System.out.println("--------------------------------");
        System.out.println("Given an array of 3 non-negative integers a,b and c, this program will determine if they form a pythagorean triple.");
        System.out.println("A pythagorean triple is formed when: c^2=a^2+b^2");
        System.out.println("Where c is the largest value of a, b, c");
        System.out.println("When the returned value is equal to \"1\" it is a valid Pythagorean Triple but if it returns \"0\" it is not.");
        System.out.println("The given values for p1 are (3,4,5) and for p2 are (3,5,7)");
    }//End of pythagoreanTripleDescription Method
    public static int pythagoreanTriple(int[] triple) {
        if (triple[2] < triple [1] || triple[2] < triple [0]) {
            return 0;
        } if (triple [2] * triple[2] == (triple[0] * triple[0]) + (triple[1] * triple[1])){
            return 1;
        } return 0;
    }//End of pythagoreanTriple Method

    public static void bitCountingDescription() {
        System.out.println("--------------------------------");
        System.out.println("This program will write a function that takes an integer as input, and returns the number of bits " +
                "that are equal to one n the binary representation of the number. You can guarantee that input is non-negative.");
        System.out.println("The Given is \"1234\" for the first example, for the second example is \"4\", " +
                "for the third example is \"7\", the fourth example is \"9\", and the last is \"10\"");
    }//End of bitCountingDescription Method
    public static int bitCounting(int n) {
        String binaryRep = Integer.toBinaryString(n);
        String [] binaryArray = binaryRep.split("");
        int counter = 0;
        for(int i = 0; i < binaryArray.length; i++) {
            if(Integer.parseInt(binaryArray[i]) == 1){
                counter++;
            }
        }
        return counter;
    }//End of bitCountingMethod Method

    public static void disemvowelTrollsDescription() {
        System.out.println("--------------------------------");
        System.out.println("This program has the ability to write a function that takes a string and returns a new string with all vowels removed.");
        System.out.println("The given sentence is \"This website is for losers LOL!\".");
    }
    public static String disemvowelTrolls(String s) {
        s = (s.replaceAll("[aeiouAEIOU]", ""));
        return s;
    }//End of disemvowelTrolls
    public static void scrambliesDescription() {
        System.out.println("--------------------------------");
        System.out.println("Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.");
        System.out.println("The given are 1.(\"rkqodlw\",\"world\"), 2.(\"cedewaraaossoqqyt\",\"codewars\"), 3.(\"katas\",\"steak\"), 4.(\"scriptjavx\",\"javascript\"), 5.(\"scriptingjava\",\"javascript\"), " + "\n" +
                "6.(\"scriptsjava\",\"javascripts\"), 7.(\"javscripts\",\"javascript\"), 8.(\"aabbcamaomsccdd\",\"commas\") 9.(\"commas\",\"commas\") 10.(\"sammoc\",\"commas\")");
    }//End of scrambliesDescription method
    public static boolean scramblies(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) map.put(ch, 1 + map.getOrDefault(ch,0));
        for (char ch : str2.toCharArray()) {
            Integer count = map.getOrDefault(ch, 0);
            if (count == 0) return false;
            map.put(ch, --count);
        }
        return true;
    }//End of scramblies method
    public static void consecutiveStringsDescription() {
        System.out.println("--------------------------------");
        System.out.println("The program is given an array(list) strarr of strings and an integer k. The program will return the first longest string consisting of k consecutive strings taken in the array.");
        System.out.println("The examples are: (\"zone\", \"abigail\", \"theta\", \"form\", \"libe\", \"zas\", \"theta\", \"abigail\") and (\"ejjjjmmtthh\", \"zxxuueeg\", \"aanlljrrrxx\", \"dqqqaaabbb\", \"oocccffuucccjjjkkkjyyyeehh\")");
    }//End of consecutiveStringsDescription method
    public static String consecutiveStrings(String [] starr, int k) {
        String finResult = "";

        for(int i = k-1; i < starr.length; i++) {
            String currResult = "";
            int iteration = i;

            while (iteration >= i - (k - 1)) {
                currResult = starr[iteration].concat((currResult));
                iteration--;
            }
            if (currResult.length() > finResult.length()) {
                finResult = currResult;
            }
        }
        return finResult;
    }//End of consecutiveStrings method
    public static void highestScoringWordDescription() {
        System.out.println("--------------------------------");
        System.out.println("Given a string of words, you need to find the highest scoring word.\n" +
                "\n" +
                "Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.\n" +
                "\n" +
                "You need to return the highest scoring word as a string.\n" +
                "\n" +
                "If two words score the same, return the word that appears earliest in the original string.\n" +
                "\n" +
                "All letters will be lowercase and all inputs will be valid.");
        System.out.println("First example is \"man i need a taxi up to ubud\", second example is \"what time are we climbing up to the volcano\", and last example is \"take me to semynak\" ");
    }//End of highestScoringWordDescription Method
    public static String highestScoringWord(String s) {
        String[] strArr = s.split(" ");
        String highestValueStr = "";
        int highestValue = 0;

        for(String str: strArr){
            char[] letters = str.toCharArray();
            int wordValue = 0;

            for(char lttr: letters){
                ArrayList<Character> alphabet = getArrOfChars();
                wordValue = wordValue + alphabet.indexOf(lttr) + 1;
            }

            if(highestValue < wordValue){
                highestValue = wordValue;
                highestValueStr = str;
            }
        }
        return highestValueStr;
    }//End of highestScoringWord Method
    public static ArrayList<Character> getArrOfChars(){
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        return alphabet;
    }//End of getArrOfChars Method
    public static void tenPinBowlingDescription() {
        System.out.println("--------------------------------");
        System.out.println("In the game of ten-pin bowling, a player rolls a bowling ball down a lane to knock over pins. There are ten pins set at the end of the bowling lane. " +
                "Each player has 10 frames to roll a bowling ball down a lane and knock over as many pins as possible. The first nine frames are ended after two rolls or when the player knocks down all the pins. " +
                "The last frame a player will receive an extra roll every time they knock down all ten pins; up to a maximum of three total rolls.");
        System.out.println("The first score is: \"11 11 11 11 11 11 11 11 11 11\", and the last Score is: \"X X X X X X X X X XXX\"");
    }//End of tenPinBowlingDescription Method
    public static int tenPinBowling(String f) {
        Integer score = 0;
        List<Integer> rolls = new ArrayList<>();
        String[] frames = f.split(" ");
        for (String frame : frames) {
            String[] balls = frame.split("");
            for (String ball : balls) {
                if (ball.matches("X")) rolls.add(10);
                else if (ball.matches("/")) rolls.add(10 - rolls.get(rolls.size() - 1));
                else rolls.add(Integer.valueOf(ball));
            }
        }
        rolls.add(0);
        rolls.add(0);

        Integer frame = 0;
        for (int i = 0; i < 10; i++) {
            Integer point = rolls.get(frame);
            Integer nPoint = rolls.get(frame + 1);
            Integer nnPoint = rolls.get(frame + 2);
            if (point == 10) {
                score += 10 + (nPoint + nnPoint);
                frame++;
            } else if ((point + nPoint) == 10) {
                score += 10 + (nnPoint);
                frame += 2;
            } else {
                score += point + nPoint;
                frame += 2;
            }
        }

        return score;
    }//End of tenPinBowling Method
}// End of Codewars18 Class