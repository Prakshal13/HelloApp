/**
 * HelloApp.java
 * UC1 + UC2 Implementation
 *
 * UC1: Display Hello World
 * UC2: Display Hello with Command Line Argument
 */

public class UC2 {

    public static void main(String[] args) {

        // check if name argument is given
        if (args.length > 0) {

            String name = args[0];
            System.out.println("Hello, " + name + "!");

        } else {

            System.out.println("Hello, World!");

        }

    }
}