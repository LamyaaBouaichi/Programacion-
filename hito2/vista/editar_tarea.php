<?php
require_once '../controlador/TareasController.php';
if (isset($_GET['id'])) {
    $id_tarea = $_GET['id'];
    // Utilizar el controlador para utilizar el método GET donde permite elegir el ID a editar
    $registro = new TareasController;
    $tarea = $registro->obtenerTareaPorId($id_tarea);
}
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $id_tarea = $_POST['id_tarea'];
    $descripcion = $_POST['descripcion'];
    $estado = $_POST['estado'];
    
    // Utilizar el controlador con el método POST para la tarea a editar
    $editar = new TareasController;
    $cambio = $editar->actualizarTarea($id_tarea, $descripcion, $estado);
    header("Location: lista_tareas.php");
    exit();
}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Editar tarea</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Editar tarea</h1>
        <form action="editar_tarea.php?id=<?= htmlspecialchars($tarea['id_tarea']) ?>" method="POST">
            <div class="mb-3">
                <input type="hidden" class="form-control" id="id_tarea" name="id_tarea" value="<?= htmlspecialchars($tarea['id_tarea']) ?>">
            </div>
            <div class="mb-3">
                <label for="descripcion" class="form-label">Descripción a actualizar</label>
                <textarea class="form-control" id="descripcion" name="descripcion" value="<?= htmlspecialchars($tarea['descripcion']) ?>" required></textarea>
            </div>
            <div class="mb-3">
                <label for="estado" class="form-label">Estado</label>
                <select class="form-control" id="estado" name="estado">
                    <option value="pendiente" <?= $tarea['estado'] == 'pendiente' ? 'selected' : '' ?>>Pendiente</option>
                    <option value="realizada" <?= $tarea['estado'] == 'realizada' ? 'selected' : '' ?>>Realizada</option>
                </select>
            </div>
            <!--Botones para guardar el cambio y volver si no se edita la tarea -->
            <button type="submit" class="btn btn-warning">Guardar cambio</button>
            <a href='lista_tareas.php' class="btn btn-secondary" role="button">Volver</a>
            </div>
        </form>
    </div>
</body>
</html>