
STRINGS

String s = «hello»,
String est inmuable, ça veut dire que si on essaie de récrire, la Meme variable pour modifier, en vrai, java va créer une nouvelle chaine de caractères, et l’anterieur sera detuitre; par le jam qui s’occupe de la gestion, allocation et liberation de la mémoire.

Si on veut modifier 1000 fois, une chaine de caractères, en va créer 1000 fois une chaine de caractères, ce qui est pas terrible au niveau de optimisation.

System.out.println(s+ » «  + « s2);
Le jvm compilateur peut faire de remplacements de cette opération car elle est tres lourde.

Concatenation
> concat()
s.concat(«  « ).concat(s2)
-c’est mieux qu’utiliser l’opérateur + (plus rapide dans la concatenation)


TAILLE
> length()

s.length()

> toUpperCase()
- Comment modifier une chaine pour changer le case (toUpperCase, toLower)
    - Il crée une nouvelle instance de string et mets le majuscules
- Dès qu’on voit qu’il y a une modification d’une chaine, c’est en fait une création

> trim() // pour enlever les spaces

String test = «  hola«; // « hola » 

> replace() // 
String s = « baba »
replace(« a », « o »); // bobo

En C, une chaine de caractères est un tableau de caractères. => s[0]

> charAt(); // permet de savoir l’index d’un caractère

charAt(0); // b

> substring(<index>, <nb>); // extraire des fragments de chaines de caractères

> equals(), compareTo(<str>)
// Pour comparer des chaines de caractères

Pas la valeur sinon la donnée qu’elle pointe (car il sont de chaines)

System.out.println(s == s2); X

Plutôt :
s.equals(s2);

compareTo // compare to
Se base sur le code ASCII. Il va comparer le code ASCII.

Retourne 0 si les chaines sont les memes.

Example :
A = 65
.a = 97
// c’est pas le meme. Il va retourner la difference  entre les 2. Dans cette exemple : -32.


A RETENIR
A chaque nouvelle operation, c’est une nouvelle chaine.
Si on a des nombreuses operations, on a des classes qui vont etre beaucoup plus optimisés.
￼

-----------------------------------
