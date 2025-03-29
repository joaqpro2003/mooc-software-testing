package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift) {
        if (message == null) {
            return "invalid";
        }
        StringBuilder sb = new StringBuilder();
        shift = shift % 26;  // Normaliza el desplazamiento

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            // Permitir espacios sin cifrar
            if (currentChar == ' ') {
                sb.append(' ');
            }
            // Solo se permiten letras minúsculas (entre 'a' y 'z')
            else if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            } else {
                int shifted = currentChar + shift;
                if (shifted > 'z') {
                    shifted -= 26;
                } else if (shifted < 'a') {
                    shifted += 26;
                }
                sb.append((char) shifted);
            }
        }
        return sb.toString();
    }
}
