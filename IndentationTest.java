public class IndentationTest {

    public void correctlyIndentedMethod() {
        int x = 0; // Correct: Indentation is 4 spaces inside method block
        if (x == 0) {
            x = 10; // Correct: Indentation is 8 spaces inside if block
        }
    }

    public void incorrectlyIndentedMethod() {
       int x = 1; // Incorrect: Indentation should be 4 spaces, but it's 3
        if (x == 1) {
          x = 11; // Incorrect: Indentation should be 8 spaces, but it's 6
            if (x == 11) {
             x = 21; // Incorrect: Indentation should be 12 spaces, but it's 5
            }
       } // Incorrect: Indentation should be 4 spaces, but it's 3
    }

    public void mixedIndentationMethod() {
        int y = 2; // Correct: Indentation is 4 spaces inside method block
        if (y == 2) {
            y = 12; // Correct: Indentation is 8 spaces inside if block
        } // Correct: Indentation is 4 spaces inside method block
      int z = 3; // Incorrect: Indentation should be 4 spaces, but it's 2
    }
}
