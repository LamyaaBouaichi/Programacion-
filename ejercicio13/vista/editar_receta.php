<?php
require_once '../controlador/RecetasController.php';

if (isset($_GET['id'])) {
    $id_receta = $_GET['id'];
    $registro = new RecetasController();
    $receta = $registro->obtenerRecetaPorId($id_receta);
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $id_receta = $_POST['id_receta'];
    $nombre_receta = $_POST['nombre_receta'];
    $ingredientes = $_POST['ingredientes'];
    
    $editar = new RecetasController();
    $cambio = $editar->actualizarReceta($id_receta, $nombre_receta, $ingredientes);
    header("Location: lista_recetas.php");
    exit();
}
?>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Editar receta</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Editar ingredientes</h1>
        <form action="editar_receta.php?id=<?= htmlspecialchars($receta['id_receta']) ?>" method="POST">
            <div class="mb-3">
                <input type="hidden" class="form-control" id="id_receta" name="id_receta" value="<?= htmlspecialchars($receta['id_receta']) ?>">
            </div>
            <div class="mb-3">
                <label for="nombre_receta" class="form-label">Nombre receta</label>
                <input type="text" class="form-control" id="nombre_receta" name="nombre_receta" value="<?= htmlspecialchars($receta['nombre_receta']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="ingredientes" class="form-label">Ingredientes</label>
                <input type="text" class="form-control" id="ingredientes" name="ingredientes" value="<?= htmlspecialchars($receta['ingredientes']) ?>" required>
            </div>
            <button type="submit" class="btn btn-warning">Guardar cambio</button>
            <a href='lista_recetas.php' class="btn btn-secondary" role="button">Volver</a>
            </div>
        </form>
    </div>
</body>
</html>