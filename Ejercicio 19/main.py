from funciones import mostrar_menu_clientes, mostrar_menu_actividades, mostrar_menu_entrenadores, mostrar_menu_inscripciones, ejecutar_opciones_c, ejecutar_opciones_e, ejecutar_opciones_a, ejecutar_opciones_i

def main ():
    continuar = True
    while continuar:
        print("=== Gestión del Centro Deportivo ===")
        print("1. Gestión de Clientes")
        print("2. Gestión de Entrenadores")
        print("3. Gestión de Actividades")
        print("4. Gestión de Inscripciones")
        print("5. Salir")
        opciones = int(input("Seleccione una de las tablas de la BDD de Centro Deportivo: "))
        try:
            while True:
                if opciones == 1:
                    mostrar_menu_clientes()
                    try:
                        opcion = int(input("Seleccione una de las opciones: "))
                        continuar = ejecutar_opciones_c(opcion)

                    except ValueError:
                        print("Ingrese una opción válida. ")
                elif opciones == 2:
                    mostrar_menu_entrenadores()
                    try:
                        opcion = int(input("Seleccione una de las opciones: "))
                        continuar = ejecutar_opciones_e(opcion)

                    except ValueError:
                        print("Ingrese una opción válida. ")

                elif opciones == 3:
                    mostrar_menu_actividades()
                    try:
                        opcion = int(input("Seleccione una de las opciones: "))
                        continuar = ejecutar_opciones_a(opcion)

                    except ValueError:
                        print("Ingrese una opción válida. ")

                elif opciones == 4:
                    mostrar_menu_inscripciones()
                    try:
                        opcion = int(input("Seleccione una de las opciones: "))
                        continuar = ejecutar_opciones_i(opcion)

                    except ValueError:
                        print("Ingrese una opción válida. ")

                elif opciones == 5:
                    print ("Saliendo de la BDD")
                    return False

                else:
                    print("Tabla no seleccionada, porfavor introduce una de las opciones")

                return True
                   
        except ValueError:
            print("Ingrese una de las opciones. ")

if __name__ == "__main__":
    main()


def main ():
    continuar = True
    while continuar:
        mostrar_menu_clientes()
        try:
            opcion = int(input("Seleccione una de las opciones: "))
            continuar = ejecutar_opciones_c(opcion)

        except ValueError:
            print("Ingrese una de las opciones. ")

if __name__ == "__main__":
    main()