<?php
require_once '../controlador/SociosController.php';

//Usar el método GET para eliminar un socio de la tabla y
// utilizando el controlador para usar la funcion de eliminar
if (isset($_GET['id'])) {
    $id_socio = $_GET['id'];
    $eliminar = new SociosController;
    $socio = $eliminar->eliminarSocio($id_socio);

    header("Location: lista_socios.php");
    exit();
}
?>