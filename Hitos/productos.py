from bdd_hito import conectar

# Hacemos un CRUD.

def crear_productos (nombre, descripcion, precio, stock):
    # Insertar un nuevo producto en la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Insert into productos (nombre, descripcion, precio, stock) values (%s, %s, %s, %s)"""
    cursor.execute(consulta,(nombre, descripcion, precio, stock))
    conexion.commit()
    cursor.close()
    conexion.close()

def leer_productos ():
    # Lee todos los productos de la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    cursor.execute("Select * from productos")
    producto = cursor.fetchall()
    cursor.close()
    conexion.close()
    return producto

def actualizar_productos (id_producto, n_nombre, n_descripcion, n_precio, n_stock):
    # Actualiza los datos del producto
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Update productos set nombre = '%s', descripcion = '%s', precio = %s, stock = %s where id_producto = %s"""
    cursor.execute(consulta,(n_nombre, n_descripcion, n_precio, n_stock, id_producto,))
    conexion.commit()
    cursor.close()
    conexion.close()

def eliminar_productos (id_producto):
    # Elimina el producto de la tabla
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Delete from productos where id_producto = %s"""
    cursor.execute(consulta,(id_producto,))
    conexion.commit()
    cursor.close()
    conexion.close()