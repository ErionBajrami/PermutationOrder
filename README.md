# Permutation in Lexographic order

## Overview:

This Java program generates all possible permutations of numbers from 1 to 'n' in lexicographic order. It means that the numbers are arranged in a way that follows the same order as words in a dictionary.

## Mathematical Concepts:

### Permutation:
- A permutation is an arrangement of objects in a specific order. In this context, we're arranging numbers from 1 to 'n' in different orders.

### Lexicographic Order:
- Lexicographic order, also known as dictionary order, is a way of arranging symbols or words based on their alphabetical order. In the context of this program, it refers to arranging numbers in ascending order, similar to how words are arranged in a dictionary.

### Lexicographic Permutations:
- Lexicographic permutations are permutations arranged in lexicographic order. Each permutation is arranged such that it comes before the next permutation in the dictionary.

## How it Works:

1. **Initializing the Array**:
    - We start by creating an array containing numbers from 1 to 'n'.
    - For example, if 'n' is 5, the array would be `[1, 2, 3, 4, 5]`.

2. **Printing Initial Permutation**:
    - We print out the initial arrangement of numbers.

3. **Generating Permutations**:
    - We use a methodical approach to generate permutations.
    - We keep rearranging the numbers until we've tried all possible arrangements.

4. **Finding the Next Permutation**:
    - We find the rightmost number in the array that's smaller than the number to its right. This helps us identify where we can make changes to create a new permutation.
    - Then, we find the smallest number to the right of this identified number, which is greater than the identified number. This helps us find the smallest change we can make to create the next permutation.
    - We swap these two numbers to create a new arrangement.
    - We then rearrange the numbers to the right of the swapped numbers to ensure they're in ascending order, maintaining the lexicographic order.

5. **Printing Each Permutation**:
    - After each permutation is generated, we print it out.

6. **Looping Until All Permutations Are Generated**:
    - We repeat the finding and printing steps until we've tried all possible arrangements of the numbers.

7. **Termination**:
    - The process stops when we can no longer find a pair of numbers to swap, indicating that we've generated all possible permutations.

8. **Printing Final Permutation**:
    - The last permutation printed will be in descending order, indicating that it's the final one.

## How to Use:

1. **Compile and Run**:
    - Compile the Java file using `javac PermutationsOrder.java`.
    - Run the compiled file using `java PermutationsOrder`.

2. **Enter 'n' Value**:
    - When prompted, enter the value of 'n', which represents the highest number in the permutation set.

3. **View Permutations**:
    - Once the program runs, it will display all permutations of numbers from 1 to 'n' in lexicographic order.

## Example:

Suppose we run the program with 'n' set to 3. The program would display the following permutations:

```
[1, 2, 3]
[1, 3, 2]
[2, 1, 3]
[2, 3, 1]
[3, 1, 2]
[3, 2, 1]
```

## Contribution:

Feel free to contribute to this project by suggesting improvements, reporting issues, or adding new features.
