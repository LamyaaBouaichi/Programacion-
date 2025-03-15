print("--- Gasto mesual ---")

electricidad = float(input("Ingrese el gasto de la electricidad: "))
agua = float(input("Ingrese el gasto del agua: "))
gas = float(input("Ingrese el gasto del gas: "))
comida = float(input("Ingrese el gasto de la comida: "))

total = electricidad + agua + gas + comida

if total > 500:
    print("Estás gastando mucho")