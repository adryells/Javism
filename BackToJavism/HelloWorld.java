package BackToJavism;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("The famous hello world.");
        System.out.println("Prints public age, private age and not famous print below.");
        not_main();
        System.out.println("Prints ");
    }
    public static int public_age = 19;

    public static void not_main(){
        int age = 20;
        System.out.println(public_age);
        System.out.println(age);
        System.out.println("Not famous print output.");
    }

    public static void this_or_that(){
        int private_age = 21;

        if (private_age > public_age){
            System.out.println(private_age);
        } else if (private_age < public_age) {
            System.out.println(public_age);
        } else {
            System.out.println("Private and public age are the same.");
        }
    }
}
