
import java.util.*;

public class Deck {
    //Atributos
    private ArrayList<Card> Cards;
    private ArrayList<Card> iniCards;

    //Metodos
    public Deck() {
        System.out.println("Ejecuciòn del mètodo constructor del deck");
        // Agrega las 52 cartas iniciales y ordenadas
        // - Crea Atributo iniCards
        iniCards = new ArrayList<Card>();
        Card carta;
        String valor;
        // - Agrega los treboles
        for (int i=2; i<=10; i++) {
            valor = String.valueOf(i);
            carta = new Card("trebol","negro",valor);
            iniCards.add(carta);
        }
        carta = new Card("trebol","negro","A");
        iniCards.add(carta);
        carta = new Card("trebol","negro","J");
        iniCards.add(carta);
        carta = new Card("trebol","negro","Q");
        iniCards.add(carta);
        carta = new Card("trebol","negro","K");
        iniCards.add(carta);
        // - Agrega los diamante
        for (int i=2; i<=10; i++) {
            valor = String.valueOf(i);
            carta = new Card("diamante","rojo",valor);
            iniCards.add(carta);
        }
        carta = new Card("diamante","rojo","A");
        iniCards.add(carta);
        carta = new Card("diamante","rojo","J");
        iniCards.add(carta);
        carta = new Card("diamante","rojo","Q");
        iniCards.add(carta);
        carta = new Card("diamante","rojo","K");
        iniCards.add(carta);
        // - Agrega los picas
        for (int i=2; i<=10; i++) {
            valor = String.valueOf(i);
            carta = new Card("pica","negro",valor);
            iniCards.add(carta);
        }
        carta = new Card("pica","negro","A");
        iniCards.add(carta);
        carta = new Card("pica","negro","J");
        iniCards.add(carta);
        carta = new Card("pica","negro","Q");
        iniCards.add(carta);
        carta = new Card("pica","negro","K");
        iniCards.add(carta);
        // - Agrega los corazones
        for (int i=2; i<=10; i++) {
            valor = String.valueOf(i);
            carta = new Card("corazon","rojo",valor);
            iniCards.add(carta);
        }
        carta = new Card("corazon","rojo","A");
        iniCards.add(carta);
        carta = new Card("corazon","rojo","J");
        iniCards.add(carta);
        carta = new Card("corazon","rojo","Q");
        iniCards.add(carta);
        carta = new Card("corazon","rojo","K");
        iniCards.add(carta);

        System.out.println("inicializa las 52 cartas de poker");

    }

    public void shuffle() {
        System.out.println("Ejecuciòn del mètodo shuffle del deck");
        // - Crea Atributo iniCards
        Cards = new ArrayList<Card>();
        ArrayList<Integer> list = uniqueRandomNumber(0, iniCards.size()-1);
        Card carta;
        for (int i=0; i<=iniCards.size()-1; i++) {
            carta = iniCards.get(list.get(i));
            Cards.add(carta);
        }

        System.out.println("Se mezclò el Deck");

    }

    public Card head() {
        System.out.println("Ejecuciòn del mètodo head del deck");
        Card carta = Cards.get(0);
        Cards.remove(0);
        carta.print();
        System.out.println("Quedan " + Cards.size() + " cartas");
        return carta;
    }

    public Card pick() {
        System.out.println("Ejecuciòn del mètodo pick del deck");
        Random random = new Random();
        int pos = random.nextInt(Cards.size()-1);
        Card carta = Cards.get(pos);
        Cards.remove(0);
        carta.print();
        System.out.println("Quedan " + Cards.size() + " cartas");
        return carta;
    }

    public ArrayList<Card> hand() {
        System.out.println("Ejecuciòn del mètodo hand del deck");
        ArrayList<Card> listaCartas = new ArrayList<Card>();
        Card carta;
        for (int i = 1; i<= 5; i++) {
            carta = Cards.get(0);
            Cards.remove(0);
            carta.print();
            listaCartas.add(carta);
        }
        System.out.println("Quedan " + Cards.size() + " cartas");
        return listaCartas;
    }

    private static ArrayList<Integer> uniqueRandomNumber(int min, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=min; i<=max; i++) {
            list.add(i);
            // list.add(new Integer(i));
        }
        Collections.shuffle(list);
        return  list;
    }
}
