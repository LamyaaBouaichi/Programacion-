import math

numeros = [4, 9, 16, 25, 36]

def raiz_cuadrada (numero):

    return math.sqrt(numero)

raices = map(raiz_cuadrada, numeros)
print(list(raices))