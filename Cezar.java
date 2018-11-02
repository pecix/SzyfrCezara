public class Cezar {

    private char shift;

    public Cezar(char shift) {
        this.shift = (char) (shift % ('Z' - 'A' + 1));
    }

    public String cipher(String message) {
        return move(message, shift);
    }

    public String decipher(String message) {
        return move(message, (char) -shift);
    }

    private String move(String message, char shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : message.toUpperCase().toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                char out = (char) (ch + shift);
                if (out > 'Z') {
                    out = (char) (out - 'Z' + 'A' - 1);
                } else if (out < 'A') {
                    out = (char) (out + 'Z' - 'A' + 1);
                }
                result.append(out);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Cezar cezar = new Cezar((char) 5);
        System.out.println(cezar.cipher("Ala ma kota, a kot ma Ale"));
        System.out.println(cezar.decipher("FQF RF PTYF"));
    }
}
