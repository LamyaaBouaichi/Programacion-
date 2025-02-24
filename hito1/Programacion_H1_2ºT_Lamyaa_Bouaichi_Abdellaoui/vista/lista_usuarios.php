<?php
require_once '../controlador/UsuarioController.php';
$controller = new UsuarioController();
$usuarios = $controller->listarUsuario();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Listado de Usuarios</title>
</head>
<body>
    <div class="container">
    <h1>Usuarios suscritos</h1>
    <br>
    <a href="alta_usuario.php" class="btn btn-primary mb-3">Agregar nuevo usuario</a>
    <table class="table">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Email</th>
            <th>Edad</th>
            <th>Plan</th>
            <th>Paquete Adicional</th>
            <th>Duración</th>
            <th>Coste Total</th>
            <th>Fecha suscrita</th>
            <th>Acciones</th>
        </tr>
        <?php foreach ($usuarios as $usuario): ?>
            <tr>
                <td><?= $usuario['id_usuario'] ?></td>
                <td><?= $usuario['nombre'] ?></td>
                <td><?= $usuario['email'] ?></td>
                <td><?= $usuario['edad'] ?></td>
                <td><?= $usuario['plan_base'] ?></td>
                <td><?= $usuario['paquete_ad'] ?></td>
                <td><?= $usuario['duracion'] ?></td>
                <td><?= $usuario['coste_total'] ?></td>
                <td><?= $usuario['fecha_alta'] ?></td>
                <td>
                    <a href="editar_usuario.php?id=<?= $socio['id_usuario'] ?>" class="btn btn-warning mb-3">Editar</a>
                    <a href="eliminar_usuario.php?id=<?= $socio['id_usuario'] ?>" class="btn btn-danger mb-3">Eliminar</a>
                </td>
              </tr>
        <?php endforeach; ?>
    </table>
    </div>
</body>
</html>