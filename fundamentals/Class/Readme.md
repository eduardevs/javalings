# CLASS

this (l'objet en cours)
usage pour pointer et acceder aux attributs



# ENCAPSULATION DES DONNÉES

* access modifiers :
 private = l'access est seulement depuis la classe même
public = l'access est ouvert entierement
protected = permet l'acces seulement depuis la classe meme et ses enfants

- Si on veut retourner rien dans un accesseur on utilise void :
```java
public void setExpirationYear(){
    return;
}
```

- variable de classe
```java
private static int numberOfRegistrations = 5;
```

```java
    public SoftwareRegistration(int expiration) {
        if(numberOfRegistrations > 0) {
            this.expirationYear = expiration;
            numberOfRegistrations--;

            System.out.println("Logiciel valide (expiration : " + this.expirationYear + ")");
            System.out.println("enregistrements restants : "+ numberOfRegistrations);
        } else {
            System.out.println("expired number of enregistrements");
        }
    }

    public static int getNumberOfRegistrations(){
        return numberOfRegistrations;
    }
```

- On instancie la classe plusieurs fois et on peut voir : -> exemple-encapsulation-des-données.png

- static pour eviter la création de getNumberOfRegistrations


- * variable de classe n'utilise pas this,
est commune à toutes les instsances crée.
static 

- on met tout en privé, on passe par des accesseurs

# CLASSES ABSTRAITES
- les classes abstraites peuvent heriter les des autres.

```java
abstract public class LivingSpecies {
    protected String mName;

    public String whoAmI()
    {
        return mName;
    }

    abstract public void eat();
    abstract public void speak();

}

public class Tiger extends LivingSpecies {
    public Tiger(){
        mName = "Tigre";
    }
}
```
- A l'instanciation et appel de la methode suivante :
ti.whoAmI()
- *Erreur : tiger is not abstract and does not ovveride abstract method speak() in LivingSpecies

- des qu'on a des méthodes abstraits,
ceci force à implementer ces méthodes dans la classe concrete.
ON DOIT IMPLEMENTER LES MÉTHODES ABSTRAITE DANS LA CLASSE CONCRETE
...
Tigre.java
```java
    public void speak(){
        // System.out... "je mange de la viande"
    }
    public void speak(){
        // System.out... "je rugis"
    }
```
lavantage des classes abstraites, si on veut creer qlq chose de concret, a la compilation on aura des erreur qui nous permettent de pas oublier des specifications de la classe mere.
On peut factoriser du code => passer une propriete ou comportement qui se repete à un niveau plus generale (classe abstraite) pour eviter la repetion de code dans les cas plus précis (classe concrete)

classe abstraite :
factoriser du code par rapport a des classes concrete qui sont etroitement liées (qui peuvent avoir des element commun)

EXCEPTION:
si il y a une classe enfant qui change le comportement, qui est hériter par la classe abstraite, il faut l'override.



# INTERFACES
Quand on a des comportements qui peuvent etre partagés entre classes concretes, on peut penser à creer une classe abstraite, mais si elle sont pas liées, comme une maison et un vehicule, alors ceci ne sera pas possible. Ce là quand on doit implementer une interface, (c'est un contrat qui permet d'engager et repandre un comportement)
 au lieu de l'heritage ce sera de l'implementation

 surcouche d'abstration, sans se poser la question de comment le faire, c'est à la classe de gerer ça (la façon de comment le faire).

couche d'abstration qui etabli un contrat et qu'on peut implementer dans n'importe quel classe, qui aurait besoin de ce comportement.


interfaces exmple en java:
interface Comparable<T> : permet de comparer des elements de ce type.
- souvent les inteerfaces en java terminent par able. (seriable, )

- le comoprtement cest seulement public



