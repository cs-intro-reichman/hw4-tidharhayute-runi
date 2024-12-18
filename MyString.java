public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        System.out.println(contains("resignation", "sign")); // true

        System.out.println("Test 1 (contains 'baba'): " + contains("baba yaga", "baba"));
        System.out.println("Test 2 (contains empty string): " + contains("baba yaga", ""));
        System.out.println("Test 3 (contains 'John Wick is the baba yaga'): " + !contains("baba yaga", "John Wick is the baba yaga"));
        System.out.println("Test 4 (contains 'Yaga'): " + !contains("baba yaga", "Yaga"));
        System.out.println("Test 5 (contains 'babayaga'): " + !contains("baba yaga", "babayaga"));
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) { 
				if ((int) str.charAt(i) > 64 && (int) str.charAt(i) < 91) newStr = newStr + (char) (str.charAt(i) + 32);
				else newStr = newStr + str.charAt(i);

        }

        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);

        if(str2 == "") return true;

        if (str2.length() > str1.length()) return false;

        int count = 0;
        int j = 0;
        int temp = 0;

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            j = 0;
            count = 0;
            temp = i;

            while (j < str2.length() && temp < str1.length() && str1.charAt(temp) == str2.charAt(j)) {
                count++;
                j++;
                temp++;
            }

            if (count == str2.length()) return true;
        }

        return false;
    }
}
