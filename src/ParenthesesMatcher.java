/*
* this is class is used to verify that if a string has matching opening
* and closing parentheses, which include () {} and []
*
* */


import java.util.Stack;

public class ParenthesesMatcher {
/**
*
*
* @param string string that is not null
* @return true if string has matching open and close parentheses,
 * false if the length of string is less than or equal to 1 OR
 * doesn't have matching parentheses

* */
    public static boolean isMatched(String string){
        char[] charSequenceOfString = string.toCharArray();
        Stack<Character> s = new Stack<> ();
        String openingString = "([{";
        String closingString = ")]}";

        if(string.length() <= 1){
            System.out.println("length less than 1");
            return false;
        }

        for(int index = 0; index < charSequenceOfString.length; index++){
            // if the char is an opening parentheses then push it to stack
            int indexOfOpeningParen = openingString.indexOf(charSequenceOfString[index]);
//            System.out.println(i1+" is the opening brackets");

            if(indexOfOpeningParen != -1){
                s.push(charSequenceOfString[index]);
            }

            // if the char is one of the closing parentheses, compare it to
            // s.pop(). If they are the same, continue traversing the elements
            // the char array, otherwise return false
            int indexOfClosingParen = closingString.indexOf(charSequenceOfString[index]);
//            System.out.println(i2+" is the closing brackets");
            if(indexOfClosingParen != -1){
                if(!s.empty()){
                    if( indexOfClosingParen != openingString.indexOf(s.pop()) ){
                        return false;
                    }
                }else{
                    // first closing parentheses
                     return false;
                }
            }
        }

        if(s.empty()){
            return true;
        }else{
            return false;
        }


    }


}
