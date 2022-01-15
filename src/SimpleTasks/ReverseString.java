package SimpleTasks;

public class ReverseString {
        private String reverseString = "";

        public void setInputString(String inputString){
            for(int i=0; i < inputString.length(); i++){
                reverseString += inputString.charAt(inputString.length()-i-1);
            }
        }

        public String getReverseString (){return reverseString;}

    public void reverseString(){

    }



}
