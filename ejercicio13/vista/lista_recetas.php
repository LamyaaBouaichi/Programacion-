<?php
require_once '../controlador/RecetasController.php';
$controller = new RecetasController();
$recetas = $controller->listarRecetas();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Listado de recetas</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="lista_socios.php">Recetas</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="lista_socios.php">Recetas<span class="sr-only"></span></a>
                    </li>
                </ul>
            </div>
        </nav>
    <div class="container">
    <h1>Recetas disponibles</h1>
    <table class="table">
        <tr>
            <th>Nombre de la receta</th>
            <th>Ingredientes</th>
            <th>Acciones</th>
        </tr>
        <?php foreach ($recetas as $receta): ?>
            <tr>
                <td><?= $receta['nombre_receta'] ?></td>
                <td><?= $receta['ingredientes'] ?></td>
                <td>
                    <a href="editar_receta.php?id=<?= $receta['id_receta'] ?>" class="btn btn-warning mb-3">Editar</a>
                    <a href="eliminar_receta.php?id=<?= $receta['id_receta'] ?>" class="btn btn-danger mb-3">Eliminar</a>
                </td>
              </tr>
        <?php endforeach; ?>
    </table>
    <br>
    <a href="alta_receta.php" class="btn btn-primary mb-3">Agregar una nueva receta</a>
    </div>
</body>
</html>
