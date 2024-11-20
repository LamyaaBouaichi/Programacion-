from bdd import conectar

def crear_actividades (nombre_actividad, horario, duracion, id_entrenador):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Insert into actividades (nombre_actividad, horario, duracion, id_entrenador) values (%s, %s, %s, %s)"""
    cursor.execute(consulta,(nombre_actividad, horario, duracion, id_entrenador,))
    conexion.commit()
    cursor.close()
    conexion.close()

def leer_actividades():
    conexion = conectar()
    cursor = conexion.cursor()
    cursor.execute("Select * from actividades")
    actividades = cursor.fetchall()
    cursor.close()
    conexion.close()
    
    return actividades

def actualizar_actividades (n_nombre_actividad, n_horario, n_duracion, n_id_entrenador, id_actividad ):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Update actividades nombre_actividad = %s, horario = %s, duracion = %s id_entrenador = %s where id_actividad = %s"""
    cursor.execute(consulta,(n_nombre_actividad, n_horario, n_duracion, n_id_entrenador, id_actividad,))
    conexion.commit()
    cursor.close()
    conexion.close()

def eliminar_actividades (id_actividad):
    conexion = conectar()
    cursor = conexion.cursor()
    consulta = """Delete actividades where id_actividad = %s"""
    cursor.execute(consulta,(id_actividad,))
    conexion.commit
    cursor.close()
    conexion.close()