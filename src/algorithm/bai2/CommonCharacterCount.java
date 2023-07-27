package algorithm.bai2;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacterCount {
    public static void main(String[] args) {
        String str1 = "Abc";
        String str2 = "ade";
        System.out.println(commonCharacterCount(str1, str2));

    }

    public static int commonCharacterCount(String str1, String str2) {
        List<Character> characterList1 = new ArrayList<>();
        List<Character> characterList2 = new ArrayList<>();
        List<Character> characterList3 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            characterList1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            characterList2.add(str2.charAt(i));
        }
        for (int i = 0; i < characterList1.size(); i++) {
            for (int j = 0; j < characterList2.size(); j++) {
                if (characterList1.get(i).equals(characterList2.get(j))) {
                    characterList3.add(characterList1.get(i));
                    characterList2.remove(characterList2.get(j));

                }
            }
        }
        return characterList3.size();
    }
}
