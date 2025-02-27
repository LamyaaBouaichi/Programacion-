<?php

class Empleado{
    public $nombre;
    public $sueldo;
    public function mostrarDetalle() {
        echo 'Nombre: '.$this->nombre. ' Sueldo: '.$this->sueldo. "\n";
    }
}

class Gerente extends Empleado {
    public $departamento;
    public function mostrarDetalle(){
        echo 'Nombre: '.$this->nombre. ' Sueldo: '.$this->sueldo. ' Departamento: '.$this->departamento;
    }
}

$empleado1 = new Empleado;
$empleado1 -> nombre = 'empleado1';
$empleado1 -> sueldo = 'xxxx €';
$empleado1 -> mostrarDetalle();

$empleado2 = new Gerente;
$empleado2 -> nombre = 'empleado2';
$empleado2 -> sueldo = '???? €';
$empleado2 -> departamento = 'RRHH';
$empleado2 -> mostrarDetalle();
?>