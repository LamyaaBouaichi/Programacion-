from funciones_bdd import mostrar_menu_clientes, mostrar_menu_productos, mostrar_menu_compras, mostrar_menu_detalles, ejecutar_opciones_1, ejecutar_opciones_2, ejecutar_opciones_3, ejecutar_opciones_4

# Función principal del programa.
def main ():
    continuar = True
    while continuar:
        print("Gestión de compra online")
        print("1. Clientes")
        print("2. Productos")
        print("3. Compras")
        print("4. Detalles")
        print("5. Salir")
        print("\n")
        opciones = int(input("Ingrese la opción que desee realizar: "))
        try:
            if opciones == 1:
                mostrar_menu_clientes()
                try:
                    opcion = int(input("Seleccione una de las opciones: "))
                    continuar = ejecutar_opciones_1(opcion)

                except ValueError:
                    print("Ingresa una opción válida")

            elif opciones == 2:
                mostrar_menu_productos()
                try:
                    opcion = int(input("Seleccione una de las opciones: "))
                    continuar = ejecutar_opciones_2(opcion)

                except ValueError:
                    print("Ingresa una opción válida")

            elif opciones == 3:
                mostrar_menu_compras()
                try:
                    opcion = int(input("Seleccione una de las opciones: "))
                    continuar = ejecutar_opciones_3(opcion)

                except ValueError:
                    print("Ingresa una opción válida")

            elif opciones == 4:
                mostrar_menu_detalles()
                try:
                    opcion = int(input("Seleccione una de las opciones: "))
                    continuar = ejecutar_opciones_4(opcion)

                except ValueError:
                    print("Ingresa una opción válida")

            elif opciones == 5:
                print("Saliendo de la BDD de la aplicación online.")
                return False
            
            else:
                print("Tabla no seleccionada, introduce una de las opciones de la tabla.")

        except ValueError:
            ("Seleccione una de las opciones de el menú.")

if __name__ == "__main__":
    main()