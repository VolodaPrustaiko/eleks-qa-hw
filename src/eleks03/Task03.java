package eleks03;

public class Task03 {
    public static void main(String[] args) {
        String inputString = "some text is here";//args[0];
        int index = 2; //Integer.parseInt(args[1])

        getNCharsByIndex(inputString, index);
    }

    static void getNCharsByIndex(String sentence, int index) {
        String[] words = sentence.split(" ");
        String word = words[index];
        int wordLenght = word.length();

        System.out.println(wordLenght);
    }
}