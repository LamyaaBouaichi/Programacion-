<?php
require_once '../config/conexion.php';

class Usuario {
    private $conexion;

    public function __construct() {
        $this->conexion = new Conexion ();
    }

    public function agregarUsuario ($usuario, $password, $rol) {
        $query = "INSERT INTO usuarios (usuario, password, rol) VALUES (?, ?, ?)";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("sss", $usuario, $password, $rol);

        if ($stmt->execute()) {
            echo "Usuario dado de alta.";
        } else {
            echo "Error dar de alta el usuario: " . $stmt->error;
        }

        $stmt->close();
    }

    public function obtenerUsuarioPorRol ($rol) {
        $query = "SELECT * FROM usuarios WHERE rol = 'admin'";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("s", $rol);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
    }

    public function actualizarUsuario ($id_usuario, $usuario, $password, $rol) {
        $query = "UPDATE usuarios SET usuario = ?, password = ?, rol = ? WHERE id_usuario = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ssss", $usuario, $password, $rol, $id_usuario);

        if ($stmt->execute()) {
            echo "Usuario editado";
        } else {
            echo "Error al editar el usuario: " . $stmt->error;
        }

        $stmt->close();
    }

    public function eliminarUsuario($id_usuario) {
        $query = "DELETE FROM usuarios WHERE id_usuario = ? AND rol = 'user'";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_usuario
    );

        if ($stmt->execute()) {
            echo "Socio eliminado con éxito.";
        } else {
            echo "Error al eliminar socio: " . $stmt->error;
        }

        $stmt->close();
    }
}

?>