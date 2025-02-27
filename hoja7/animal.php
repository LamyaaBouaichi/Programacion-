<?php
//error_reporting(E_ALL);
class Animal {
    public $especie;
    public function emitirSonido() {
        echo $this->especie."\n";
    }
}

class Perro extends Animal {
    public $raza;
    public function emitirSonidoPerro() {
        echo 'Soy un perro y mi raza es '.$this->raza."\n";
    }
}

$animal = new Perro;
$animal -> especie = 'Guaw guaw';
$animal -> raza = '???';
$animal -> emitirSonido();
$animal -> emitirSonidoPerro();
?>