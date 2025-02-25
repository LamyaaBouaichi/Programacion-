<?php
session_start();
require_once '../controlador/TareasController.php';
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    if (isset($_SESSION['id_usuario'])) {
        $id_user = $_SESSION['id_usuario'];
        $descripcion = $_POST['descripcion'];

        // Controlador para agregar una nueva tarea utilizando el método POST
        $controller = new TareasController();
        $mensaje = $controller->agregarTarea($id_user, $descripcion);
        echo $mensaje;
        header("Location: lista_tareas.php");
        exit();
    } else {
        echo "Debe iniciar sesión para agregar una tarea.";
    }
}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Agregar tarea</title>
</head>
<body>
<div class="container mt-4">
        <h1>Agregar tarea</h1>
        <form method="POST" action="">
            <div class="mb-3">
                <label for="descripcion" class="form-label">Descripción</label>
                <textarea class="form-control" id="descripcion" name="descripcion" required></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
    </div>
</body>
</html>