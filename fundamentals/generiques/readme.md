TP : créer un Panier qui accepte plusieurs types



- on ne vas pas utiliser de l'heritage pour avoir un panier par produit
- on doit etre capable de gerer differents types dans une meme classe

Pour la création d'une classe generique utiliser le keyword <E>

E : pour un type qu'on connais pas

une fois le code compilé il  y pas de symnbole, aucune trace qu'il a  eu un generique.



<E>

- on peut preciser 2 generiques a  la classe
<E1, E2>

```java

    public Basket(E item, E2 item2) {
        this.item = item;
    }
```


wildcards :
addAll : (Collection<? extends E>
```java

public class Basket(? extends Vegetable)
{...}
```
- Pour seulement les classes qui derivent de Vegetable

source:
https://www.youtube.com/watch?v=QWn_KHeUKfA&list=PLrSOXFDHBtfHkq8dd3BbSaopVgRSYtgPv&index=29&ab_channel=FormationVid%C3%A9o


2. aytre usage wildcard


printLists

```java
    public static void printList(List<?> li)
    {
        for(Object o : li)
            System.out.println("> "+ o);
    }
```


3. DETAILS
l'heritage n'existe pas
si on veut passer un type doit etre objet, pas primitive
        // Basket<Integer>
