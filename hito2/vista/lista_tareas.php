<?php
session_start();
if (!isset($_SESSION['usuario'])) {
    header("Location: login.php");
    exit();
}

require_once '../controlador/TareasController.php';
// Utilizar el controlador para listar la tabla de eventos
$controller = new TareasController();
$tareas = $controller->listarTareas($_SESSION['id_usuario']);
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Listado de Tareas</title>
</head>
<body>
    <!-- Navegación para cambiar de tabla -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="dashboard.php">Index</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="lista_tareas.php">Tareas</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logout.php">Cerrar Sesión</a>
                    </li>
                </ul>
            </div>
        </nav>

    <div class="container">
    <h1>Mis tareas</h1>
    <table class="table">
        <tr>
            <th>ID</th>
            <th>Descripción</th>
            <th>Estado</th>
            <th>Acciones</th>
        </tr>
        <?php foreach ($tareas as $tarea): ?>
            <tr>
                <td><?= $tarea['id_tarea'] ?></td>
                <td><?= $tarea['descripcion'] ?></td>
                <td><?= ucfirst($tarea['estado']) ?></td>
                <td>
                    <!-- Botón para agregar una tarea nueva-->
                    <a href="alta_tarea.php" class="btn btn-primary mb-3">Agregar nueva tarea</a>

                    <!-- Botones para la edición y eliminacón de una nueva tarea-->
                    <a href="editar_tarea.php?id=<?= $tarea['id_tarea'] ?>" class="btn btn-warning mb-3">Editar</a>
                    <a href="eliminar_tarea.php?id=<?= $tarea['id_tarea'] ?>" class="btn btn-danger mb-3">Eliminar</a>
                </td>
              </tr>
        <?php endforeach; ?>
        <a href="alta_tarea.php" class="btn btn-primary mb-3">Agregar nueva tarea</a>
    </table>
    </div>
</body>
</html>