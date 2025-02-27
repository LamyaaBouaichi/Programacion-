<?php

class Vehiculo {
    public $marca;
    public function encender() {
        return 'El vehiculo está encendido.'."\n";
    }
}

class Coche extends Vehiculo {
    public $modelo;
    public function nombreCoche() {
        echo 'Coche-> Marca: '.$this->marca. ' Modelo: '.$this->modelo;
    }
}

$coche = new Vehiculo;
$coche = new Coche;
echo $coche -> encender();
$coche -> marca = 'Audi';
$coche -> modelo = 'A4';
$coche -> nombreCoche();
?>