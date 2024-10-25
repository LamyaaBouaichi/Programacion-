numeros=[4,9,16,25,1,7,12]

def numero_mayor_5(numero):
    return numero >= 5

mayor_que_5=filter(numero_mayor_5,numeros)

print(list(mayor_que_5))

###################################

alturas_metros = [1.60, 1.75, 1.80, 1.50]

def metros_a_centimetros(metros):
    return metros * 100

centimetros=map(metros_a_centimetros,alturas_metros)

print(list(centimetros))