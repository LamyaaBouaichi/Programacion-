from bdd import conectar

def crear_inscripciones (id_cliente, id_actividad):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Insert into inscripciones (id_cliente, id_actividad) values (%s, %s)"""
    cursor.execute(consulta,(id_cliente, id_actividad,))
    conexion.commit()
    cursor.close()
    conexion.close()

def leer_inscripcines ():
    conexion = conectar()
    cursor = conexion.cursor()
    cursor.execute("Select * from inscripciones")
    inscripciones = cursor.fetchall()
    cursor.close
    conexion.close
    
    return inscripciones

def actualizar_inscripciones (n_id_cliente, n_id_actividad, id_inscripcion):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Update inscripciones id_cliente = %s, id_actividad = %s where id_inscripcion = %s"""
    cursor.execute(consulta,(n_id_cliente, n_id_actividad, id_inscripcion,))
    conexion.commit()
    cursor.close()
    conexion.close()

def eliminar_inscripciones (id_inscripcion):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Delete inscripciones where id_inscripcion = %s"""
    cursor.execute(consulta,(id_inscripcion,))
    conexion.commit()
    cursor.close()
    conexion.close()