package java;

import java.util.HashMap;

/**
 * Created by leo on 15/8/23.
 */
public class Test {
    public static void main(String[] args) {
        String s = "abrownfoxjumpsoveralazydog";
        StringBuilder targetString = null;
        while (s != null || s.length() > 0) {
            for (int i = 0, length = s.length(); i < length; i++) {
                String tempWord = new String();
                tempWord = s.substring(0, i);
                if (isExist((String)tempWord)) {
                    targetString.append(tempWord + " ");
                    s = s.substring(i);
                    break;
                }
            }
        }
        System.out.println(targetString);
    }

    public static boolean isExist(String word) {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("a", "num");
        dict.put("brown", "adj");
        dict.put("fox", "noun");
        dict.put("jump", "verb");
        dict.put("over", "pron");
        dict.put("lazy", "adj");
        dict.put("dog", "noun");

        if (dict.containsKey(word)) {
            return true;
        } else {
            if(dict.containsKey(word + "s") && dict.get(word + "s").equals("verb")) {
                return true;
            }
        }
        return false;
    }
}
