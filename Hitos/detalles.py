from bdd_hito import conectar

# Hacemos un CRUD.

def crear_detalles (id_producto, id_compra):
    # Insertar un nuevo detalle en la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Insert into detalles (id_producto, id_compra) values (%s, %s)"""
    cursor.execute(consulta,(id_producto, id_compra))
    conexion.commit()
    cursor.close()
    conexion.close()

def leer_detalles ():
    # Lee todos los detalles de la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    cursor.execute("Select * from detalles")
    detalle = cursor.fetchall()
    cursor.close()
    conexion.close()
    return detalle

def actualizar_detalles (id_detalle, n_id_producto, n_id_compra):
    # Actualiza los datos del detalle
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Update detalles set id_producto = %s, id_compra = %s where id_detalle = %s"""
    cursor.execute(consulta,(n_id_producto, n_id_compra, id_detalle,))
    conexion.commit()
    cursor.close()
    conexion.close()

def eliminar_detalles (id_detalle):
    # Elimina el detalle de la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Delete from detalles where id_detalle = %s"""
    cursor.execute(consulta,(id_detalle,))
    conexion.commit()
    cursor.close()
    conexion.close()