package Praktika_26_08_24;

public class deleteLetter {

    public static void main(String[] args) {

        System.out.println(removeDupLicateChars("abcabc"));

    }


    public static String removeDupLicateChars(String string) {

        char[] chars = string.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            if (result.indexOf(chars[i]) == -1) {
                result += chars[i];
            }
        }
        return result;

    }


}
