public class StringPermutations {

  public static void main(String[] args) {
    permutation("", "1234");
  }

  // recursive method but needs an empty string as current permutation to start with.
  // would need a more elegant solution.
  private static void permutation(String s, String input) {
    if (input.isEmpty()) {
      System.err.println(s + input);
    } else {
      for (int i = 0; i < input.length(); i++) {
        permutation(s + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));

      }
    }
  }
}
