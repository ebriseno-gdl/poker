public class Card {

    //Atributos
    private String Palo;
    private String Color;
    private String Valor;

    //Metodos

    public Card(String palo, String color, String valor) {
        this.Palo = palo;
        this.Color = color;
        this.Valor = valor;
    }

    public void print() {
        System.out.println(this.Palo + "," + this.Color + "," + this.Valor);

    }
}
