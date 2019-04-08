public class CeaserCipherr {
    private static String plainText;
    private int shiftKey;

    public static String encrypt(String getplainText, int shiftKey) {

        plainText = getplainText;
        String cipherrText = "";

        if (shiftKey > 26) {
            shiftKey = (shiftKey % 26);
        } else if (shiftKey < 0) {
            shiftKey = (shiftKey % 26) + 26;
        }


        for (int i = 0; i < plainText.length(); i++) {
            if (Character.isLetter(plainText.charAt(i))) {
                if (Character.isLowerCase(plainText.charAt(i))) {
                    char ciphered_letter = (char) (plainText.charAt(i) + shiftKey);
                    if (ciphered_letter > 'z') {
                        cipherrText += (char) (plainText.charAt(i) - (26 - shiftKey));

                    } else {
                        cipherrText += ciphered_letter;
                    }
                } else if (Character.isUpperCase(plainText.charAt(i))) {
                    char ciphered_letter = (char) (plainText.charAt(i) + shiftKey);
                    if (ciphered_letter > 'Z') {
                        cipherrText += (char) (plainText.charAt(i) - (26 - shiftKey));
                        ;
                    } else {
                        cipherrText += ciphered_letter;
                    }
                }

            } else {
                cipherrText += plainText.charAt(i);
            }

        }
        return cipherrText;

    }

    public static String decrypt(String getplainText, int shiftKey) {
        plainText = getplainText;
        String cipherText = "";

        if (shiftKey > 26) {
            shiftKey = (shiftKey % 26);
        } else if (shiftKey < 0) {
            shiftKey = (shiftKey % 26) + 26;
        }


        for (int i = 0; i < plainText.length(); i++) {
            if (Character.isLetter(plainText.charAt(i))) {
                if (Character.isLowerCase(plainText.charAt(i))) {
                    char ciphered_letter = (char) (plainText.charAt(i) - shiftKey);
                    if (ciphered_letter < 'a') {
                        cipherrText += (char) (plainText.charAt(i) + (26 - shiftKey));

                    } else {
                        cipherrText += ciphered_letter;
                    }
                } else if (Character.isUpperCase(plainText.charAt(i))) {
                    char ciphered_letter = (char) (plainText.charAt(i) - shiftKey);
                    if (ciphered_letter < 'A') {
                        cipherrText += (char) (plainText.charAt(i) + (26 - shiftKey));
                        ;
                    } else {
                        cipherrText += ciphered_letter;
                    }
                }

            } else {
                cipherrText += plainText.charAt(i);
            }

        }
        return cipherrText;


    }

}
