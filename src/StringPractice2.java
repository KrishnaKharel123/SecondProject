public class StringPractice2
{

    String string1,string2; ///
    String exercises,exercise;
    static String dog,newString;






    static StringPractice2 stringPractice2= new StringPractice2();

    public static void main(String[]args)
    {

        stringPractice2.joinstring();
        stringPractice2.stringends();
        dog();



}

   public void joinstring()
   {
       string1= "PHP Exercises";
       string2= "Python Exercises";
       System.out.println("The concatenated string: " +string1  +" and  " +string2 );



   }

public void stringends()
{
    exercises = "Python Exercises"; //VALUE ASSIGN
    exercise= "Python Exercise";
    System.out.println("Python Exercises ends with se? "  +  exercises.endsWith ("se"));
    System.out.println("Python Exercise ends with se? " +exercise .endsWith("se"));


}

public static void dog()
{
    dog = "The quick brown fox jumps over the lazy dog";
    newString = dog.substring(10, 26);
    System.out.println("old= " +dog);
    System.out.println("New = " +newString);


}





}














