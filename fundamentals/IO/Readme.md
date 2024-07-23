

// Lecture au clavier (input)
// BufferReader -> synchro
// * Thread-safe
// * Lecture de chaine de caractères (String)

// Scanner -> asynchrone, (plus lente que BufferedReader)
// * Not thread-safe
// * Lecture de donnée + parsing
// - (A cause du parsing qui est une étape supplémentaire, ça rend l’usage de cette classe plus lente.
// - Lecture de donnée vérifie la donnée, on peut mettre une expression régulière pour le format.

// BufferedReader lit que de Chaine de caractères.
// Lecteur de flux d’entre, input stream reader

// FLUX D’ENTRE
// System.in