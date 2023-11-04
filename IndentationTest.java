public class IndentationTest {

    public static void main(String[] args) {
        // Correct indentation for a method block
        int n = 10;
        for (int i = 0; i < n; i++) {
            // Correct indentation for a loop block
            if (i % 2 == 0) {
                // Correct indentation for an if block
                System.out.println(i + " is even");
            } else {
                // Incorrect indentation, should be 4 spaces from the 'if' block
              System.out.println(i + " is odd");
            }
        }

        // Another method with incorrect indentation at the start
      List<String> list = new ArrayList<>();
        // Correct indentation for the method block
        for (String item : list) {
            // Correct indentation for a for-each loop
            System.out.println(item);
        }

        // Nested loops with correct indentation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    // Incorrect indentation, should be 4 spaces from the 'if' block
                  System.out.println("j < i");
                }
            }
        }
    }

    // Incorrect indentation for a method declaration, should be at the class level
  public void incorrectlyIndentedMethod() {
        // Correct indentation for the method block
        System.out.println("This method is incorrectly indented.");
    }
}

