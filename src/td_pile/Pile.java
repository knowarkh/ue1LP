package td_pile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Classe Pile
 * 
 * @author aco
 */
public class Pile<T> implements IPile<T>, Serializable {

    /**
     * Ces classes nécessitent que l’objet a lire ou écrire puisse subir une
     * sérialisation, et qu’il implémente donc l’interface Serializable.
     */
    private static final long serialVersionUID = 1L;

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
     * méthode String depiler() qui retire le sommet de la pile et le retourne
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
     * méthode taille qui retourne le nombre d’éléments contenus dans la pile
     * 
     * @return int taille de la liste
     */
    public int getTaille() {
        return this.listStr.size();
    }

    /**
     * lire son contenu depuis un fichier texte passé en paramètre.
     * 
     * @param leFichier
     *            chemin du fichier txt
     */
    @SuppressWarnings("unchecked")
    public void lirePile(String leFichier) {
        if (this.listStr != null) {
            String content = "";
            try {
                content = new String(Files.readAllBytes(Paths.get(leFichier)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] piles = content.split("\r\n");
            for (String tmp : piles) {
                this.listStr.add((T) tmp);
            }
        } else {
            System.out.println("La pile est nulle");
        }
    }

    /**
     * écrire son contenu dans un fichier texte passé en paramètre
     * 
     * @param leFichier
     *            chemin du fichier txt
     */
    public void ecrirePile(String leFichier) {
        if (this.listStr != null) {
            File f1 = new File(leFichier);
            FileWriter fw = null;
            try {
                fw = new FileWriter(f1);
                for (T record : this.listStr) {
                    // laisser loop dans bloc try car
                    // write > IOException
                    // System.out.println((String)record);
                    fw.write((String) record);
                }
                fw.flush();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("La pile est nulle");
        }
    }

    /**
     * méthode pour pouvoir sauvegarder un objet Pile dans un fichier binaire
     * 
     * @param chemin
     *            du fichier bin
     * @throws IOException
     */
    public void ecrireObject(String chemin) throws IOException {
        if (this.listStr != null) {
            try {
                FileOutputStream fout = new FileOutputStream(chemin);
                ObjectOutputStream oout = new ObjectOutputStream(fout);
                oout.writeObject(this);
                System.out.println("serialisation ok");
                oout.close();
                fout.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    /**
     * méthode pour pouvoir le relire pour instancier un nouvel objet de type
     * Pile
     * 
     * @param chemin
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public Pile<String> lireObject(String chemin) throws IOException {
        Pile<String> p = null;
        if (this.listStr != null) {
            try {
                FileInputStream fin = new FileInputStream(chemin);
                ObjectInputStream oin = new ObjectInputStream(fin);
                p = (Pile<String>) oin.readObject();
                System.out.println("deserialisation ok");
                oin.close();
                fin.close();
            } catch (ClassNotFoundException nfe) {
                nfe.printStackTrace();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return p;
    }
}
