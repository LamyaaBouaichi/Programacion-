<?php
require_once '../controlador/SociosController.php';
// Utilizar el controlador para usar la funcion de listarSocios
$controller = new SociosController();
$socios = $controller->listarSocios();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <!-- Link del BootStrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Listado de Socios</title>
</head>
<body>
    <div class="container">
    <h1>Socios Registrados</h1>
    <table class="table">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Email</th>
            <th>Teléfono</th>
            <th>Fecha de Nacimiento</th>
            <th>Acciones</th>
        </tr>
        <!-- Realizar la tabla de socios -->
        <?php foreach ($socios as $socio): ?>
            <tr>
                <td><?= $socio['id_socio'] ?></td>
                <td><?= $socio['nombre'] ?></td>
                <td><?= $socio['apellido'] ?></td>
                <td><?= $socio['email'] ?></td>
                <td><?= $socio['telefono'] ?></td>
                <td><?= $socio['fecha_nacimiento'] ?></td>
                <td> <!-- Botones para editar y eliminar un socio -->
                    <a href="editar_socio.php?id=<?= $socio['id_socio'] ?>" class="btn btn-warning mb-3">Editar</a>
                    <a href="eliminar_socio.php?id=<?= $socio['id_socio'] ?>" class="btn btn-danger mb-3">Eliminar</a>
                </td>
              </tr>
        <?php endforeach; ?>
    </table>
    <br>
    <!-- Boton para agregar un socio en la tabla -->
    <a href="alta_socio.php" class="btn btn-primary mb-3">Agregar un nuevo socio</a>
    </div>
</body>
</html>
