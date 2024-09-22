public class PrintHelloWorld {
    public String encrypt(String text) {
        StringBuilder rail1 = new StringBuilder();
        StringBuilder rail2 = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                rail1.append(text.charAt(i));
            } else {
                rail2.append(text.charAt(i));
            }
        }
        return rail1.toString() + rail2.toString();
    }

    public static void main(String[] args) {
        PrintHelloWorld railfence = new PrintHelloWorld();

        String plainText = "UNIVERSITY";

        String cipherText = railfence.encrypt(plainText.toUpperCase());

        System.out.println("Cipher Text: " + cipherText);
    }
}

