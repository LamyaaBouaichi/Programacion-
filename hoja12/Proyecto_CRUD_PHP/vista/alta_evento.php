<?php
require_once '../controlador/EventosController.php';
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Controlador para agregar un nuevo evento utilizando el método POST
    $controller = new EventosController();
    $controller->agregarEvento(
        $_POST['nombre_evento'], 
        $_POST['fecha'],
        $_POST['lugar']
    );
    header("Location: lista_eventos.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Agregar evento</title>
</head>
<body>
<div class="container mt-4">
        <h1>Agregar evento</h1>
        <form method="POST" action="">
            <div class="mb-3">
                <label for="nombre_evento" class="form-label">Nombre del evento</label>
                <input type="text" class="form-control" id="nombre_evento" name="nombre_evento" required>
            </div>
            <div class="mb-3">
                <label for="fecha" class="form-label">Fecha</label>
                <input type="date" class="form-control" id="fecha" name="fecha" required>
            </div>
            <div class="mb-3">
                <label for="lugar" class="form-label">Lugar</label>
                <input type="text" class="form-control" id="lugar" name="lugar" required>
            </div>
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
    </div>
</body>
</html>