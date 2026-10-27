
import java.util.Scanner;
public class PerfectPet {
    // Determines if a letter is a vowel
    public static boolean isVowel(char letter) {
    letter = Character.toLowerCase(letter);
    return letter =='a'||letter == 'e'|| letter == 'i'|| letter == 'o' || letter == 'u';
    }
    public static void main(String[] args) {
    // User inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter color (red, blue, green):");
    String color = input.nextLine().toLowerCase();
    while (!color.equals("red") && !color.equals("blue")&& !color.equals("green")) {
    System.out.println("Invalid color. Enter red, blue, or green:");
    color=input.nextLine().toLowerCase();
        }
    System.out.println("Enter season (winter, spring, summer, fall):");
    String season = input.nextLine().toLowerCase();
    while (!season.equals("winter") && !season.equals("spring")&&!season.equals("summer") && !season.equals("fall")) {
    System.out.println("Invalid season. Enter winter, spring, summer, or fall:");
    season = input.nextLine().toLowerCase();
        }
    System.out.println("Enter name:");
    String name=input.nextLine();
    // Determines perfect pet
    String pet = "";
    char firstLetter = Character.toLowerCase(name.charAt(0));
    if (color.equals("blue")&&season.equals("fall")) {
    pet = "alligator";
    } else if (color.equals("blue")&&season.equals("spring")) {
    pet = "ostrich";
    } else if (color.equals("green")&&season.equals("winter") && !isVowel(firstLetter)) {
    pet = "giraffe";
    } else if (color.equals("green")&&!season.equals("fall")) {
    pet = "dog";
    } else if (color.equals("red")) {
    if (isVowel(firstLetter)) {
    pet = "porcupine";
    } else {
    pet = "panda";
    }
    }
    // Summer rule
    if (season.equals("summer")&& !pet.equals("dog")&&!pet.equals("panda")&& !pet.equals("porcupine")) {
    pet = "pony";
        }
    // Axolotl rule
    if (pet.equals("") && !isVowel(firstLetter)&& color.equals("blue")&& !season.equals("summer")&& !season.equals("fall")){
    pet = "axolotl";
}
    // Rock pet
    if (pet.equals("")) {
    pet = "pet rock";
        }

    System.out.println("The perfect pet for you is a " + pet + "!");
    input.close();
    }
}
