<?php
require_once '../modelo/class_tarea.php';

class TareasController {
    private $modelo;

    public function __construct() {
        $this->modelo = new Tarea();
    }

    public function agregarTarea($id_user, $descripcion) {
        $this->modelo->agregarTarea($id_user, $descripcion);
    }

    public function listarTareas($id_user) {
        return $this->modelo->obtenerTareasPorUsuario($id_user);
    }

    public function obtenerTareaPorId($id_tarea) {
        return $this->modelo->obtenerTareaPorId($id_tarea);
    }

    public function actualizarTarea($id_tarea, $descripcion, $estado) {
        $this->modelo->actualizarTarea($id_tarea, $descripcion, $estado);
    }

    public function eliminarTarea($id_tarea) {
        $this->modelo->eliminarTarea($id_tarea);
    }
}
?>