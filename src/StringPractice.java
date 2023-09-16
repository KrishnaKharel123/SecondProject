public class StringPractice {

    String string1, string2; // declared variable for question 1
    String originalString; // declared variable for question 2
    String old; // declared variable for question 3 and 4
    String exercises, exercise; // declared variable for question 5
    static String stephen, walter, edwin; //declared variable for question 6
    static String length; // declared variable for question 7
    static String Number; //declared variable for question 8
    static String Red, Orange; //declared variable for question 9
    static String dog, newString; //declared variable for question 10
    static String Replace; //declared variable for question 11

    static StringPractice stringPractice = new StringPractice(); // created object
    public static void main(String[] args) {  // main method

        stringPractice.joinString(); // calling methods
        stringPractice.specifiedValue();
        stringPractice.symbolRemoval();
        stringPractice.stringEnd();
        stringComparison();
        Number();
        lengthOfString();
        color();
        lazyDog();
        replace();

    }
    public void joinString() // method named joinString
    {
        string1 = "PHP Excercises and"; // value assigned to variable
        string2 = "Python Exercises";
        System.out.println("The concatenated string: " + string1 + " " + string2); // print screen

    }
     public void specifiedValue() // method
   {
    originalString ="PHP Exercises and Python Exercise"; // value assigned to variable
    System.out.println("Specified sequence of char values: and");// print screen
    System.out.println(originalString.contains("and"));
   }
    public void symbolRemoval()
    {
        old = "£30.00 are not equal to £20.00";
        System.out.println("Old:" +old);
        System.out.println("New:" +old.replaceAll("£", ""));
    }

    public void stringEnd()
    {
        exercises = "Python Exercises";
        exercise = "Python Exercise";
        System.out.println("Python" + "\"" +"Exercises" + "\"" + " ends with" +"\""+" se" + "\""+"? "+exercises.endsWith("se"));
        System.out.println("Python" + "\"" +"Exercise " + "\"" + " ends with" +"\""+" se" + "\""+"? "+exercise.endsWith("se"));
    }

    static void stringComparison()
    {
         stephen = "Stephen Edwin King";
         walter = "Walter Winchell";
         edwin = "stephen edwin king";
        boolean comparison1 = stephen.equalsIgnoreCase(walter);
        boolean comparison2 = stephen.equalsIgnoreCase(edwin);
        System.out.println("\"" + stephen + "\"" + " equals " + "\"" + walter + "\"" + "?" + " " + comparison1);
        System.out.println("\"" + stephen + "\"" + " equals " + "\"" + edwin + "\"" + "?" + " " + comparison2);

    }

    static void Number()
    {
        Number = "Rajesh34 patel45 2345988 London";
        System.out.println("Old:" +Number);
        System.out.println("New: " +Number.replaceAll("[^0-9]", ""));

    }
    static void lengthOfString()
    {
        length = "example.com";
        System.out.println("The string length of 'example.com' is: "+length.length());
    }

    static void color()
    {
        Red = "Red is favourite color.starts with Red";
        Orange = "Orange is also my favourite colour";
        System.out.println("Red is favourite color.starts with Red? "+Red.startsWith("Red"));
        System.out.println("Orange is also my favourite colour. starts with Red? " +Orange.startsWith("Red"));
    }


    static void lazyDog()
    {
        dog = "The quick brown fox jumps over the lazy dog";
        newString = dog.substring(10, 26);
        System.out.println("Old:" +dog);
        System.out.println("New = "  +newString);

    }
    static void replace()
    {
        Replace = "Rajesh Mordia";
        System.out.println("old:"+ Replace);
        System.out.println("New:" +Replace.replaceAll("a","T"));

    }

}







