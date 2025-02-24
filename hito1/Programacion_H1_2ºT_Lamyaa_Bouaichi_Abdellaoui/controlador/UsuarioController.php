<?php
require_once '../modelo/class_usuario.php';

class UsuarioController {
    private $modelo;

    public function __construct() {
        $this->modelo = new Usuario();
    }

    public function agregarUsuario($nombre, $email, $edad, $plan_base, $paquete_ad, $duracion, $coste_total, $fecha_alta) {
        $this->modelo->agregarUsuario($nombre, $email, $edad, $plan_base, $paquete_ad, $duracion, $coste_total, $fecha_alta);
    }

    public function listarUsuario() {
        return $this->modelo->obtenerUsuario();
    }

    public function obtenerUsuarioPorId($id_usuario){
        return $this->modelo->obtenerUsuarioPorId($id_usuario);
    }

    public function actualizarUsuario($nombre, $email, $edad, $plan_base, $paquete_ad, $duracion, $coste_total, $fecha_alta, $id_usuario) {
        $this->modelo->actualizarUsuario($nombre, $email, $edad, $plan_base, $paquete_ad, $duracion, $coste_total, $fecha_alta, $id_usuario);
    }

    public function eliminarUsuario($id_usuario) {
        $this->modelo->eliminarUsuario($id_usuario);
    }
}
?>