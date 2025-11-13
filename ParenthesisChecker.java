//  Class author: Akhil Palli
//  Date created:  11/12/2025
//  General description: This program checks if the parentheses are properly written 
//                       and match up



// Hey Mr Menchukov I just needed some more time to work on this assignment, I'm not able to figure it out. 



public class ParenthesisChecker {

    
    public static void checkParentheses(String s) {
        int openCount = 0;
        int i = 0;

       
        //  Pre-condition: The string uses '(' and ')' only ;-;.
        //  Post-condition: Prints if the parentheses look valid or not.
        while (i < s.length()) {
            char ch = s.charAt(i) ;

            if (  ch   ==   '('  ) {
                openCount++;

            } 
            else if (  ch == ')' ) {
                openCount-= 1;

            }

            i+=1 ;
          }

        if (openCount == 0){
            System.out.println("Valid");
        } 
        else{
            System.out.println("Invalid");
        }
    }



    //pre conditon : main method to check
    //post condition : runs through parentheses checker method to chevck if parentheses are valid or not.
    public static void main(String[] args) {
        

        String test = "(()))("; 

        
        checkParentheses(test);
    }
}


