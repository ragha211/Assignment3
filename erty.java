public class erty {
    //Give examples of values for a and b in the pseudorandom generator given on page 113 of this chapter such that the result is not very random looking, for n = 1000.
        //X[i] = (a * X[i-1] + b) mod n
    //------------------------------------------------------------------------

    //Suppose you are given an array, A, containing 100 integers that were generated using the method r.nextInt(10), where r is an object of type java.util.Random. Let x denote the product of the integers in A. There is a single number that x will equal with probability at least 0.99. What is that number and what is a formula describing the probability that x is equal to that number?
         //The integers in the array are generated using the method r.nextInt(10), which produces random integers between 0 and 9 (inclusive).
         //To determine the number that x can equal, we can compute all the possible products by multiplying the integers in the array together.
//---------------------------------------------------------------------------------

    //Sure! Here are three different examples of Java statements that assign a variable named "backup" to a new array with copies of all int entries of an existing array named "original":
          //int[] backup = new int[original.length];
    //System.arraycopy(original, 0, backup, 0, original.length);
    //-------------------------------------------------------------


}
