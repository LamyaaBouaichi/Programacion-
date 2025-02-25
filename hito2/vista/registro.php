<?php
session_start();

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    require_once '../controlador/UsuariosController.php';

    $controller = new UsuariosController();
    $controller->registrarUsuario($_POST['username'], $_POST['email'], $_POST['password']);
    header("Location: login.php");
    exit();
}
?>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <div class="card mx-auto" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title text-center">Crear una nueva cuenta</h5>
            <form method="POST" action="">
                <div class="mb-3">
                    <label for="username" class="form-label">Usuario</label>
                    <input type="text" class="form-control" name="username" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Correo electrónico</label>
                    <input type="email" class="form-control" name="email" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Contraseña</label>
                    <input type="password" class="form-control" name="password" required>
                </div>
                <button type="submit" class="btn btn-primary w-100">Registrar</button>
            </form>
            <?php if (isset($error_message)): ?>
                <div class="alert alert-danger mt-3"><?php echo $error_message; ?></div>
            <?php endif; ?>
            <div class="mt-3 text-center">
                <a href="login.php" class="btn btn-secondary w-100">Ya tengo cuenta</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>