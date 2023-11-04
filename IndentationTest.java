public class IndentationTest {

    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Correctly indented
       System.out.println("This line is indented incorrectly."); // Incorrectly indented
        if (args.length > 0) {
            System.out.println("Arguments provided"); // Correctly indented
          System.out.println("This line is also indented incorrectly."); // Incorrectly indented
        }
    }

    public void anotherMethod() {
      System.out.println("Incorrect indentation here."); // Incorrectly indented
        System.out.println("Correct indentation."); // Correctly indented
    }
}


