# Faça uma função calculadora que os números e as operações serão 
# feitas pelo usuário. O código deve ficar rodando infinitamente até que
# o usuário escolha a opção de sair. No início, o programa mostrará a seguinte lista de operações:
# 1: Soma
# 2: Subtração
# 3: Multiplicação
# 4: Divisão
# 0: Sair

# Digite o número para a operação correspondente e caso o usuário introduza qualquer outro, 
# o sistema deve mostrar a mensagem “Essa opção não existe” e voltar ao menu de opções.
# Após a seleção, o sistema deve pedir para o usuário inserir o primeiro e segundo valor,
# um de cada. Depois precisa executar a operação e mostrar o resultado na tela. 
# Quando o usuário escolher a opção “Sair”, o sistema irá parar. 
# É necessário que o sistema mostre as opções sempre que finalizar uma operação e mostrar o resultado. 
    
num1 = float(input("Digite o primeiro número:"))
num2 = float(input("Digite o segundo número:"))
operação = input("Digite o número desejado para realizar a operação 1 (+), 2 (-), 3 (*), 4 (/) ou 0 (sair) : ")

if operação == "1 (+)":
    resultado = num1 + num2
elif operação == "2 (-)":
    resultado = num1 - num2
elif operação == "3 (*)":
    resultado = num1 * num2
elif operação == "4 (/)":
    resultado = num1 / num2
else:
    print("Essa opção não existe!")
    resultado = 0
print("Resultado: ", resultado)
    
