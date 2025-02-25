<?php
session_start();
if (isset($_SESSION['id_usuario'])) {
    header("Location: vista/lista_tareas.php");
    exit();
}
?>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Índex</title>
</head>
<body>
    <div class="container mt-4">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title text-center">Modo de registro</h5>
                <!-- Formulario de inicio de sesión -->
                <form method="POST" action="login.php">
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

                <div class="mb-3 text-center">
                    <a href="vista/registro.php" class="btn btn-secondary  w-100" role="button">Registrar Cuenta</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>