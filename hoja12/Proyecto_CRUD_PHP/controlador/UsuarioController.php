<?php
require_once '../modelo/class_usuario.php';

class UsuarioController {
    private $modelo;

    public function __construct() {
        $this->modelo = new Usuario ();
    }

    public function agregarUsuario($usuario, $password, $rol) {
        $this->modelo->agregarUsuario($usuario, $password, $rol);
    }

    public function obtenerUsuarioPorRol($rol) {
        $this->modelo->obtenerUsuarioPorRol($rol);
    }

    public function actualizarUsuario($id_usuario, $usuario, $password, $rol) {
        $this->modelo->actualizarUsuario($id_usuario, $usuario, $password, $rol);
    }

    public function eliminarUsuario($id_usuario){
        $this->modelo->eliminarUsuario($id_usuario);
    }
}
?>