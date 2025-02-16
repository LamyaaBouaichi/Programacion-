<?php
require_once '../controlador/EventosController.php';

if (isset($_GET['id'])) {
    $id_evento = $_GET['id'];
    // Utilizar el método GET para eliminar un evento
    $eliminar = new EventosController;
    $socio = $eliminar->eliminarEvento($id_evento);

    header("Location: lista_eventos.php");
    exit();
}
?>