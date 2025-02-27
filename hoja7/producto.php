<?php

class Producto {
    public $nombre;
    public $precio;
    public function mostrarDetalles() {
        echo 'Nombre: '.$this->nombre. '. Precio: ' .$this->precio."\n";
    } 
}

class Electrodomestico extends Producto {
    public $consumo;
    public function monstrarDetallesE() {
        echo 'Nombre: '.$this->nombre. '. Precio: ' .$this->precio. ' Consumo: '.$this->consumo."\n";
    }
}
$producto = new Producto;
$producto -> nombre ='xxxxx';
$producto -> precio = 32;
$producto -> mostrarDetalles();

$producto = new Electrodomestico;
$producto -> nombre = 'xxxx';
$producto -> precio = 23;
$producto -> consumo = 'xxxx';
$producto -> monstrarDetallesE();
?>