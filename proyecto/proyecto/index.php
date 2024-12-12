<?php

$encabezado = file_get_contents("vistas/encabezado.html");
$pie =file_get_contents("vistas/pie.html");

$archivoCSV = fopen("datos.csv","r");
$tabla = 
"<table><thread><tr><th>ID</th><th>Nombre</th><th>Correo</th><th>Teléfono</th></tr></thead><tbody>";

while(($fila = fgetcsv($archivoCSV))!==false) {
    if ($fila[0]!=="ID") {
        $tabla .="<tr><td>{$fila[0]}</td><td>{$fila[1]}</td><td>{$fila[2]}</td><td>{$fila[3]}</td></tr>";
    }
}

$tabla .="</tbody></table>";
fclose($archivoCSV);

echo $encabezado .$tabla .$pie;
?>