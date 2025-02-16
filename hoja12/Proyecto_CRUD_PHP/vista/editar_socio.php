<?php
require_once '../controlador/SociosController.php';

if (isset($_GET['id'])) {
    $id_socio = $_GET['id'];
    $registro = new SociosController;
    $socio = $registro->obtenerSocioPorId($id_socio);
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $id_socio = $_POST['id_socio'];
    $nombre = $_POST['nombre'];
    $apellido = $_POST['apellido'];
    $email = $_POST['email'];
    $telefono = $_POST['telefono'];
    $fecha_nacimiento = $_POST['fecha_nacimiento'];
    
    $editar = new SociosController;
    $cambio = $editar->actualizarSocio($id_socio, $nombre, $apellido, $email, $telefono, $fecha_nacimiento);
    header("Location: lista_socios.php");
    exit();
}
?>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Editar socio</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Editar socio</h1>
        <form action="editar_socio.php?id=<?= htmlspecialchars($socio['id_socio']) ?>" method="POST">
            <div class="mb-3">
                <input type="hidden" class="form-control" id="id_socio" name="id_socio" value="<?= htmlspecialchars($socio['id_socio']) ?>">
            </div>
            <div class="mb-3">
                <label for="nombre" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" value="<?= htmlspecialchars($socio['nombre']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="apellido" class="form-label">Apellido</label>
                <input type="text" class="form-control" id="apellido" name="apellido" value="<?= htmlspecialchars($socio['apellido']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="correo" class="form-label">Correo</label>
                <input type="email" class="form-control" id="email" name="email" value="<?= htmlspecialchars($socio['email']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="telefono" class="form-label">Teléfono</label>
                <input type="text" class="form-control" id="telefono" name="telefono" value="<?= htmlspecialchars($socio['telefono']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="fecha_nacimiento" class="form-label">Fecha Nacimiento</label>
                <input type="date" class="form-control" id="fecha_nacimiento" name="fecha_nacimiento" value="<?= htmlspecialchars($socio['fecha_nacimiento']) ?>" required>
            </div>
            <button type="submit" class="btn btn-warning">Guardar cambio</button>
            <a href='lista_socios.php' class="btn btn-secondary" role="button">Volver</a>
            </div>
        </form>
    </div>
</body>
</html>