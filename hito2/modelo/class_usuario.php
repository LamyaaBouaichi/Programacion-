<?php
require_once '../config/conexion.php';

class Usuario {
    private $conexion;

    public function __construct() {
        $this->conexion = new Conexion();
    }

    public function correoExiste($correo) {
        $query = "SELECT * FROM usuarios WHERE correo = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("s", $correo);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->num_rows > 0;
    }

    public function registrarUsuario($nombre_user, $correo, $password_user) {
        $hashed_password = password_hash($password_user, PASSWORD_DEFAULT);
        $query = "INSERT INTO usuarios (nombre_user, correo, password_user) VALUES (?, ?, ?)";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("sss", $nombre_user, $correo, $hashed_password);

        if ($stmt->execute()) {
            return true;
        } else {
            return false;
        }

        $stmt->close();
    }

    public function inicioUsuario($correo, $password_user) {
        $query = "SELECT * FROM usuarios WHERE correo = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("s", $correo);
        $stmt->execute();
        $resultado = $stmt->get_result();
        $usuario = $resultado->fetch_assoc();

        if ($usuario) {
            if (password_verify($password_user, $usuario['password_user'])) {
                return $usuario;
            } else {
                echo "Contraseña incorrecta>";
                return null;
            }
        } else {
            echo "El correo no existe<br>";
            return null;
        }
    }
}
?>