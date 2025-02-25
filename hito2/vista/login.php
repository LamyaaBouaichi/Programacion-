<?php
session_start();
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    require_once '../controlador/UsuariosController.php';
    $usuario = new UsuariosController();
    $usuario_iniciado = $usuario->inicioUsuario($_POST['correo'], $_POST['password']);

    if ($usuario_iniciado) {
        $_SESSION['usuario'] = $usuario_iniciado['nombre_user'];
        $_SESSION['id_usuario'] = $usuario_iniciado['id_user'];
        header("Location: lista_tareas.php");
        exit();
    } else {
        echo  "<div class='alert alert-danger'>Usuario o contraseña incorrectos</div>";
    }
}
?>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio de Sesión</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <div class="card mx-auto" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title text-center">Iniciar sesión</h5>
            <form method="POST" action="">
                <div class="mb-3">
                    <label for="correo" class="form-label">Correo</label>
                    <input type="email" class="form-control" name="correo" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Contraseña</label>
                    <input type="password" class="form-control" name="password" required>
                </div>
                <button type="submit" class="btn btn-primary w-100">Iniciar sesión</button>
            </form>
            <div class="mt-3 text-center">
                <a href="registro.php" class="btn btn-secondary w-100">Registrar Cuenta</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>