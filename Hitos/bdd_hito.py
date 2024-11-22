import mysql.connector

# Conexion en la base de datos de gestion para poder acceder a ella.

def conectar ():
    conexion = mysql.connector.connect(
        host = "localhost",
        username = "curso",
        password = "root",
        database = "gestion",
    )
    return conexion