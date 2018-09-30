package tp_exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DataAnalyzer {

    public static void main(String[] args) {

        // Demande de saisie du chemin par l'utilisateur
        System.out.println("Veuillez saisir le nom du fichier à lire ?");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        DataSetReader dsr = new DataSetReader();

        // Boucle test afin de vérifier les exeptions
        boolean test = false;

        while (!test) {

            String str;
            str = sc.nextLine();

            try {
                double ret[] = dsr.readFile(str);
                for (int i = 0; i < ret.length; i++) {
                    System.out.println(ret[i]);
                }
                test = true;
            } catch (FileNotFoundException e) {
                System.out.println(
                        "Le fichier est introuvable ou manquant, veuillez saisir de nouveau le nom du fichier ainsi que son chemin.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
