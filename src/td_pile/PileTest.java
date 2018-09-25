package td_pile;

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
