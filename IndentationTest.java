public class IndentationTest {

    public static void main(String[] args) {
        System.out.println("Test 1");
            System.out.println("Indentation error here"); // Incorrect: Should be 8 spaces
    }

    public void methodExample() {
        for(int i = 0; i < 10; i++) {
            System.out.println("In for loop");
                if(i % 2 == 0) {
                    System.out.println("Number is even"); // Correct: 16 spaces (8 + 8)
                } else {
                            System.out.println("Number is odd"); // Incorrect: Should be 16 spaces
                }
        }
    }

    public void anotherMethod() {
          while(true) {
            System.out.println("In while loop"); // Incorrect: Should be 8 spaces
            break;
          }
    }
}


