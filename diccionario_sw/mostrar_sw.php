<?php

include_once("connection.php");
$jsonArray = array();
$consulta = "SELECT * FROM tbl_palabra";
$resultado = mysqli_query($connection, $consulta) or die ("Error " . mysqli_error($connection));

if (mysqli_num_rows($resultado) > 0) {

    while ($registro = mysqli_fetch_array($resultado)) {
    $jsonArray["tbl_palabra"][] = $registro;
    }
    echo json_encode($jsonArray);
    mysqli_close($connection);
}
else {
    $resultadoVacio["id_palabra"] = "...";
    $resultadoVacio["nombre_palabra"] = "...";
        $resultadoVacio["significado_palabra"] = "...";
        $jsonArray["tbl_palabra"][] = $resultadoVacio;
        
    echo json_encode($jsonArray);
    mysqli_close($connection);
}



?>