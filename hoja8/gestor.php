<?php

class Tarea {
    public $nombre;
    public $descripcion;
    public $fechaLimite;
    public $estado;
    
    public function marcarComoCompletada(){
        return $this->estado;
    }
    public function editarDescripcion($nuevaDescripcion){
        return ;
    }
    public function mostrarTarea(){
        return "Nombre: ".$this->nombre."\nDescripción: ".$this->descripcion."\nFecha límite: ".$this->fechaLimite."\n";
    }
}

?>