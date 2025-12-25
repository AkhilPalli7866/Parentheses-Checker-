    //  Class author: Akhil Palli
    //  Date created:  11/12/2025
    //  General description: This program checks if the parentheses are properly written and match up
    public class ParenthesisChecker {


        //precondition: method accepts stirng values of different sets of brackets.
        //postcondition: method checks validity of the stirng input of the different types of parentheses brackets and curly braces.
        public static boolean isValid(String s1){
            boolean valid  = false;
            String text = s1; 
            String expectations = "";
        
                for (int i = 0; i<= text.length()-1 ;i++){
                    String ch = text.substring(i,i+1);
                        if(ch.equals("(")){ expectations += ")";}
                        else if(ch.equals("{")){ expectations += "}"; }
                        else if (ch.equals("[")){ expectations += "]"; }

                        else if (ch.equals(")")||ch.equals("}" ) || ch.equals("]")){
                            if (expectations.length() == 0 ){
                                return false; 
                            }
                            String lastChExpec = expectations.substring(expectations.length()-1);

                            if(!(ch.equals(lastChExpec))){
                                return false;
                            }
                            expectations = expectations.substring(0,expectations.length()-1);
                        }
                        else { return false;} 
                }
            if (expectations.length()== 0){return true;}
            else {return false;}
        }


        //pre conditon : main method to check
        //post condition : runs through parentheses checker method to chevck if parentheses are valid or not.
        public static void main(String[] args) {
            System.out.println(isValid("(){}[]")); //true
            System.out.println(isValid("(]")); //false
            System.out.println(isValid("([{({})}])")); //true
            System.out.println(isValid("(([]){})")); //true
            System.out.println(isValid("{}[())()(]")); //false
            System.out.println(isValid("(){}{")); //false
        }
    }


