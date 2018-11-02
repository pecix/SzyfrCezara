public class SzyfrCezara {

    static String input = "ALA MA KOTA ZZZZZ";
    static int shift = 3;

    static char c = input.charAt(0);
    static char[] cArray = input.toCharArray();

    public static void main(String[] args) {
        System.out.println(cArray);

        for (int i = 0; i < cArray.length; i++) {
            if (cArray[i] >= 65 && cArray[i] <= 90) {
                if (cArray[i] + shift > 90) {
                    System.out.print(Character.toChars(cArray[i] + shift - 26));
                } else {
                    System.out.print(Character.toChars(cArray[i] + shift));
                }
            } else {
                System.out.print(Character.toChars(cArray[i]));
            }
        }
    }
}


