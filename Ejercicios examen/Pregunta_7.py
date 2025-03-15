import mysql.connector

def conectar ():
    conexion =  mysql.connector.connect(
        host = 'localhost',
        user = 'root',
        password = 'curso',
        database = 'tiendas',
    )
    return conexion

def crear_cliente (nombre, edad):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = 'Insert into clientes (nombre, edad) values (%s, %s)'
    cursor.execute(consulta, (nombre, edad,))
    conexion.commit()
    cursor.close()
    conexion.close()

def funcion_cliente ():
    nombre = input("Ingrese el nombre del nuevo cliente: ")
    edad = int(input("Ingrese la edad del nuevo cliente: "))
    crear_cliente(nombre, edad)
    print("Cliente creado")

if __name__ == "__main__":
    funcion_cliente()