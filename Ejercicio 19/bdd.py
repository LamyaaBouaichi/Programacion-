import mysql.connector

def conectar():
    conexion = mysql.connector.connect(
        host = "localhost",
        username = "root",
        password = "curso",
        database = "centro_deportivo",
    )
    return conexion