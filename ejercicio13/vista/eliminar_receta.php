<?php
require_once '../controlador/RecetasController.php';

if (isset($_GET['id'])) {
    $id_receta = $_GET['id'];
    // Utilizar el método GET para eliminar un evento
    $eliminar = new RecetasController();
    $receta = $eliminar->eliminarReceta($id_receta);

    header("Location: lista_recetas.php");
    exit();
}
?>