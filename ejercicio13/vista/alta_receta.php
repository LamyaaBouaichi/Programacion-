<?php
require_once '../controlador/RecetasController.php';
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Controlador para agregar un nuevo evento utilizando el método POST
    $controller = new RecetasController();
    $controller->agregarReceta(
        $_POST['nombre_receta']
    );
    header("Location: lista_recetas.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Agregar receta</title>
</head>
<body>
<div class="container mt-4">
        <h1>Agregar receta</h1>
        <form method="POST" action="">
            <div class="mb-3">
                <label for="nombre_receta" class="form-label">Nombre de la receta</label>
                <input type="text" class="form-control" id="nombre_receta" name="nombre_receta" required>
            </div>
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
    </div>
</body>
</html>