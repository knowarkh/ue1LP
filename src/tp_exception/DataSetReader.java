package tp_exception;

import java.io.IOException;
import java.util.Scanner;

public class DataSetReader {

    /**
     * attribut d'instance data un tableau de double
     */
    private double[] data;

    /**
     * m�thode qui lit un ensemble de donn�es et retourne les donn�es du ficher
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
     * m�thode priv�e qui lit toutes les donn�es avec le Scanner pass� en
     * param�tre.
     * 
     * @param in
     *            scanner
     * @throws BadDataException
     */
    private void readData(Scanner in) throws BadDataException {
        // TODO

    }

    /**
     * m�thode priv�e qui lit une valeur de donn�e avec le Scanner et la place
     * dans le tableau data � l'indice i
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
