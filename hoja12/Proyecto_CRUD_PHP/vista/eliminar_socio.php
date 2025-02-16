<?php
require_once '../controlador/SociosController.php';

if (isset($_GET['id'])) {
    $id_socio = $_GET['id'];
    $eliminar = new SociosController;
    $socio = $eliminar->eliminarSocio($id_socio);

    header("Location: lista_socios.php");
    exit();
}
?>