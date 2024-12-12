from bdd import conectar

def crear_clientes(nombre, edad, tipo_membresia):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Insert into clientes (nombre, edad, tipo_membresia) values (%s, %s, %s)"""
    cursor.execute(consulta, (nombre, edad, tipo_membresia))
    conexion.commit()
    cursor.close()
    conexion.close()

def leer_clientes ():
    conexion = conectar()
    cursor = conexion.cursor()
    cursor.execute("select * from clientes")
    clientes = cursor.fetchall()
    cursor.close()
    conexion.close()

    return clientes

def actualizar_clientes(id_cliente, n_nombre, n_edad, n_tipo_membresia):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Update clientes set nombre = '%s', edad = %s, tipo_membresia = '%s' where id_cliente = %s"""
    cursor.execute(consulta, (n_nombre, n_edad, n_tipo_membresia, id_cliente,))
    conexion.commit()
    cursor.close()
    conexion.close()

def eliminar_clientes(id_cliente):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Delete from clientes where id_cliente = %s"""
    cursor.execute(consulta,(id_cliente,))
    conexion.commit()
    cursor.close()
    conexion.close()