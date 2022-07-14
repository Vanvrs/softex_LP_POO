# Faça uma função calculadora de dois números com três parâmetros: os dois primeiros serão os
# números da operação e o terceiro será a entrada que definirá a operação a ser executada. 
# Considera a seguinte definição:
# 1. Soma
# 2. Subtração
# 3. Multiplicação
# 4. Divisão
# Caso seja inserido um número de operação que não exista, o resultado deverá ser 0.

     
# num1 e num2 serão entradas de operação
# operação será exibirá os operadores para o usuário escolher a operação a ser executada
    
num1 = float(input("Digite o primeiro número:"))
num2 = float(input("Digite o segundo número:"))
operação = input("Digite a operação a realizar (+,-,* ou /):")
if operação == "+":
    resultado = num1 + num2
elif operação == "-":
    resultado = num1 - num2
elif operação == "*":
    resultado = num1 * num2
elif operação == "/":
    resultado = num1 / num2
else:
    print("Ocorreu um erro - Operação inválida!")
    resultado = 0
print("Resultado: ", resultado)
    
