<?php
require_once("modelo/tablas.php");

$encabezado = file_get_contents("vistas/encabezado.html");
$pie = file_get_contents("vistas/pie.html");

$opcion = $_GET['opcion'] ?? 'clientes';

if ($opcion === 'clientes') {
    $contenido = generarTabla("datos/clientes.csv");
} elseif ($opcion === 'articulos') {
    $contenido = generarTabla("datos/articulos.csv");
} else {
    $contenido = "<p>Opción no válida</p>";
}

echo $encabezado . $contenido . $pie;
?>
