<?php

class Circulo {
    public $radio;
    public $pi = 3.14;
    public function calcularArea() {
        return 'Area = '.$this->pi * $this->radio * $this->radio;
    }
}

$area = new Circulo;
$area -> radio = 5;
$area -> pi;
echo $area -> calcularArea();
?>