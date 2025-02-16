<?php
session_start();

if ($_POST['usuario'] == 'admin_user' && $_POST['password'] == '' && $_POST['rol'] == 'admin') {
    $_SESSION['usuario'] = 'admin_user';
    header("Location: lista_socios.php");
} else {
    echo  "Usuario o contraseña incorrectos.";
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <form method="post">
        Usuario: <input type="text" name="usuario"><br>
        Contraseña: <input type="password" name="password"><br>
        Rol: <input type="text" name="rol"><br>
        <input type="submit" value="Iniciar Sesión">
    </form>
</body>
</html>
