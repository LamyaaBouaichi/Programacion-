from bdd import conectar

def crear_entrenadores(nombre_entrenador, especialidad):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Insert into entrenadores (nombre_entrenador, especialidad) values (%s, %s) """
    cursor.execute(consulta, (nombre_entrenador, especialidad,))
    conexion.commit()
    cursor.close()
    conexion.close()

def leer_entrenadores():
    conexion = conectar()
    cursor = conexion.cursor()
    cursor.execute("""Select * from entrenadores""")
    entrenadores = cursor.fetchall()
    cursor.close()
    conexion.close()
    
    return entrenadores

def actualizar_entrenadores(n_nombre_entrenador, n_especialidad, id_entrenador):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Update entrenadores nombre_entrenador = %s, especialidad = %s where id_entrenador = %s"""
    cursor.execute(consulta, (n_nombre_entrenador, n_especialidad, id_entrenador,))
    conexion.commit()
    cursor.close()
    conexion.close()

def eliminar_entrenadores(id_entrenador):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Delete entrenadores where id_entrenador = %s"""
    cursor.execute(consulta,(id_entrenador,))
    conexion.commit()
    cursor.close()
    conexion.close()