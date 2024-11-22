from cliente import crear_clientes, leer_clientes, actualizar_clientes, eliminar_clientes
from entrenadores import crear_entrenadores, leer_entrenadores, actualizar_entrenadores, eliminar_entrenadores
from actividades import crear_actividades, leer_actividades, actualizar_actividades, eliminar_actividades
from inscripciones import crear_inscripciones, leer_inscripcines, actualizar_inscripciones, eliminar_inscripciones

def mostrar_menu_clientes():
    print("=== Gestión de Clientes ===")
    print("1. Registrar nuevo cliente ")
    print("2. Ver cliente ")
    print("3. Actualizar datos del cliente ")
    print("4. Eliminar cliente ")
    print("5. Volver")
    print("\n")

def mostrar_menu_entrenadores():
    print("=== Gestión de Entrenadores ===")
    print("1. Registrar nuevo entrenador ")
    print("2. Ver entrenadores")
    print("3. Actualizar datos del entrenador ")
    print("4. Eliminar entrenador ")
    print("5. Volver")
    print("\n")

def mostrar_menu_actividades():
    print("=== Gestión de Actividades ===")
    print("1. Registrar nueva actividad ")
    print("2. Ver actividades")
    print("3. Actualizar datos de las actividades ")
    print("4. Eliminar actividad ")
    print("5. Volver")
    print("\n")

def mostrar_menu_inscripciones():
    print("=== Gestión de Inscripciones ===")
    print("1. Registrar nueva inscripción ")
    print("2. Ver inscripciones")
    print("3. Actualizar datos de las inscripciones ")
    print("4. Eliminar inscripción ")
    print("5. Volver")
    print("\n")

def ejecutar_opciones_c(opcion):
    if opcion == 1:
        nombre = input("Ingrese el nombre del nuevo cliente: ")
        edad = input("Ingrese su edad: ")
        tipo_membresia = input("Ingrese el tipo de membresia ('Mensual','Trimestral'o 'Anual'): ")
        crear_clientes(nombre, edad, tipo_membresia)
        print("Cliente creada.")

    elif opcion == 2:
        print("\n Listado de clientes: \n")
        clientes = leer_clientes()
        for id_cliente, nombre, edad, tipo_membresia in clientes:
            print(f"ID cliente: {id_cliente}, Nombre: {nombre}, Edad:{edad}, Tipo de membresia: {tipo_membresia}")

    elif opcion == 3:
        id_cliente = int(input("Ingrese la ID del cliente a actualizar: "))
        n_nombre = input("Ingrese el nuevo nombre del cliente: ")
        n_edad = int(input("Ingrese la edad del nuevo cliente: "))
        n_tipo_membresia = input("Ingrese el tipo de membresia del cliente ('Mensual','Trimestral'o 'Anual'): ")
        actualizar_clientes(id_cliente, n_nombre, n_edad, n_tipo_membresia)
        print("Cliente actualizada.")

    elif opcion == 4:
        id_cliente = int(input("Ingrese la ID a eliminar del cliente: "))
        eliminar_clientes(id_cliente)
        print("Cliente eliminada.")

    elif opcion == 5:
        print("Saliendo de la tabla cliente.")
        return False

    else:
        print("Opcion inválida, por favor seleccione una de las opciones del menu.")
    return True

