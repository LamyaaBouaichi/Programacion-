import mysql.connector

def conectar ():
    conexion =  mysql.connector.connect(
        host = 'localhost',
        user = 'root',
        password = 'curso',
        database = 'tiendas',
    )
    return conexion

def clientes_mayores_25 ():
    conexion = conectar()
    cursor = conexion.cursor()
    cursor.execute("select * from clientes where edad > 25")
    clientes = cursor.fetchall()
    cursor.close()
    conexion.close()
    return clientes

def funcion_clientes_25 ():
    clientes = clientes_mayores_25()
    for id_cliente, nombre, edad in clientes:
        print(f"ID: {id_cliente}, Nombre: {nombre} Edad: {edad}")

