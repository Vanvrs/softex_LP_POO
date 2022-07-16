# Desenvolva um programa que recebe do usuário nome completo e ano de nascimento que seja entre 1922 e 2021. 
# A partir dessas informações, o sistema mostrará o nome do usuário e a idade que completou, ou completará, 
# no ano atual (2022).

# Caso o usuário não digite um número ou apareça um inválido no campo do ano, o sistema informará 
# o erro e continuará perguntando até que um valor correto seja preenchido.



import datetime


nome = input ("Digite o Nome Completo: ")
ano = eval (input ("Digite o Ano de Nascimento: "))
mes = eval (input ("Digite o Mês de Nascimento: "))
dia = eval (input ("Digite o Dia de Nascimento: "))
ano_atual = eval (input ("Digite o Ano atual: "))
mes_atual = eval (input ("Digite o Mês atual: "))
dia_atual = eval (input ("Digite o Dia atual: "))
dataNasc = datetime.date(ano, mes, dia)
dataAtual = datetime.date(ano_atual, mes_atual, dia_atual)

# com timedelta é possível fazer a diferença 
diferenca = (dataAtual - dataNasc)
# Cálculos e Resultados.E, também, resultados proporcionais.
rslt = (diferenca.days / 365.25)
# No rslt subtraimos o ano atual com o ano de nascimento 

if (ano == ano_atual):
    print ("%s tem %d anos!" %(nome, rslt))
else:
    ((dia > dia_atual and mes == mes_atual) or mes < mes_atual)
    print ("%s tem %d anos!" %(nome, rslt))

# Dúvida: Não consegui utilizar apenas a diferença de um ano para o outro e não conseguir utilizar as exceções

# try:
    # ano = eval(input("Digite o Ano de Nasicmento: "))
# except ValueError:
    # print("Oops! Encontramos erros, repita novamente...")

