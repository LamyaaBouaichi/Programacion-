<?php

class CuentaBancaria {
    public $titular;
    public $saldo;
    public $tipoDeCuenta;
    public function depositar () {
        echo "Se ha introducido una cantidad de ".$this->saldo." de saldo en el banco\n";
    }
    public function retirar() {
        echo "Se ha retirado una cantidad de ".$this->saldo." de saldo en el banco\n";
    }
    public function mostrarInfo() {
        echo 'Titular: '.$this->titular. "\nSaldo: ".$this->saldo."\nTipo de cuenta: ".$this->tipoDeCuenta;
    }
}


$cantidad = new CuentaBancaria;
$cantidad -> titular = 'Yo';
$cantidad -> tipoDeCuenta = 'Débito';
$cantidad -> saldo = 0;
echo "Depositar - d\nRetirar - r\nInformación - i\nSalir - s\n";
$opcion = readline('Ingrese una opción: ');

while ($opcion) {
    echo "Depositar - d\nRetirar - r\nInformación - i\nSalir - s\n";
    if ($opcion == 'd') {
        $deposito = readline ('Ingrese la cantidad: ');
        $cantidad->saldo += $deposito;
        $cantidad-> depositar();
    } elseif ($opcion == 'r') {
        $retiro = readline('Ingrese la cantidad: ');
        if ($retiro <= $cantidad->saldo) {
            $cantidad->saldo -= $retiro;
            $cantidad ->retirar();
        } else {
            echo 'No es posible retirar una cantidad mayor al saldo.';
        }
    } elseif ($opcion == 'i') {
        $cantidad -> mostrarInfo();
    } elseif ($opcion == 's') {
        echo 'Saliendo de la cuenta bancaria';
        break;
    }
}

?>