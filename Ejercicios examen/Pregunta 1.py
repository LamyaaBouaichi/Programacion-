import numpy as np

numeros = [5, 15, 25, 35, 45]

numeros_mayores = []

promedio = np.mean(numeros)
print(promedio)

for i in numeros:
    if i > promedio:
        numeros_mayores.append(i)
        print(list(numeros_mayores))