package rzutmoneta;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        rzutmoneta();
    }
    public static void rzutmoneta(){
        SecureRandom random = new SecureRandom(); //generator liczb losowych
        int a = random.nextInt (3); // służy do uzyskania losowej liczby z zakresu od 0 (włącznie) do liczby przekazanej w tym argumencie
        if(a == 1){ //gdy a jest równe 1 wtedy wypadnie nam orzeł
            System.out.println("Orzeal");
        }
        else if(a == 2){ // a to gdy a jest równe 2 to wypadnie nam rzeszka
            System.out.println("Reszka");
        }
    }
}

