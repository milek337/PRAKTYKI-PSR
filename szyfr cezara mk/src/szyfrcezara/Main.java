package szyfrcezara;

import java.util.Scanner;

public class Main {


        //Funkcja kodująca text do szyfru cezara
        public static String code(String szyfrowanko){

            //Tablioca Char
            char[] tab = szyfrowanko.toCharArray();

            //Pętla przechodząca przez wszystkie elementy tablicy char
            for (int i = 0; i < szyfrowanko.length() ; i++) {

                //Argument który pokazuje litery małe i duże
                if ((tab[i] >= 65 && tab[i] <= 90) || (tab[i] >= 97 && tab[i] <= 122)) {

                    //Ustalenie że X zamienia się na A
                    if (tab[i] == 'X') {
                        tab[i] = 'A';
                    }
                    //Ustalenie że Y zamienia się na B
                    else if (tab[i] == 'Y') {
                        tab[i] = 'B';
                    }
                    //Ustalenie że Z zamienia się na C
                    else if (tab[i] == 'Z') {
                        tab[i] = 'C';
                    }
                    //Ustalenie że x zamienia się na a
                    else if (tab[i] == 'x') {
                        tab[i] = 'a';
                    }
                    //Ustalenie że y zamienia się na b
                    else if (tab[i] == 'y') {
                        tab[i] = 'b';
                    }
                    //Ustalenie że z zamienia się na c
                    else if (tab[i] == 'z') {
                        tab[i] = 'c';
                    }
                    //Ustalenie że każda inna litera zmienia się na litere o 3 miejsca dalej
                    else {
                        tab[i] += 3;
                    }
                }
            }
            //Konwersja tablicy char z powrotem na string
            String result = String.valueOf(tab);
            return result;
        }
        //Główna część programu
        public static void main(String[] args) {

            //Wypisanie do czego służy pogram
            System.out.println("jest to program, który szyfruje tekst");

            //Prośba o wpisanie tekstu
            System.out.println("prosze wpisz tekst ");

            //Ustawienie skanera aby zczytywał nasz tekst
            Scanner sc = new Scanner(System.in);
            String txt = sc.nextLine();

            //Wywołanie funkcji
            String result = code(txt);

            //Wypisanie tekstu zaszyfrowanego
            System.out.println("twoj zaszyfrowany tekst: " + result);

        }
    }