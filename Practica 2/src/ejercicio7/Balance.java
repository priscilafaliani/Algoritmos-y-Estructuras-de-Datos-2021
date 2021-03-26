package ejercicio7;

import ejercicio6.PilaGenerica;
import listas.genericas.ListaEnlazadaGenerica;

public class Balance {

    // el ordén en que se reciben los '(', ')', '{', '}', '[', ']' importa
    // si recibe ->> char1 = ')' y char2 = '(' va a retornar false
    public static boolean sonPares(char char1, char char2) {
        if ((char1 == '(') && (char2 == ')')) {
            return true;
        }
        if ((char1 == '{') && (char2 == '}')) {
            return true;
        }
        if ((char1 == '[') && (char2 == ']')) {
            return true;
        }

        return false;
    }

    public static boolean esBalanceado(String str) {
        PilaGenerica<Character> caracteres = new PilaGenerica<>(new ListaEnlazadaGenerica<>());

        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if ((c == '(') || (c == '{') || (c == '[')) {
                caracteres.apilar(c);
            } else if (!sonPares(caracteres.desapilar(), c)) {
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String balanceado = "{()[()]}";
        String desbalanceado = "([)]";

        System.out.println("El string es balanceado?: " + esBalanceado(balanceado));
        System.out.println("El string2 es balanceado?: " + esBalanceado(desbalanceado));
    }

}
