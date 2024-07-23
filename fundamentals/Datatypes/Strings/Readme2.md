
STRINGS 2
Split (comme en python)
Explode (comme en php)

CLass
StringTokenizer

EXPORTER LE EXTRICTE MINIMUM
Import java.util.StringTokenizer

Splitter un string

String s = « news/titre-de-la-news/14«;
StringTokenizer st = new StringTokenizer(s, « /« );

On lui passe en 2eme param le delimiter /

while(st.hasMoreTokens()
// les morceau a récupérer
￼
// *StringTokenizer :  conçu pour manipuler des expressions relationnels, avec pâs mal d’operations, class tres puissant qui permet bcp de choses.

3eme param, pour retourner le delimiter



# 2eme partie 
StringBuilder / StringBuffer : muable (contenu modifiable)
## StringBuilder
Une fois qu’on apprend stringBuilder on apprend l’autre

Length c’est le nombre de caractères

La longueur de la chaine et sa capacité

capacity() => 16 caractères en mémoire.

On veut pas de gaspiller de ressources en mémoire lors qu’on programme

StringBuilder sBuilder = new StringBuilder();


System.out.println(«sBuilder.capacity()) // 

-> rien n’empêche que la capacité changera lors qu’on a une chaine de caractères

StringBuilder sBuilder = new StringBuilder(« Bonjour monde »);

/ append

sBuilder.append(« Bonjour »);

sBuilder.append(« tout le monde »);

|| jAVA c’est qui voit pour gérer la mémoire.

insert(<index>, <str>)

sBuilder.append(« tout le monde »);
sBuilder.insert(0,« Bonjour »);

## StringBuffer :
StringBuffer, -> peut utiliser le memes méthodes précédentes de StringBuilder

A retenir :
Par défaut, on travaillerait en monothread, un seul thread qui va executer le programme. Dans d’autre cas en multithreading,

Les classes en java, il ya celles qui sont en thread safe, et autre qui le sont pas.


// Monothreadé : on manipulé 1 seul thread. (Un thread represents une route)

Elle est pas thread-safe, mais ce n’est pas grave, car tout se passe dans un seul thread.

// Multithreadé : plusieurs threads. (routes) plusieurs voitures qui se passent en différentes routes.

StringBuilder(async)-> monothreadé

StringBuffer(synchronisé, thread-safe) -> multithreaded (ça crée de latente) thread-safe veut dire qui assure l’ordre de traitements des données.

On utilise pas StringBuilder en multithread.

PROFILING
Jvm (le compilateur) fait un tas d’optimisation, mais on doit TOUJOURS utiliser les BONNES CLASSES.
ETRE LE PLUS RIGUREOX, (PAS GASPILLER DE LA MÉMOIRE, MEME SI ON A DES ORDINATEURS TRES PUISSANTS)


BONUS :

toString : toutes les objets peuvent utiliser pour faire de l’affichage


S = « bonjour
S2 = « toute le monde« 
s.append(s2).toString()


— le compilateur fait ça derriere si on fait s + s2. Car c’est la façon plus optimisé, moins d’operations à faire.