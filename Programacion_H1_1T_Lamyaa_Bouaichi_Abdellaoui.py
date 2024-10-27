### HITO INDIVIDUAL DE PROGRAMACIÓN ###

##### Cuestión 1: Mostrar figuras por pantalla #####

# Iniciamos con un bucle while para repetir las veces que necesitamos

while True:
    # Introducimos un menu para que el usuario eliga unas de las opciones que hay
    menu = input("MENU \n 1- Cuadrado \n 2- Rectangulo \n 3- Salir \n")

    if menu == '1':
        # Si el usuario ha seleccionado la primera opción, le pediremos el valor del lado del cuadrado
        lado = int(input("Dime el lado del cuadrado \n"))
        # Utilizo un bucle for para iterar cada lado veces y printamos una cadena de '*' por lado
        for i in range(lado):
            print('*' * lado)
        # Se hace el cálculo del area y perimetro y se muestra el resultado
        area = lado * lado
        perimetro = lado * 4
        print("Su area es", area)
        print("Su perimetro es", perimetro)

    elif menu == '2':
        # Si el usuario ha seleccionado la segunda opción, le pediremos el valor de la base y altura del rectangulo
        base = int(input("Dime la base del rectangulo \n"))
        altura = int(input("Dime la altura del rectangulo \n"))
        # Utilizo un bucle for y printamos una cadena de '*' formando un rectángulo
        for i in range (base):
            print('*' * altura)
        # Se hacen sus respectivos cálculos de su area y perimetro y mostrar el resultado
        area = base * altura
        perimetro = base * 2 + altura * 2
        print("Su area es", area)
        print("Su perimetro es", perimetro)

    elif menu == '3':
        # Si seleccionamos la tercera opción, se sale del bucle
        break

    else:
        # Si no es una de las tres primeras opciones, se imprimirá la frase de abajo
        print("Opción incorrecta, eliga otra opción")

def denuevo_menu (menu):
    if menu == '1':
        return True
    elif menu == '2':
        return True
    elif menu == '3':
        return True
    else:
        return False


##### Cuestión 2: Juego de piedra, papel o tijeras #####

# Se generan números aleatorios e iniciamos el contador
import random

contador = 0

contador_perdidas = 0

# Iniciamos un bucle while para repetir las veces que hagan falta
while True:
    # Se le dice al usuario que elija una de las tres opciones
    jugador = int(input("Elije 1-Piedra | 2-Papel | 3-Tijeras \n"))
    maquina = random.randint(1,3)

    # Se introduce las condiciones posibles de cada jugada del juego
    # En el caso que gane, se suma una victoria en el contador
    if jugador == 1 and maquina == 1:
        print("El jugador ha elegido piedra")
        print("La maquina ha elegido piedra")
        print("Habeis empatado")

    elif jugador == 2 and maquina == 1:
        contador += 1
        print("El jugador ha elegido papel")
        print("La maquina ha elegido piedra")
        print("Has ganado!! :)")

    elif jugador == 3 and maquina == 1:
        contador_perdidas += 1
        print("El jugador ha elegido tijeras")
        print("La maquina ha elegido piedra")
        print("Has perdido!! :(")

    elif jugador == 1 and maquina == 2:
        contador_perdidas += 1
        print("El jugador ha elegido piedra")
        print("La maquina ha elegido papel")
        print("Has perdido!! :(")

    elif jugador == 2 and maquina == 2:
        print("El jugador ha elegido papel")
        print("La maquina ha elegido papel")
        print("Habeis empatado")

    elif jugador == 3 and maquina == 2:
        contador += 1
        print("El jugador ha elegido tijeras")
        print("La maquina ha elegido papel")
        print("Has ganado!! :)")

    elif jugador == 1 and maquina == 3:
        contador += 1
        print("El jugador ha elegido piedra")
        print("La maquina ha elegido tijeras")
        print("Has ganado!! :)")

    elif jugador == 2 and maquina == 3:
        contador_perdidas += 1
        print("El jugador ha elegido papel")
        print("La maquina ha elegido tijeras")
        print("Has perdido!! :(")

    elif jugador == 3 and maquina == 3:
        print("El jugador ha elegido tijeras")
        print("La maquina ha elegido tijeras")
        print("Habeis empatado")
    # Si no ha elegido una de las tres opciones, le indicamos al usuario que elija una de las opciones que estén disponible
    else:
        print("Elección incorrecta")

    # Se imprime el número de victorias y/o pérdidas que haya obtenido
    print(f"Victorias ganadas: {contador}")
    print(f"Partida(s) perdidas: {contador_perdidas}")

    # Si ya ha obtenido las tres victorias el jugador, se acaba el bucle
    if contador == 3:
        print("Has ganado 3 partidas, el jugador gana")
        break
    # Si el jugador obtiene 3 partidas perdidas, se acaba el bucle
    elif contador_perdidas == 3:
        print("Has perdido 3 partidas, el jugador pierde")
        break


##### Cuestion 3: Simular el funcionamiento de una cuenta bancaria #####


# Se les pone un valor incial a el saldo, a la entrada y a la salida

saldo = float
saldo = 0

saldo_ingresado = 0

saldo_retirado = 0

# Iniciamos el programa con un bucle while para repetir las veces que el usuario necesite

while True:
    # Le indicamos al usuario que elija una de las opciones dadas en el menu
    menu_cuenta = int(input("MENU \n 1-Ingresar dinero \n 2-Retirar dinero \n 3-Mostrar saldo \n 4-Salir \n 5-Estadísticas\n"))

    # En el caso que el usuario no elija una de las opciones dadas, se le imprimira que elija otra vez las opciones del menu

    if menu_cuenta not in [1,2,3,4,5]:
        print("Eleción no reconocida, porfavor elija una de las opciones que salga en el menu")

    # Si el usuario elije la primera opcion, se le imprimira que ingrese el dinero a la cuenta

    elif menu_cuenta == 1:
        ingresos=float(input("Ingrese la cantidad de dinero que desees: "))
        if ingresos > 0:
            saldo += ingresos
            saldo_ingresado += 1
            print(f"Has ingresado una cantidad de {ingresos} €")
        # Si ingresa una cantidad menor a 0, el programa le dirá que no puede ingresar números negativos
        else:
           print("No se pueden ingresar números negativos a la cuenta") 

        # En el caso que elija la segunda opción, el programa le dirá que retire la cantidad de saldo deseado

    elif menu_cuenta == 2:
        retirada = float(input("Retire la cantidad deseada: "))
        if retirada > 0:
            saldo -= retirada
            saldo_retirado +=1
            print(f"Has retirado una cantidad de {retirada} €")
        elif saldo_retirado > saldo:
            print("Tienes en el banco una cantidad insuficiente de dinero ")
        else:
            print("No puedes retirar una cantidad de dinero mayor de su saldo disponible")

        # Si el usuario elije la tercera opción, se le mostrará su saldo actual
    
    elif menu_cuenta == 3:
        print(f"Tienes una cantidad de saldo de {saldo} €")

        # Si elije la cuarta opción, sale del bucle

    elif menu_cuenta == 4:
        print("Has salido del banco")
        break

    # Si elije la última opción, saldrán las estadisticas de las veces ingresadas o retiradas el saldoSS
    
    elif menu_cuenta == 5:
        print(f"Número de veces ingresado el  dinero: {saldo_ingresado}")
        print(f"Número de veces retirado el dinero: {saldo_retirado}")
    else: 
        print("Eleción no reconocida, porfavor elija una de las opciones que salgan en el menu")