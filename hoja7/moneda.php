<?php

class ConversorMoneda {
    public $dinero;
    public function convertirDolaresAEuros() {
        echo 'Euros: '.$this->dinero * 0.631. " € \n";
    }
    public function converirEurosADolares() {
        echo 'Dolares: '.$this->dinero / 0.631. " $ \n";
    }
}

$conversor = new ConversorMoneda;
$conversor -> dinero = 100;
$conversor -> convertirDolaresAEuros();
$conversor -> converirEurosADolares();
?>