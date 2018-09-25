####################
#COMPTE RENDU DE TP#
####################


---Question 2---

On souhaite maintenant que la classe Pile puisse contenir non pas des objets de type String
mais des objets de type quelconque.

1) Quelle est la solution a mettre en oeuvre si une pile peut contenir des objets de type h�t�rog�ne ?

La classe Pile herite de la superclasse Object
On remplace le type d'objet String par Object pour pouvoir avoir des objets de type h�t�rog�ne

2) Quelle est la solution a mettre en oeuvre si une pile ne peut contenir que des objets du m�me
type ? Expliquer les modifications qui devraient alors �tre apport�es au code pr�c�dent.

On cr�e un classe g�n�rique. 
class Pile<T>{}
On instenciera un type g�n�rique ensuite.
ex : Pile<Integer> integerPile;

---Question 3---

On dispose maintenant d�une interface Pile d�finie par :
public interface IPile {
public Object depiler();
public void empiler(Object o) ;
public boolean estVide();
}

1) Quelle est la diff�rence entre cette interface et les classes discut�es dans la question
pr�c�dente?

L'interface est une classe abstraite, ces m�thodes seront red�finies dans les classes filles

2) Quels sont les avantages et les inconv�nients de la solution offerte par l�interface ?

- permet de factoriser du code 
- aspect g�n�rique des objets
- il faudra ajouter des m�thodes dans les classes filles en fonction des objets