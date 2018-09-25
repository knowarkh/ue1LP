package td_pile;

import java.util.ArrayList;

/**
 * Classe Pile
 * 
 * @author aco
 */
public class Pile<T> implements IPile<T> {

    /**
     * Attribut de classe
     */
    private ArrayList<T> listStr;

    /**
     * Constructeur de classe
     */
    public Pile() {
        this.listStr = new ArrayList<T>();
    }

    /**
     * Accesseur
     * 
     * @return la liste
     */
    public ArrayList<T> getListStr() {
        return listStr;
    }

    /**
     * Modificateur
     * 
     * @param listStr
     */
    public void setListStr(ArrayList<T> listStr) {
        this.listStr = listStr;
    }

    /**
     * méthode estVide qui permet de vérifier si la pile est vide
     * 
     * @param liste
     * @return boolean si la liste est vide
     */
    public boolean estVide() {
        return this.listStr.size() == 0;
    }

    /**
     * méthode sommet qui retourne l’objet String au sommet de la pile
     * 
     * @return String le sommet
     */
    public T getSommet() {
        T rep = null;
        if (this.listStr != null && !this.listStr.isEmpty()) {
            rep = this.listStr.get(this.listStr.size() - 1);
        }
        return rep;
    }

    /**
     * méthode void empiler(String s) qui ajoute s a la pile
     * 
     * @param s
     */
    public void empiler(T t) {
        this.listStr.add(t);
    }

    /**
     * une méthode String depiler() qui retire le sommet de la pile et le
     * retourne
     * 
     * @return String le sommet
     */
    public T depiler() {
        T rep = null;
        if (this.listStr != null && !this.listStr.isEmpty()) {
            rep = this.getSommet();
            this.listStr.remove(rep);
        }
        return rep;

    }

    /**
     * une méthode taille qui retourne le nombre d’éléments contenus dans la
     * pile
     * 
     * @return int taille de la liste
     */
    public int getTaille() {
        return this.listStr.size();
    }

    public void ecrirePile(String leFichier) {
        // this.listStr = (ArrayList<T>) new ArrayList<String>();
        // boolean eof = false;
        //
        // String header;
        // String[] decoup = null;
        // String[] decoup2 = null;
        //
        // String tmp;
        // BufferedReader tampon;
        // try {
        // tampon = new BufferedReader(new FileReader(leFich));
        //
        // header = tampon.readLine();
        // decoup = header.split(" / ");
        // this.leTitreCD = decoup[0];
        // this.lInterpreteCD = decoup[1];
        //
        // while (!eof) {
        // tmp = tampon.readLine();
        //
        // if (tmp == null) {
        // eof = true;
        // } else {
        //
        // decoup2 = tmp.split(" / ");
        // Duree d = new Duree(0, Integer.parseInt(decoup2[2]),
        // Integer.parseInt(decoup2[3]));
        // Plage p = new Plage(d, decoup2[0], decoup2[1]);
        // lesPlages.add(p);
        // }
        // }
        // tampon.close();
        // } catch (FileNotFoundException e) {
        // System.out
        // .println("Le fichier n'a pas été trouvé " + e.getMessage());
        // } catch (IOException e) {
        // System.out.println("Erreur lors de la lecture " + e.getMessage());
        // }
    }
}
