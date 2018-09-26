package td_pile;

import java.io.IOException;

public class PileTest {

    public static void main(String[] args) {
        System.out.println("---Test estVide()---");
        testEstVide();
        System.out.println("---Test getSommet()---");
        testGetSommet();
        System.out.println("---Test empiler()---");
        testEmpiler();
        System.out.println("---Test depiler()---");
        testDepiler();
        System.out.println("---Test getTaille()---");
        testGetTaille();
        System.out.println("---Test lirePile()---");
        testLirePile();
        System.out.println("---Test ecrirePile()---");
        testEcrirePile();
        System.out.println("---Test ecrireObject()---");
        testEcrireObject();
        System.out.println("---Test lireObject()---");
        testLireObject();
    }

    private static void testEcrireObject() {
        Pile<String> pile = new Pile<String>();
        pile.empiler("binaire");
        try {
            pile.ecrireObject(
                    "C:\\Users\\stuff\\eclipse-workspace\\UE-1_reutil\\src\\ws\\pile3.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Test ok");
    }

    private static void testLireObject() {
        Pile<String> pile = new Pile<String>();
        try {
            System.out.println(pile.lireObject(
                    "C:\\Users\\stuff\\eclipse-workspace\\UE-1_reutil\\src\\ws\\pile3.bin")
                    .getListStr());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Test ok");
    }

    private static void testLirePile() {
        Pile<String> pile = new Pile<String>();
        pile.lirePile(
                "C:\\Users\\stuff\\eclipse-workspace\\UE-1_reutil\\src\\ws\\pile1.txt");
        System.out.println(pile.getListStr());
    }

    private static void testEcrirePile() {
        Pile<String> pile = new Pile<String>();
        pile.empiler("hello\n");
        pile.empiler("bonjour\n");
        pile.empiler("hola\n");
        pile.empiler("bonjorno\n");
        pile.ecrirePile(
                "C:\\Users\\stuff\\eclipse-workspace\\UE-1_reutil\\src\\ws\\pile2.txt");
        System.out.println("Test ok");
    }

    private static void testGetTaille() {
        Pile<String> pile = new Pile<String>();
        pile.empiler("test1");
        pile.empiler("test2");
        if (pile.getTaille() == 2) {
            System.out.println("Test réussi");
        } else {
            System.out.println("Echec du test");
        }
    }

    private static void testDepiler() {
        Pile<String> pile = new Pile<String>();
        pile.empiler("test1");
        pile.empiler("test2");
        pile.depiler();
        if (pile.getSommet().equals("test1")) {
            System.out.println("Test réussi");
        } else {
            System.out.println("Echec du test");
        }

    }

    private static void testEmpiler() {
        Pile<String> pile = new Pile<String>();
        pile.empiler("test");
        if (pile.getSommet().equals("test")) {
            System.out.println("Test réussi");
        } else {
            System.out.println("Echec du test");
        }

    }

    private static void testGetSommet() {
        Pile<String> pile = new Pile<String>();
        pile.empiler("test1");
        pile.empiler("test2");
        if (pile.getSommet().equals("test2")) {
            System.out.println("Test réussi");
        } else {
            System.out.println("Echec du test");
        }

    }

    private static void testEstVide() {
        Pile<String> pile = new Pile<String>();
        if (pile.estVide() == true) {
            System.out.println("Test réussi");
        } else {
            System.out.println("Echec du test");
        }

    }

}
