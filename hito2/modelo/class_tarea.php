<?php
require_once '../config/conexion.php';

class Tarea {
    private $conexion;

    public function __construct() {
        $this->conexion = new Conexion();
    }

    public function agregarTarea($id_user, $descripcion) {
        $query = "INSERT INTO tareas (id_user, descripcion) VALUES (?, ?)";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("is", $id_user, $descripcion);

        if ($stmt->execute()) {
            echo "Tarea agregado con éxito.";
            return true;
        } else {
            echo "Error al agregar la tarea: " . $stmt->error;
            return false;
        }

        $stmt->close();
    }

    public function obtenerTareasPorUsuario($id_user) {
        $query = "SELECT * FROM tareas WHERE id_user = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_user);
        $stmt->execute();
        $resultado = $stmt->get_result();
        
        $tareas = [];
        while ($tarea = $resultado->fetch_assoc()) {
            $tareas[] = $tarea;
        }
        return $tareas;
    }

    public function obtenerTareaPorId($id_tarea) {
        $query = "SELECT * FROM tareas WHERE id_tarea = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_tarea);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
    }

    public function actualizarTarea($id_tarea, $descripcion, $estado) {
        $query = "UPDATE tareas SET descripcion = ?, estado = ? WHERE id_tarea = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ssi", $descripcion, $estado, $id_tarea);

        if ($stmt->execute()) {
            echo "Tarea actualizado con éxito.";
        } else {
            echo "Error al actualizar la tarea: " . $stmt->error;
        }

        $stmt->close();
    }

    public function eliminarTarea($id_tarea) {
        $query = "DELETE FROM tareas WHERE id_tarea = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_tarea);

        if ($stmt->execute()) {
            return true;
        } else {
            return false;
        }

        $stmt->close();
    }
}
?>
