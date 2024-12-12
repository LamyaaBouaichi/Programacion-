from clientes import crear_clientes, leer_clientes, actualizar_clientes, eliminar_clientes
from productos import crear_productos, leer_productos, actualizar_productos, eliminar_productos
from compras import crear_compras, leer_compras, actualizar_compras, eliminar_compras
from detalles import crear_detalles, leer_detalles, actualizar_detalles, eliminar_detalles

# Muestra el menu de cliente
def mostrar_menu_clientes():
    print("Tabla Clientes ")
    print("1. Registrar nuevo cliente ")
    print("2. Ver cliente ")
    print("3. Actualizar datos del cliente ")
    print("4. Eliminar cliente ")
    print("5. Volver")
    print("\n")

# Muestra el menu de producto
def mostrar_menu_productos():
    print("Tabla Productos ")
    print("1. Registrar nuevo producto ")
    print("2. Ver producto")
    print("3. Actualizar datos de los productos ")
    print("4. Eliminar producto ")
    print("5. Volver")
    print("\n")

# Muestra el menu de compra
def mostrar_menu_compras():
    print("Tabla Compras ")
    print("1. Registrar nueva compra ")
    print("2. Ver compra ")
    print("3. Actualizar datos de la compra ")
    print("4. Eliminar compra ")
    print("5. Volver")
    print("\n")

# Muestra el menu de detalle
def mostrar_menu_detalles():
    print("Tabla Detalles")
    print("1. Registrar nuevo detalle ")
    print("2. Ver detalle ")
    print("3. Actualizar datos del detalle ")
    print("4. Eliminar detalle ")
    print("5. Volver")
    print("\n")

# Ejecuta la primera opción del menú principal
def ejecutar_opciones_1(opcion):
    if opcion == 1:
        nombre = input("Ingrese el nombre del cliente: ")
        email =  input("Ingrese el email del cliente: ")
        direccion = input("Ingrese la direccion el cliente: ")
        crear_clientes(nombre, email, direccion)
        print("Cliente creada en la tabla.")

    elif opcion == 2:
        print("\n Lista de clientes \n")
        clientes = leer_clientes()
        for id_cliente, nombre, email, direccion in clientes:
            print(f"ID:{id_cliente}, Nombre: {nombre}, Email: {email}, Dirección: {direccion}")

    elif opcion == 3:
        id_cliente = int(input("Ingrese la ID a actualizar: "))
        n_nombre = input("Ingrese el nuevo nombre: ")
        n_email = input("Ingrese el nuevo email: ")
        n_direccion = input("Ingrese la nueva dirección: ")
        actualizar_clientes(n_nombre, n_email, n_direccion, id_cliente,)
        print("Datos del cliente actualizados.")

    elif opcion == 4:
        id_cliente = int(input("Ingrese la ID a eliminar"))
        eliminar_clientes(id_cliente)
        print("Cliente eliminado.")

    elif opcion == 5:
        print("Saliendo de la tabla.")
        return False
    
    else:
        print("Opción no válida, por favor elija una de las opciones del menú.")
    return True

# Ejecuta la segunda opción del menú principal
def ejecutar_opciones_2(opcion):
    if opcion == 1:
        nombre = input("Ingrese el nombre del producto: ")
        descripcion =  input("Ingrese la descripcion del producto: ")
        precio = int(input("Ingrese el precio del producto: "))
        stock = int(input("Ingrese la cantidad de productos: "))
        crear_productos(nombre, descripcion, precio, stock)
        print("Producto creada en la tabla.")

    elif opcion == 2:
        print("\n Lista de productos \n")
        productos = leer_productos()
        for id_producto, nombre, descripcion, precio, stock in productos:
            print(f"ID:{id_producto}, Nombre: {nombre}, Descripción: {descripcion}, Precio: {precio}, Stock: {stock}")

    elif opcion == 3:
        id_producto = int(input("Ingrese la ID a actualizar: "))
        n_nombre = input("Ingrese el nuevo nombre: ")
        n_descripcion = input("Ingrese la nueva descripción: ")
        n_precio = int(input("Ingrese el nuevo precio: "))
        n_stock = int(input("Ingrese el nuevo nº de stock: "))
        actualizar_clientes(n_nombre, n_descripcion, n_precio, n_stock,id_producto,)
        print("Datos del producto actualizados.")

    elif opcion == 4:
        id_producto = int(input("Ingrese la ID a eliminar"))
        eliminar_productos(id_producto)
        print("Producto eliminado.")

    elif opcion == 5:
        print("Saliendo de la tabla.")
        return False
    
    else:
        print("Opción no válida, por favor elija una de las opciones del menú.")
    return True

# Ejecuta la tercera opción del menú principal
def ejecutar_opciones_3(opcion):
    if opcion == 1:
        id_cliente = int(input("Ingrese la ID del cliente: "))
        fecha =  int(input("Ingrese la fecha de la compra: "))
        total = int(input("Ingrese la compra total: "))
        crear_compras(id_cliente, fecha, total)
        print("Compra creada en la tabla.")

    elif opcion == 2:
        print("\n Lista de compras \n")
        compras = leer_compras()
        for id_compra, id_cliente, fecha, total in compras:
            print(f"ID:{id_compra}, ID_cliente:{id_cliente}, Fecha:{fecha}, Total:{total}")

    elif opcion == 3:
        id_compra = int(input("Ingrese la ID a actualizar: "))
        n_id_cliente = int(input("Ingrese la ID del cliente: "))
        n_fecha = int(input("Ingrese la fecha de la compra: "))
        n_total = int(input("Ingrese el total: "))
        actualizar_compras(n_id_cliente, n_fecha, n_total, id_compra,)
        print("Datos de la compra actualizados.")

    elif opcion == 4:
        id_cliente = int(input("Ingrese la ID a eliminar"))
        eliminar_compras(id_compra)
        print("Compra eliminado.")

    elif opcion == 5:
        print("Saliendo de la tabla.")
        return False
    
    else:
        print("Opción no válida, por favor elija una de las opciones del menú.")
    return True

# Ejecuta la cuarta opción del menú principal
def ejecutar_opciones_4(opcion):
    if opcion == 1:
        id_producto = int(input("Ingrese la ID del producto"))
        id_compra = int(input("Ingrese la ID de la compra"))
        crear_detalles(id_producto, id_compra)
        print("Detalle creada en la tabla.")

    elif opcion == 2:
        print("\n Lista de detalles \n")
        detalles = leer_detalles()
        for id_detalle, id_producto, id_compra in detalles:
            print(f"ID:{id_detalle}, ID_producto: {id_producto}, ID_compra: {id_compra}")

    elif opcion == 3:
        id_detalle = int(input("Ingrese la ID a actualizar: "))
        id_producto = int(input("Ingrese la ID del producto: "))
        id_compra = int(input("Ingrese la ID de la compra: "))
        actualizar_detalles(id_producto, id_compra, id_detalle,)
        print("Datos del detalle actualizados.")

    elif opcion == 4:
        id_detalle = int(input("Ingrese la ID a eliminar"))
        eliminar_detalles(id_detalle)
        print("Detalle eliminado.")

    elif opcion == 5:
        print("Saliendo de la tabla.")
        return False
    
    else:
        print("Opción no válida, por favor elija una de las opciones del menú.")
    return True