<?php
require_once '../controlador/UsuarioController.php';

if (isset($_GET['id'])) {
    $id_usuario = $_GET['id'];

    $eliminar = new UsuarioController();
    $usuario = $eliminar->eliminarUsuario($id_usuario);

    header("Location: lista_usuarios.php");
    exit();
}
?>