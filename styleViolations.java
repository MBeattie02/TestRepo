package com.example.serverside.analysis.service;

// Incorrectly ordered imports
import java.util.ArrayList;
import com.github.javaparser.ast.CompilationUnit;
import java.util.List;

public class styleViolations {

    // Constant not in uppercase
    public final int MAX_COUNT = 10;

    // Method name starting with uppercase
    public void CheckStyle() {
        // Magic number usage
        int threshold = 5;

        // Incorrect brace style
        if (threshold < MAX_COUNT)
        {
            System.out.println("Threshold is less than max");
        }

        // Variable not following camelCase
        int UserAge = 25;

        // More magic numbers
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    // Incorrectly named interface
    interface badInterfaceName {
        void doSomething();
    }
}
