<?php
require_once '../controlador/TareasController.php';
if (isset($_GET['id'])) {
    $id_tarea = $_GET['id'];
    // Utilizar el método GET para eliminar un evento
    $eliminar = new TareasController();
    $tarea = $eliminar->eliminarTarea($id_tarea);
    header("Location: lista_tareas.php");
    exit();
}
?>