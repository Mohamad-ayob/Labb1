package uppgift1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        tomorse morse =new tomorse();
        toenglish english=new toenglish();

        System.out.println("Välj 1 om du vill översätta engliska till morsekode");
        System.out.println("Välj 2 om du vill översätta morsekode till engliska");
        boolean fors=true;
        while(fors) {
            int val = scan.nextInt();
            scan.nextLine();

            if (val == 1) {
                System.out.println("Skriv in engleska ordet som du vill översätta till morse");
                String englishtext = scan.nextLine();
                morse.översättTillMorse(englishtext);
                fors=false;
            } else if (val == 2) {
                System.out.println("Skriv in morse ordet som du vill översätta till engleska");
                String englishtext = scan.nextLine();
                english.översättTillenglish(englishtext);
                fors=false;
            } else {
                System.out.println("välj 1 eller 2");
            }

        }

    }

}
