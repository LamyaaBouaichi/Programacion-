<?php

class Libro {
    public $titulo;
    public $autor;
    public $paginas;

    public function mostrarInfo() {
        echo "El libro ".$this->titulo. ", cuyo autor es ".$this->autor.", tiene un total de ".$this->paginas." páginas";
    }
}

$libro = new Libro();
$libro -> titulo = 'xxx';
$libro -> autor = 'xxx';
$libro -> paginas = 23;
$libro -> mostrarInfo();

?>