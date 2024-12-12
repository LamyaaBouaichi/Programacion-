edades = [14, 21, 18, 30, 25]

def es_mayor_de_edad (edad):

    return edad > 18

mayor_edad = filter(es_mayor_de_edad, edades)
print(list(mayor_edad))