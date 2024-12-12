numeros = [8, 15, 22]

def es_par (numero):

    return numero % 2 == 0
        
numero_par = filter(es_par, numeros)
print(list(numero_par))