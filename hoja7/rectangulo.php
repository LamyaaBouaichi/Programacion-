<?php
//error_reporting(E_ALL);
class Rectangulo {
    public $base;
    public $altura;
    public function calcularArea() {
        echo 'La Área cuyo base de '.$this->base. ' y altura '.$this->altura. ' es de '.$this->base * $this->altura;
    }
}

$area = new Rectangulo;
$area -> base = 10;
$area -> altura = 5;
$area -> calcularArea();
?>