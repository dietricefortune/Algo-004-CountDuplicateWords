package hbcu.stay.ready.algor;

public class Solution {

    public String countUniqueWords(String input) {


        //public static void main (String[]args){
        //Initialize the input
        //String input = "car red blue car green red car cat yellow car";

        //rename the input to badSentence, make it an array and split it by word
        String[] badSentence = input.split("");

        //for (int x =0; x >= badSentence.length; x++){

        int wordDuplicate = 1;    //Variable for getting Repeated word count

        for (int i = 0; i < badSentence.length; i++) //Outer loop for Comparison
        {
            for (int j = i + 1; j < badSentence.length; j++) //Inner loop for Comparison
            {

                if (badSentence[i].equals(badSentence[j]))  //Checking for both strings are equal
                {
                    wordDuplicate = wordDuplicate + 1;    //if words are the same, increment the count
                    badSentence[j] = "0"; //Replace repeated words by zero
                }
            }
            if (badSentence[i] != "0")
                System.out.println(badSentence[i] + "--" + wordDuplicate); //Printing the word along with count
            wordDuplicate = 1;


        }
    }


}