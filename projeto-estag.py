def verifica_fibonacci(numero):
    a = 0
    b = 1
    while b < numero:
        a, b = b, a + b
    if b == numero:
        return f'O número {numero} pertence à sequência de Fibonacci.'
    else:
        return f'O número {numero} não pertence à sequência de Fibonacci.'

while True: 
    numero = (int(input("Informe o seu número (ou digite 1234 para sair):  ")))
    if numero == 1234:
        break
    print(verifica_fibonacci(numero))
