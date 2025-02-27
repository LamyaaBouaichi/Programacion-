<?php

class Calculadora {
    public $num1;
    public $num2;
    
    public function sumar() {
        echo "Suma: ".$this->num1 + $this->num2."\n";
    }  
    public function restar() {
        echo "Resta: ".$this->num1 - $this->num2."\n";
    }
    public function multiplicar() {
        echo "Multiplicación: ".$this->num1 * $this->num2."\n";
    }
    public function dividir() {
        if ($this->num2 == 0) {
            throw new Exception("No es posible dividir entre 0");
        } else {
            echo "División: ".$this->num1 / $this->num2."\n";
        }
    }  

}


$resultado = new Calculadora;
$resultado -> num1 = 5;
$resultado -> num2 = 10;
$resultado -> sumar();
$resultado -> restar();
$resultado -> multiplicar();
try {
    $resultado -> dividir();
}  catch (Exception $e) {
    echo "Error: " . $e->getMessage();
}

?>