
# importando método sleep que suspende a execução por alguns segundos
# chamar a biblioteca
from time import sleep 
# imprimindo cabeçalho
print('</Atenção, perigo!>')
# pausa de 1 segundo (pausa de 01 segundo para não ficar corrido)
sleep(1)
print('ATENÇÃO INÍCIO DA CONTAGEM REGRESSIVA PARA EXPLOSÃO')
# laço que começa em 10 até 0 com passo -1 (contagem decrescente com decrescimo -1) )
for cont in range(10, -1, -1):
    # imprimindo o contador
    # variável contador
    # o print vai imprimir (mostrar a informação para o usuário)
    print(cont)
    # abaixo apresenta o tempo de pausa do sleep que será pausa de 1 segundo
    sleep(1)
# imprimindo as mensagens
# \n\n para pular para linha seguinte ao terminar 
print('BUMMM!',end='\n\n')

