package tp_exception;

import java.io.IOException;
import java.util.Scanner;

public class DataSetReader {

    /**
     * attribut d'instance data un tableau de double
     */
    private double[] data;

    /**
     * méthode qui lit un ensemble de données et retourne les données du ficher
     * dans une tableau de double
     * 
     * @param filename
     *            le chemin du fichier
     * @return data tableau de double
     * @throws IOException
     */
    public double[] readFile(String filename) throws IOException {

        // TODO
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
        // TODO

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
        // TODO

    }
}
