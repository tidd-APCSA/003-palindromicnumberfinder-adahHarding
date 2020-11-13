public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number and return the difference
    public int searchForPalindromicNum(int num){
      int increment = num;
      boolean found = false;
      while(!found){
        increment++;
        if(testPalindromicNum(increment)){
          found = true;
        }
      }
      return increment - num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      String converted = Integer.toString(num);
      String reverse = this.reverseNum(num);
      return converted.equals(reverse);
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){

      String converted = Integer.toString(num);
      String reverse = "";
      for(int i = converted.length()-1; i >= 0; i--){
        reverse = reverse + converted.charAt(i);
      }
      return reverse;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
