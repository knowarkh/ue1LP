####################
#COMPTE RENDU DE TP#
####################


---Question 2---

On souhaite maintenant que la classe Pile puisse contenir non pas des objets de type String
mais des objets de type quelconque.

1) Quelle est la solution a mettre en oeuvre si une pile peut contenir des objets de type hétérogène ?

La classe Pile herite de la superclasse Object
On remplace le type d'objet String par Object pour pouvoir avoir des objets de type hétérogène

2) Quelle est la solution a mettre en oeuvre si une pile ne peut contenir que des objets du même
type ? Expliquer les modifications qui devraient alors être apportées au code précédent.

On crée un classe générique. 
class Pile<T>{}
On instenciera un type générique ensuite.
ex : Pile<Integer> integerPile;

---Question 3---

On dispose maintenant d’une interface Pile définie par :
public interface IPile {
public Object depiler();
public void empiler(Object o) ;
public boolean estVide();
}

1) Quelle est la différence entre cette interface et les classes discutées dans la question
précédente?

L'interface est une classe abstraite, ces méthodes seront redéfinies dans les classes filles

2) Quels sont les avantages et les inconvénients de la solution offerte par l’interface ?

- permet de factoriser du code 
- aspect générique des objets
- il faudra ajouter des méthodes dans les classes filles en fonction des objets