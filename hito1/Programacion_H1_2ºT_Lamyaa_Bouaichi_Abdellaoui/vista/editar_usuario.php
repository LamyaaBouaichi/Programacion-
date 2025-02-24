<?php
require_once '../controlador/UsuarioController.php';

if(isset($_GET['id'])) {
    $id_usuario = $_GET['id'];

    $registro = new UsuarioController();
    $usuario = $registro->obtenerUsuarioPorId($id_usuario);
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $id_usuario = $_POST['id_usuario'];
    $nombre = $_POST['nombre'];
    $email = $_POST['email'];
    $edad = $_POST['edad'];
    $plan_base = $_POST['plan_base'];
    $paquete_ad = $_POST['paquete_ad'];
    $duracion = $_POST['duracion'];
    $coste_total = $_POST['coste_total'];
    $fecha_alta = $_POST['fecha_alta'];
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Editar usuario</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Editar usuario</h1>
        <form method="POST" action="editar_usuario.php?id=<?= htmlspecialchars($usuario['id_usuario']) ?>">
            <div>
                <input type="hidden" class="form-control" id="id_usuario" name="id_usuario" value="<?= htmlspecialchars($usuario['id_usuario']) ?>">
            </div>
            <div class="mb-3">
                <label for="nombre" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" value="<?= htmlspecialchars($usuario['nombre']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" name="email" value="<?= htmlspecialchars($usuario['email']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="edad" class="form-label">Edad</label>
                <input type="text" class="form-control" id="edad" name="edad" value="<?= htmlspecialchars($usuario['edad']) ?>" required>
            </div>
            <div class="input-group mb-3">
                <label for="plan_base" class="input-group-text">Plan</label>
                <select class="form-select" id="plan_base" value="<?= htmlspecialchars($usuario['plan_base']) ?>">
                    <option value="1"></option>
                    <option value="2">Básico</option>
                    <option value="3">Estandar</option>
                    <option value="4">Premium</option>
                </select>
            </div>
            <div class="input-group mb-3">
                <label for="paquete_ad" class="input-group-text">Tipo de paquete</label>
                <select class="form-select" id="paquete_ad" value="<?= htmlspecialchars($usuario['paquete_ad']) ?>">
                    <option value="1"></option>
                    <option value="2">Deporte</option>
                    <option value="3">Cine</option>
                    <option value="4">Infantil</option>
                </select>
            </div>
            <div class="input-group mb-3">
                <label for="duracion" class="input-group-text">Duración</label>
                <select class="form-select" id="duracion" value="<?= htmlspecialchars($usuario['duracion']) ?>">
                    <option value="1"></option>
                    <option value="2">Mensual</option>
                    <option value="3">Anual</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="coste_total" class="form-label">Coste</label>
                <input type="number" class="form-control" id="coste_total" name="coste_total" value="<?= htmlspecialchars($usuario['coste_total']) ?>" required>
            </div>
            <div class="mb-3">
                <label for="fecha_alta" class="form-label">Fecha</label>
                <input type="date" class="form-control" id="fecha_alta" name="fecha_alta" value="<?= htmlspecialchars($usuario['fecha_alta']) ?>" required>
            </div>
            <div class="mb-3">
                <button type="submit" class="btn btn-primary">Guardar</button>
                <a href="lista_usuarios.php" class="btn btn-secondary">Volver</a>
            </div>
        </form>
    </div>
</body>
</html>