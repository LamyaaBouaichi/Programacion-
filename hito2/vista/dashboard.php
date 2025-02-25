<?php
session_start();

if (!isset($_SESSION['usuario'])) {
    header("Location: login.php");
    exit();
}

require_once '../controlador/TareasController.php';

$tareasControlador = new TareasController();
$tareas = $tareasControlador->listarTareas($_SESSION['id_usuario']);
?>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2>Bienvenido, <?php echo $_SESSION['usuario']; ?></h2>
        <a href="logout.php" class="btn btn-danger mt-2">Cerrar sesión</a>
        <h3>Tareas</h3>
        <table class="table table-striped mt-3">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Descripción</th>
                    <th>Estado</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <?php foreach ($tareas as $tarea): ?>
                <tr>
                    <td><?php echo $tarea['id_tarea']; ?></td>
                    <td><?php echo $tarea['descripcion']; ?></td>
                    <td><?php echo $tarea['estado']; ?></td>
                    <td>
                        <a href="editar_tarea.php?id=<?php echo $tarea['id_tarea']; ?>" class="btn btn-warning btn-sm">Editar</a>
                        <a href="eliminar_tarea.php?id=<?php echo $tarea['id_tarea']; ?>" class="btn btn-danger btn-sm">Eliminar</a>
                    </td>
                </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
        <a href="alta_tarea.php" class="btn btn-primary mb-3">Agregar nueva tarea</a>
    </div>
</body>
</html>