<?php
require_once '../config/conexion.php';

class Usuario{
    private $conexion;

    public function __construct() {
        $this->conexion = new Conexion;
    }

    public function agregarUsuario ($nombre, $email, $edad, $plan_base, $paquete_ad, $duracion, $coste_total, $fecha_alta) {
        $query = "INSERT INTO usuarios (nombre, email, edad, plan_base, paquete_ad, duracion, coste_total, fecha_alta) values (?, ?, ?, ?, ?, ?, ?, ?)";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ssssssss", $nombre, $email, $edad, $plan_base, $paquete_ad, $duracion, $coste_total, $fecha_alta);
    
        if ($stmt->execute()) {
            echo "Usuario agregado";
        } else {
            echo "Error al agregar el usuario: " . $stmt->error;
        }

        $stmt->close();
    }

    public function obtenerUsuario () {
        $query = "SELECT * FROM usuarios";
        $resultado = $this->conexion->conexion->query($query);
        $usuarios = [];
        while ($fila = $resultado->fetch_assoc()) {
            $usuarios[] = $fila;
        }
        return $usuarios;
    }

    public function obtenerUsuarioPorId($id_usuario) {
        $query = "SELECT * FROM usuarios WHERE id_usuario = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_usuario);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
    }

    public function actualizarUsuario ($id_usuario,$nombre, $email, $edad, $plan_base, $paquete_ad, $duracion, $coste_total, $fecha_alta) {
        $query = "UPDATE usuarios SET nombre = ?, email = ?, edad = ?, plan_base = ?, paquete_ad = ?, duracion = ?, coste_total = ?,  WHERE id_usuario = ?";
        $stmt =  $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ssssssssi", $nombre, $email, $edad, $plan_base, $paquete_ad, $duracion, $coste_total, $fecha_alta, $id_usuario);

        if ($stmt->execute()) {
            echo "Usuario actualizado.";
        } else {
            echo "Error al actualizar usuario: " . $stmt->error;
        }

        $stmt->close();
    }

    public function eliminarUsuario ($id_usuario) {
        $query = "DELETE FROM usuarios WHERE id_usuario = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_usuario);

        if ($stmt->execute()) {
            echo "Usuario elimiando.";
        } else {
            echo "Error al eliminar usuario: " . $stmt->error;
        }

        $stmt->close(); 
    }
}
?>