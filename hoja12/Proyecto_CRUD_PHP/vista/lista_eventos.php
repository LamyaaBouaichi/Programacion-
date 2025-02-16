<?php
require_once '../controlador/EventosController.php';
// Utilizar el controlador para listar la tabla de eventos
$controller = new EventosController();
$eventos = $controller->listarEventos();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Listado de Eventos</title>
</head>
<body>
    <!-- Navegación para cambiar de tabla -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="lista_eventos">Eventos</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="lista_socios.php">Socios</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="lista_eventos.php">Eventos<span class="sr-only"></span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logout.php">Cerrar Sesión</a>
                    </li>
                </ul>
            </div>
        </nav>
    <div class="container">
    <h1>Eventos Organizados</h1>
    <table class="table">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Fecha</th>
            <th>Lugar</th>
            <th>Acciones</th>
        </tr>
        <?php foreach ($eventos as $evento): ?>
            <tr>
                <td><?= $evento['id_evento'] ?></td>
                <td><?= $evento['nombre_evento'] ?></td>
                <td><?= $evento['fecha'] ?></td>
                <td><?= $evento['lugar'] ?></td>
                <td>
                    <!-- Botones para la edición y eliminacón de un evento-->
                    <a href="editar_evento.php?id=<?= $evento['id_evento'] ?>" class="btn btn-warning mb-3">Editar</a>
                    <a href="eliminar_evento.php?id=<?= $evento['id_evento'] ?>" class="btn btn-danger mb-3">Eliminar</a>
                </td>
              </tr>
        <?php endforeach; ?>
    </table>
    <br>
    <!-- Botón para agregar un evento nuevo-->
    <a href="alta_evento.php" class="btn btn-primary mb-3">Agregar un nuevo evento</a>
    </div>
</body>
</html>