<?php
/**
* $numero1 = readline('Dame el primer numero: ');
* $numero2 = readline('Dame el segundo numero: ');

* echo "La suma de " . $numero1 . " y " . $numero2 . " es: " . $numero1+$numero2. "\n";

* echo "La resta de " . $numero1 . " y " . $numero2 . " es: " .$numero1-$numero2. "\n";

* echo "La multiplicación de " . $numero1 . " y " . $numero2 . " es: " . $numero1*$numero2. "\n";

* echo "La division de " . $numero1 . " y " . $numero2 . " es: " . $numero1/$numero2. "\n";
 */

$numero = readline('Introduce el número: ')

if ($numero ) {
    echo "El número " .$numero. " es par."
} else {
    echo "El número " .$numero. " es impar."
}

?>