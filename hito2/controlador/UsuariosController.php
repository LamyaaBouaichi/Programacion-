<?php
require_once '../modelo/class_usuario.php';

class UsuariosController {
    private $modelo;

    public function __construct() {
        $this->modelo = new Usuario();
    }

    public function registrarUsuario($nombre_user, $correo, $password_user) {
        if ($this->modelo->correoExiste($correo)) {
            return 'El correo electrónico ya está registrado.';
        }
    
        if ($this->modelo->registrarUsuario($nombre_user, $correo, $password_user)) {
            return 'Usuario registrado con éxito.';
        } else {
            return 'Error al registrar el usuario.';
        }
    }

    public function inicioUsuario($correo, $password_user) {
        $usuario = $this->modelo->inicioUsuario($correo, $password_user);
        if ($usuario) {
            return $usuario;
        } else {
            return null;
        }
    }

}
?>