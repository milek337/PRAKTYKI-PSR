package szyfrcezara;

import java.util.Scanner;

public class Main {


        //Funkcja ktora koduje tekst do szyfru cezara
        public static String code(String szyfrowanko){

            
            char[] tab = szyfrowanko.toCharArray();

            //Pętla przechodząca przez wszystkie elementy tablicy char
            for (int i = 0; i < szyfrowanko.length() ; i++) {

                //Argument ktoryu pokazuje duze i male litery
                if ((tab[i] >= 65 && tab[i] <= 90) || (tab[i] >= 97 && tab[i] <= 122)) {

                    //duze X zamienia się na duze A
                        //duze Y zamienia się na duze B
                    if (tab[i] == 'Y') {
                        tab[i] = 'B';
                    }
                    //duze X zamienia się na duze A
                    else if (tab[i] == 'X') {
                        tab[i] = 'A';
                    }
                    //duze Z zamienia się na duze C
                    else if (tab[i] == 'Z') {
                        tab[i] = 'C';
                    }
                    //małe x zamienia się na małe a
                    else if (tab[i] == 'x') {
                        tab[i] = 'a';
                    }
                    //male y zamienia się na male b
                    else if (tab[i] == 'y') {
                        tab[i] = 'b';
                    }
                    //male z zamienia się na male c
                    else if (tab[i] == 'z') {
                        tab[i] = 'c';
                    }
                    //kazda inna litera idzie o 3 miejsca dalej
                    else {
                        tab[i] += 3;
                    }
                }
            }
            //Konwersja tablicy char na stringa
            String result = String.valueOf(tab);
            return result;
        }
        
        public static void main(String[] args) {

            //do czego sluzy program
            System.out.println("jest to program, który szyfruje tekst");

            //napisanie tekstu ktory ma byc zaszyfrowany
            System.out.println("wpisz swoj tekst, ktory ma byc zaszyfrowany ");

            //Ustawienie skanera zeby zczytywal nasx tekst
            Scanner sc = new Scanner(System.in);
            String txt = sc.nextLine();

            
            String result = code(txt);

          //wypsamoe zaszyfrowanewgo tekstu
            System.out.println("twoj zaszyfrowany tekst: " + result);

        }
    }
