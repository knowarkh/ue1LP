package tp_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Classe DataSetReader
 * 
 * @author aco
 */
public class DataSetReader {

    /**
     * attribut d'instance data un tableau de double
     */
    private double[] data;

    /**
     * méthode qui lit un ensemble de données et retourne les données du fichier
     * dans une tableau de double
     * 
     * @param filename
     *            le chemin du fichier
     * @return data tableau de double
     * @throws IOException
     */
    public double[] readFile(String filename) throws IOException {

        try {
            File file = new File(filename);
            Scanner scan = new Scanner(file);
            readData(scan);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return this.data;
    }

    /**
     * méthode privée qui lit toutes les données avec le Scanner passé en
     * paramètre.
     * 
     * @param in
     *            scanner
     * @throws BadDataException
     */
    private void readData(Scanner in) throws BadDataException {

        if (in.hasNextInt()) {
            int cpt = in.nextInt();
            this.data = new double[cpt];
            for (int i = 0; i < cpt; i++) {
                readValue(in, i);
            }
        } else {
            throw new BadDataException(
                    "La premiere ligne du fichier doit etre un entier qui donne le nombre de lignes du fichier. Veuillez saisir à nouveau le nom d'un fichier et son chemin.");
        }

    }

    /**
     * méthode privée qui lit une valeur de donnée avec le Scanner et la place
     * dans le tableau data à l'indice i
     * 
     * @param in
     *            scanner
     * @param i
     *            indice du tableau data
     * @throws BadDataException
     */
    private void readValue(Scanner in, int i) throws BadDataException {

        if (in.hasNextInt()) {
            this.data[i] = in.nextInt();
        } else {
            throw new BadDataException(
                    "Le contenu du fichier ne correspond pas a des entiers. Veuillez saisir à nouveau le nom d'un fichier et son chemin.");
        }
    }
}
