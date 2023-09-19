package BackToJavism;

/*
In this file, I study the basic of programming logig, topics like: Scopes, Access, variables, functions, for loops and
decision structures
*/

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("The famous hello world.");
        System.out.println("Prints public age, private age and not famous print below.");
        not_main();

        System.out.println("\nThis or that ");
        this_or_that(12, 13);
        this_or_that(14, 13);
        this_or_that(13, 13);

        System.out.println("\n Loops :D");
        loop();
    }
    public static int public_age = 19;

    public static void not_main(){
        int age = 20;
        System.out.println(public_age);
        System.out.println(age);
        System.out.println("Not famous print output.");
    }

    public static void this_or_that(int age_one, int age_two){
        if (age_one > age_two){
            System.out.println(age_one);
        } else if (age_one < age_two) {
            System.out.println(age_two);
        } else {
            System.out.println("Private and public age are the same.");
        }
    }

    public static void loop(){
        for (int i = 1; i < 5; i++){
            System.out.println("Basic for loop.");
            System.out.println(i);

            boolean must_loop = true;
            while (must_loop){
                System.out.println(must_loop);
                must_loop = false;
            }
        }
    }
}