def ejecutar_opciones_e(opcion):
    if opcion == 1:
        nombre_entrenador = input("Ingrese el nombre del entrenador: ")
        especialidad = input("Ingrese la especialidad del entrenador: ")
        crear_entrenadores(nombre_entrenador, especialidad)
        print("Entrenador creada en la base de datos")

    elif opcion == 2:
        print("\n Listado de entrenadores \n")
        entrenadores = leer_entrenadores()
        for id_entrenador, nombre_entrenador, especialidad in entrenadores:
            print(f"ID entrenador: {id_entrenador}, Nombre: {nombre_entrenador}, Especialidad: {especialidad}")

    elif opcion == 3:
        n_nombre_entrenador = input("Ingrese el nuevo nombre del entrenador: ")
        n_especialidad = input("Ingrese la nueva especialidad del entrenador: ")
        actualizar_entrenadores(n_nombre_entrenador, n_especialidad, id_entrenador)
        print("Los datos del entrenador han sido actualizados.")

    elif opcion == 4:
        id_entrenador = int(input("Ingrese la ID del entrenador a eliminar: "))
        eliminar_entrenadores(id_entrenador)
        print("Entrenador eliminado de la BBD.")

    elif opcion == 5:
        print("Saliendo de la tabla de entrenadores")
        return False

    else:
        print("Opción inválida, porfavor elija una de las opciones mostradas.")
    
    return True

def ejecutar_opciones_a(opcion):
    if opcion == 1:
        nombre_actividad = input("Ingrese el nombre de la actividad: ")
        horario = input("Ingrese el horario de la actividad: ")
        duracion = int(input("Ingrese la duración de la actividad: "))
        id_entrenador = int(input("Ingrese la ID del entrenador: "))
        crear_actividades(nombre_actividad, horario, duracion, id_entrenador)
        print("Actividad creada en la base de datos")

    elif opcion == 2:
        print("\n Listado de actividades \n")
        actividades = leer_actividades()
        for id_actividad, nombre_actividad, horario, duracion, id_entrenador in actividades:
            print(f"ID actividad: {id_actividad}, Nombre: {nombre_actividad}, Horario: {horario}, Duracion: {duracion}, ID Entrenador {id_entrenador}")

    elif opcion == 3:
        n_nombre_actividad = input("Ingrese el nuevo nombre de la actividad: ")
        n_horario = input("Ingrese el nuevo horario de la actividad: ")
        n_duracion = int(input("Ingrese la nueva duración de la actividad: "))
        n_id_entrenador = int(input("Ingrese el nuevo ID del entrenador: "))
        actualizar_actividades(n_nombre_actividad, n_horario, n_duracion, n_id_entrenador, id_actividad)
        print("Los datos de la actividad han sido actualizados.")

    elif opcion == 4:
        id_actividad = int(input("Ingrese la ID de la actividad a eliminar: "))
        eliminar_actividades(id_actividad)
        print("Actividadd eliminado de la BBD.")

    elif opcion == 5:
        print("Saliendo de la tabla de actividades")
        return False

    else:
        print("Opción inválida, porfavor elija una de las opciones mostradas.")
    
    return True

def ejecutar_opciones_i(opcion):
    if opcion == 1:
        id_cliente = int(input("Ingrese la ID de el cliente: "))
        id_actividad = int(input("Ingrese la ID de la actividad: "))
        crear_inscripciones(id_cliente, id_actividad)
        print("Inscripcion creada en la base de datos")

    elif opcion == 2:
        print("\n Listado de inscripciones \n")
        inscripciones = leer_inscripcines()
        for id_inscripcion, id_cliente, id_actividad in inscripciones:
            print(f"ID inscripciones: {id_inscripcion}, ID cliente: {id_cliente}, ID actividad: {id_actividad}")

    elif opcion == 3:
        n_id_cliente = int(input("Ingrese la nueva ID del cliente: "))
        n_id_actividad = int(input("Ingrese la nueva ID de la actividad: "))
        actualizar_entrenadores(n_id_cliente, n_id_actividad, id_inscripcion)
        print("Los datos de las inscripciones han sido actualizados.")

    elif opcion == 4:
        id_inscripcion = int(input("Ingrese la ID de la inscripcion a eliminar: "))
        eliminar_entrenadores(id_inscripcion)
        print("Inscripcion eliminado de la BBD.")

    elif opcion == 5:
        print("Saliendo de la tabla de inscripcion")
        return False

    else:
        print("Opción inválida, porfavor elija una de las opciones mostradas en la tabla.")
    
    return True