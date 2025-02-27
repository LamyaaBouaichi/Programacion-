<?php
//error_reporting(E_ALL);
class Persona {
    public $nombre;
    public $edad;
    public $genero;
    public function presentar(){
        echo 'Hola soy '.$this->nombre. ', tengo '.$this->edad. ' y soy '.$this->genero."\n";
    }
}

$presentacion = new Persona;
$presentacion -> nombre = 'Lamyaa';
$presentacion -> edad = 20;
$presentacion -> genero = 'mujer.';
$presentacion -> presentar();
?>