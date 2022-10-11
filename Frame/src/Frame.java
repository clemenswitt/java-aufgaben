public class Frame {
    public void textInFrame(String text) {
        String[] arr = text.split( " ");

        int longest = 0;
        for(String word : arr) {
            if(word.length() > longest) longest = word.length();
        }

        String border = "";
        for(int i = 0; i < longest + 4; i++) {
            border += "*";
        }

        System.out.println(border);

        for(String word : arr) {
            String line = "* " + word;
            for(int i = 0; i < longest - word.length() + 1; i++) line += " ";
            line += "*";
            System.out.println(line);
        }

        System.out.println(border);
    }
}
