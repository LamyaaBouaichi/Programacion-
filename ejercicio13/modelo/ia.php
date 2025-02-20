<?php

Class NuevaReceta {

    public function obtenerRecetasNuevas($nombre_receta) {
        $puerto = '8000';
        $url = "http://localhost:$puerto/v1/chat/completions";  


        $datos = array(
            "model"=> "llama-3.2-1b-instruct",
            "messages"=> 
            array(
                array("role"=> "system", "content"=> "Responde siempre en español"),
                array("role"=> "user", "content"=> "Dame unicamente los ingredientes de la receta $nombre_receta")
            ),
            "temperature"=> 0.7,
            "max_tokens"=> -1,
            "stream"=> false
        );


        $jsonDatos = json_encode($datos);

        $ch = curl_init($url);

        curl_setopt($ch, CURLOPT_POST, true);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
        curl_setopt($ch, CURLOPT_POSTFIELDS, $jsonDatos);

        curl_setopt($ch, CURLOPT_HTTPHEADER, array(
            'Content-Type: application/json',
            'Content-Length: ' . strlen($jsonDatos)
        ));


        $respuesta = curl_exec($ch);

        if (curl_errno($ch)) {
            echo 'Error en cURL: ' . curl_error($ch);
            return null;
        } else {
            $data = json_decode($respuesta, true);

            $message = $data['choices'][0]['message']['content'];
            echo $message;
            curl_close($ch);
            return $message;
        }
    }
}
?>
