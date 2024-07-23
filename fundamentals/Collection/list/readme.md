@23

- stack eteint vector
- ces collections sont de caracter ordonnée
- Accepter les doublons et valeurs null

* ArrayList: mono-thread, accès directe, optimisée pour la lecture
* LinkedList: pas d'acces directe (il faut parcourir), insertion rapide (optimisé pour l'écriture)
* Vector: multi-thread, eviter dans un env monothread sinon on perd on performance, acces directe, optimisé pour la lecture
* Stack: pas d'acces directe


tableau permettent de stocker des info de façon fixe

taille dynamique, qui peut evoluer au fur et mesure de l'execution du programme


arrayList c'est de tableau mais a taille dynamique


* ODANS LES COLLECTIONS 2 INFO SONT IMPORTANTES
2. La capacité != Taille

capacité : les nombre d'emplacement disponible pour la collection

c'est sont de collection dynamique (la vm va pouvoir allouer de l'espace supplementaire pour rajouter un nouveu element) comme il y a de nouveu allocation a faire sera de traitement supplementaire.

Il vaut mieux de rajouter une taille qu'on sait, ce qui permet d'eviter de traitements supplementaires

taille : nombre d'elements.
capacite : nombre d'emplacement



## QUELQUES METHODES :
add(),
addAll (fussionner des collections)
remove()
clear() -> effacer



```!IMPORTANT si une collection leve une exception, il faudra bien gerer ça avec un try catch!```


