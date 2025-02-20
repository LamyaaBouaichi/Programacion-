<?php
require_once '../config/conexion.php';

class Receta {
    private $conexion;

    public function __construct() {
        $this->conexion = new Conexion();
    }

    public function agregarReceta($nombre_receta, $ingredientes) {
        $query = "INSERT INTO recetas (nombre_receta, ingredientes) VALUES (?, ?)";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ss", $nombre_receta, $ingredientes);

        if ($stmt->execute()) {
            echo "Receta agregado con éxito.";
        } else {
            echo "Error al agregar receta: " . $stmt->error;
        }

        $stmt->close();
    }

    public function obtenerRecetas() {
        $query = "SELECT * FROM recetas";
        $resultado = $this->conexion->conexion->query($query);
        $recetas = [];
        while ($fila = $resultado->fetch_assoc()) {
            $recetas[] = $fila;
        }
        return $recetas;
    }

    public function obtenerRecetaPorId($id_receta) {
        $query = "SELECT * FROM recetas WHERE id_receta = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_receta);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
    }

    public function actualizarReceta($id_receta, $nombre_receta, $ingredientes) {
        $query = "UPDATE recetas SET nombre_receta = ?, ingredientes = ? WHERE id_receta = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ssi", $nombre_receta, $ingredientes, $id_receta);

        if ($stmt->execute()) {
            echo "Receta actualizado con éxito.";
        } else {
            echo "Error al actualizar receta: " . $stmt->error;
        }

        $stmt->close();
    }

    public function eliminarReceta($id_receta) {
        $query = "DELETE FROM recetas WHERE id_receta = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_receta);

        if ($stmt->execute()) {
            echo "Receta eliminado con éxito.";
        } else {
            echo "Error al eliminar receta: " . $stmt->error;
        }

        $stmt->close();
    }
}
?>