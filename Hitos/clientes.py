from bdd_hito import conectar

# Hacemos un CRUD.

def crear_clientes (nombre, email, direccion):
    # Insertar un nuevo cliente en la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Insert into clientes (nombre, email, direccion) values (%s, %s, %s)"""
    cursor.execute(consulta,(nombre, email, direccion))
    conexion.commit()
    cursor.close()
    conexion.close()

def leer_clientes ():
    # Lee todos los clientes de la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    cursor.execute("Select * from clientes")
    cliente = cursor.fetchall()
    cursor.close()
    conexion.close()
    return cliente

def actualizar_clientes (id_cliente, n_nombre, n_email, n_direccion):
    # Actualiza los datos del cliente
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Update clientes set nombre = '%s', email = '%s', direccion = '%s' where id_cliente = %s"""
    cursor.execute(consulta,(n_nombre, n_email, n_direccion, id_cliente,))
    conexion.commit()
    cursor.close()
    conexion.close()

def eliminar_clientes (id_cliente):
    # Elimina el cliente de la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Delete from clientes where id_cliente = %s"""
    cursor.execute(consulta,(id_cliente,))
    conexion.commit()
    cursor.close()
    conexion.close()