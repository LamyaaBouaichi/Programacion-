from bdd_hito import conectar

# Hacemos un CRUD.

def crear_compras (id_cliente, fecha, total):
    # Insertar una nueva compra en la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Insert into compras (id_cliente, fecha, total) values (%s, %s, %s)"""
    cursor.execute(consulta,(id_cliente, fecha, total))
    conexion.commit()
    cursor.close()
    conexion.close()

def leer_compras ():
    # Lee todos las compras de la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    cursor.execute("Select * from compras")
    compra = cursor.fetchall()
    cursor.close()
    conexion.close()
    return compra

def actualizar_compras (id_compra, n_id_cliente, n_fecha, n_total):
    # Actualiza los datos de la compra
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Update compras set id_cliente = %s, fecha = '%s', total = %s where id_compra = %s"""
    cursor.execute(consulta,(n_id_cliente, n_fecha, n_total, id_compra))
    conexion.commit()
    cursor.close()
    conexion.close()

def eliminar_compras (id_compras):
    # Elimina la compra de la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Delete from compras where id_compras = %s"""
    cursor.execute(consulta,(id_compras,))
    conexion.commit()
    cursor.close()
    conexion.close()