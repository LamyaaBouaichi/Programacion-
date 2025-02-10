<?php
require_once '../controlador/EventosController.php';

if (isset($_GET['id'])) {
    $id_evento = $_GET['id'];
    // Utilizar el controlador para utilizar el método GET donde permite elegir el ID a editar
    $registro = new EventosController;
    $evento = $registro->obtenerEventoPorId($id_evento);
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $id_evento = $_POST['id_evento'];
    $nombre_evento = $_POST['nombre_evento'];
    $fecha = $_POST['fecha'];
    $lugar = $_POST['lugar'];
    
    // Utilizar el controlador con el método POST para el evento a editar
    $editar = new EventosController;
    $cambio = $editar->actualizarEvento($id_evento, $nombre_evento, $fecha, $lugar);
    header("Location: lista_eventos.php");
    exit();
}
?>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Editar evento</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Editar evento</h1>
        <form action="editar_evento.php?id=<?= htmlspecialchars($evento['id_evento']) ?>" method="POST">
            <div class="mb-3">
                <input type="hidden" class="form-control" id="id_evento" name="id_evento" value="<?= htmlspecialchars($evento['id_evento']) ?>">
            </div>
            <div class="mb-3">
                <label for="nombre_evento" class="form-label">Nombre del evento</label>
                <input type="text" class="form-control" id="nombre_evento" name="nombre_evento" value="<?= htmlspecialchars($evento['nombre_evento']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="fecha" class="form-label">Fecha</label>
                <input type="date" class="form-control" id="fecha" name="fecha" value="<?= htmlspecialchars($evento['fecha']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="lugar" class="form-label">Lugar</label>
                <input type="text" class="form-control" id="lugar" name="lugar" value="<?= htmlspecialchars($evento['lugar']) ?>" required>
            </div>
            <!--Botones para guardar el cambio y volver si no se edita el evento -->
            <button type="submit" class="btn btn-warning">Guardar cambio</button>
            <a href='lista_socios.php' class="btn btn-secondary" role="button">Volver</a>
            </div>
        </form>
    </div>
</body>
</html>