<?php
require_once '../modelo/class_receta.php';
require_once '../modelo/ia.php';

class RecetasController {
    private $modelo;

    public function __construct() {
        $this->modelo = new Receta();
    }

    public function agregarReceta($nombre_receta) {
        $receta_nueva = new NuevaReceta();
        $ingredientes = $receta_nueva->obtenerRecetasNuevas($nombre_receta);
        
        $this->modelo->agregarReceta($nombre_receta, $ingredientes);
    }

    public function listarRecetas() {
        return $this->modelo->obtenerRecetas();
    }

    public function obtenerRecetaPorId($id_receta) {
        return $this->modelo->obtenerRecetaPorId($id_receta);
    }

    public function actualizarReceta($id_receta, $nombre_receta, $ingredientes) {
        $this->modelo->actualizarReceta($id_receta, $nombre_receta, $ingredientes);
    }

    public function eliminarReceta($id_receta) {
        $this->modelo->eliminarReceta($id_receta);
    }
}
?>